package com.dashang.service;

import com.alibaba.fastjson.JSONObject;


import com.dashang.mapper.*;
import com.dashang.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "sendservice")
public class SendService {
    @Autowired
    private DsSentDao sentDao;
    @Autowired
    private DsInboxDao inboxDao;
    //    @Autowired
//    private DsUserDao userDao;
    @Resource
    UserMapper userMapper;
    @Autowired
    private DsDraftDao draftDao;


    public int saveMail(JSONObject jsonData) {
        DsInbox dsInbox = new DsInbox();
        DsSent dsSent = new DsSent();
        int senduserid = userMapper.selectUserID(jsonData.getString("userName"));
        dsSent.setUserId(senduserid);
        dsSent.setSentTheme(jsonData.getString("mailTheme"));
        dsSent.setSentSender(jsonData.getString("userName"));
        dsSent.setSentDate(jsonData.getDate("mailDate"));
        String recipientName = userMapper.selectUserNameByEmail(jsonData.getString("mailRecipient"));
        dsSent.setSentRecipient(recipientName);
        dsSent.setSentDetial(jsonData.getString("mailDetial"));
        int a = sentDao.insert(dsSent);

        int userid = userMapper.selectUserIdByEmail(jsonData.getString("mailRecipient"));
        dsInbox.setUserId(userid);
        dsInbox.setMailTheme(jsonData.getString("mailTheme"));
        dsInbox.setMailSender(jsonData.getString("userName"));
        dsInbox.setMailDate(jsonData.getDate("mailDate"));
        dsInbox.setMailType(jsonData.getInteger("mailType"));
        dsInbox.setMailRecipient(recipientName);
        dsInbox.setMailDetial(jsonData.getString("mailDetial"));

        return inboxDao.insert(dsInbox);
    }

    public int saveDraft(JSONObject jsonData) {
        DsDraft dsDraft = new DsDraft();
        int userid = userMapper.selectUserID(jsonData.getString("userName"));
        dsDraft.setUserId(userid);
        dsDraft.setDraftTheme(jsonData.getString("mailTheme"));
        dsDraft.setDraftSender(jsonData.getString("userName"));
        dsDraft.setDraftDate(jsonData.getDate("mailDate"));
        if(jsonData.getString("mailRecipient") != ""){
            String recipientName = userMapper.selectUserNameByEmail(jsonData.getString("mailRecipient"));
            dsDraft.setDraftRecipient(recipientName);
        }else {
            dsDraft.setDraftRecipient(jsonData.getString("mailRecipient"));
        }
        dsDraft.setDraftDetial(jsonData.getString("mailDetial"));
        return draftDao.insert(dsDraft);
    }
}
