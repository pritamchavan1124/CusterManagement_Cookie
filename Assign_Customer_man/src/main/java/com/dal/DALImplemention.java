package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.pojo.Tutorial;
import com.pojo.User;
import com.utils.DBUtils;

public class DALImplemention implements DALInterface{
	
	private Connection connect;
	private PreparedStatement pstmt1;
	private ResultSet resultset;
	
	
	
	public DALImplemention() throws SQLException {
		connect=DBUtils.openConnection();
	}

	@Override
	public List<User> GetAllTopics() throws SQLException {
		
		return null;
	}

	@Override
	public List<Tutorial> GetTutorialByid() throws SQLException {
		
		return null;
	}

	@Override
	public List<Tutorial> GetTutByid() throws SQLException {
		
		return null;
	}

	@Override
	public int AddUser(User userobj) throws SQLException {
	
		return 0;
	}

	@Override
	public List<User> GetAllUser() throws SQLException {

		return null;
	}

	@Override
	public User validateUser(String userName, String password) throws SQLException {
		System.out.println(userName+" "+password);
		pstmt1=connect.prepareStatement("select * from users where email=? and password=?");
		pstmt1.setString(1, userName);
		pstmt1.setString(2, password);
		resultset=pstmt1.executeQuery();
		
		User user=null;
		while(resultset.next()) {
			user=new User(resultset.getInt("userid"),
					      resultset.getString("custFName"),
					      resultset.getString("custLName"),
					      resultset.getString("city"),
					      resultset.getString("email"),
					      resultset.getString("password"));
		}
		return user;
	}

}
