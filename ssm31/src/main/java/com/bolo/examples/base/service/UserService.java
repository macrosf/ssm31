package com.bolo.examples.base.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolo.examples.base.entity.User;
import com.bolo.orm.mybatis.MyBatisDao;

/**
 * 人员管理
 * @author 菠萝大象
 */
@Service
public class UserService {

	@Autowired
	private MyBatisDao myBatisDao;
	
	/**
	 * 根据条件查询
	 */
	public List<User> queryResult(User user){
		return myBatisDao.getList("userMapper.selectByQuery",user);
	}
	
	public User getUser(Serializable id){
		return myBatisDao.get("userMapper.selectByPrimaryKey",id);
	}
	
	public List<User> getUsers(){
		return myBatisDao.getList("userMapper.selectByEntity");
	}
}
