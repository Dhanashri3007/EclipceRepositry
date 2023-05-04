package com.demo.ServiceI;

import java.util.List;

import com.demo.model.User;

public interface HomerServiceI {

	User save(User u);

	List<User> findAll();

	void deleteById(int uid);

	User update(int uid,User u);

}
