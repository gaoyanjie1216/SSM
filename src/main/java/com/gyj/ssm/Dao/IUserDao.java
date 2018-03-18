package com.gyj.ssm.Dao;

import com.gyj.ssm.Model.User;

/**
 * Created by Gao on 2018/1/16.
 */
public interface IUserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
