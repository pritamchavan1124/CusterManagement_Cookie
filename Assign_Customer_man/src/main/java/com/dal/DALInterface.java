package com.dal;

import java.sql.SQLException;
import java.util.List;

import com.pojo.Tutorial;
import com.pojo.User;

public interface DALInterface {
	
	List<User> GetAllTopics() throws SQLException;
	
	List<Tutorial> GetTutorialByid() throws SQLException;
	
	List<Tutorial> GetTutByid() throws SQLException;
	
	int AddUser(User userobj) throws SQLException;
	
	List<User> GetAllUser() throws SQLException;
	
	User validateUser(String userName,String password) throws SQLException;
	
	
	

}
