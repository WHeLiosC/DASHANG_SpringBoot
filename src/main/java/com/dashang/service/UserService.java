package com.dashang.service;

import com.dashang.mapper.UserMapper;
import com.dashang.model.Result;
import com.dashang.model.User;
import com.dashang.model.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UserDomain> getUsers() {
        return userMapper.getUser();
    }

    /**
     * @return Result 处理的结果信息，返回前端。登录成功 or 登录失败
     * @// TODO: 登录验证
     * @param: user 用户实体类
     */
    public Result<User> login(User user) {
        Result<User> res = new Result<>();
        res.setSuccess(false);
        res.setDetail(null);
        res.setMsg(null);
        try {
            User u = userMapper.login(user);
            if (u == null) {
                res.setMsg("用户名或密码错误，或用户类型错误！");
            } else {
                res.setMsg("登录成功！");
                res.setSuccess(true);
                u.setPassword("");  // 密码不需要再传回前端，也保证了安全
                res.setDetail(u);
            }
        } catch (Exception e) {
            res.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }

    /**
     * @param user 用户实体类
     * @return 处理的结果信息，返回前端。用户名已经存在 or 注册成功
     */
    public Result register(User user) {
        Result res = new Result();
        res.setSuccess(false);
        res.setDetail(null);
        res.setMsg(null);
        try {
            boolean canRegister = (userMapper.isExist(user) == null);
            if(canRegister){
                userMapper.register(user);
                res.setSuccess(true);
                res.setMsg("注册成功");
            }else{
                res.setMsg("用户名已经存在");
            }
        } catch (Exception e) {
            res.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }

    /**
     *
     */
    public Result modifyInfo(UserDomain ud){
        Result res = new Result();
        res.setSuccess(false);
        res.setDetail(null);
        res.setMsg(null);
        try {
            boolean haveDetail = (userMapper.haveDetail(ud) != null);
            if(haveDetail){
                userMapper.updateDetail(ud);
            }else{
                userMapper.addDetail(ud);
            }
            res.setDetail(ud);
            res.setSuccess(true);
            res.setMsg("修改信息成功");
        } catch (Exception e) {
            res.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }

}
