package com.demo.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ServiceI.HomerServiceI;
import com.demo.exception.UserNotFount;
import com.demo.model.User;
import com.demo.repositry.HomeRepositry;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class HomeServiceIMPL implements HomerServiceI {

	@Autowired 
	HomeRepositry hr;
	@Override
	public User save(User u) {
		return hr.save(u);
	}
	@Override
	public List<User> findAll() {
		return hr.findAll();
	}
	@Override
	public void deleteById(int uid) {
         Optional<User> findById = hr.findById(uid);		
         if(findById.isPresent())
         {
        	 hr.deleteById(uid);
         }
         else
         {
        	 throw new UserNotFount("This UserId was Not PRESENT");
         }
	}
	@Override
	public User update(int uid,User u) {
		Optional<User> findById = hr.findById(uid);
		if(findById.isPresent())
		{
			u.setUid(uid);
			hr.save(u);
			return u;
		}
		else
		{
			throw new UserNotFount("Cloud Not Update This UserId Not Found");
		}
		
	}

}
