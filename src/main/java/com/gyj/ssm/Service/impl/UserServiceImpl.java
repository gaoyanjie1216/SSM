package com.gyj.ssm.Service.impl;

import com.gyj.ssm.Dao.IUserDao;
import com.gyj.ssm.Model.User;
import com.gyj.ssm.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Gao on 2018/1/16.
 */
@Service("UserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userdao;

    public User getUserByID(int id) {
        return this.userdao.selectByPrimaryKey(id);
    }
}
