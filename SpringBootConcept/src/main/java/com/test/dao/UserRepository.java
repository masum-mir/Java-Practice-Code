package com.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.entites.User;

@Repository("reimbursementRepository")
public interface UserRepository extends CrudRepository<User, Integer>{
	
//	List<User> findByName(String name);
	
//	public List<User> findbyNameAndCity(String name, String city);

}
