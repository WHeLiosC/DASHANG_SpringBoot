package com.dashang.controller;

import com.dashang.MD5Util;
import com.dashang.model.Result;
import com.dashang.model.User;
import com.dashang.model.UserDomain;
import com.dashang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Value("${fileUploadPath}")
    private String fileUploadPath;

    @Autowired
    private UserService userService;

    @RequestMapping("/showAllUsers")
    public List<UserDomain> showAllUsers() {
        return userService.getUsers();
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        return userService.login(user);
    }

    @RequestMapping("/register")
    public Result register(@RequestBody User user) {
        return userService.register(user);
    }

    @RequestMapping("/modifyInfo")
    public Result modifyInfo(@RequestBody UserDomain ud) {
        return userService.modifyInfo(ud);
    }

    @RequestMapping("/getUserInfo")
    public Result getUserInfo(Integer userId){return userService.getUserInfo(userId);}

    @RequestMapping("/imgUpload")
    public Result imgUpload(HttpServletRequest req, MultipartHttpServletRequest multiReq)
            throws IOException {
        System.out.println("---" + fileUploadPath);

        Result res = new Result();
        res.setSuccess(false);
        res.setDetail(null);
        res.setMsg(null);

        MultipartFile file = multiReq.getFile("file");
        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.indexOf("."));
        String localFileName = MD5Util.md5(file.getInputStream()) + suffix;
        File localFile = new File(fileUploadPath + localFileName);
        if (!localFile.exists()) {
            localFile.createNewFile();

            FileOutputStream fos = new FileOutputStream(localFile);
            FileInputStream fis = (FileInputStream) multiReq.getFile("img").getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            fos.close();
            fis.close();
        } else {
            System.out.println("文件已经存在！");
        }

        res.setSuccess(true);
        res.setDetail("http://localhost:8080/img/" + localFileName);
        res.setMsg("上传成功！");
        return res;
    }

}

// @RequestMapping如果没有指定请求方式，将接收Get,Post,Head,Options等所有的请求方式。
// @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。 
// @PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。

// @CrossOrigin 解决跨域请求问题
