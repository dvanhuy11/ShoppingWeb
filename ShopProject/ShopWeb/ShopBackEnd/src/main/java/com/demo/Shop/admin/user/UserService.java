package com.demo.Shop.admin.user;
import com.Shop.common.entity.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repos;
	
	public List<User> listAll(){
		return (List<User>) repos.findAll();
	}
}
