package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.test.dao.UserRepository;
import com.test.entites.User;

@SpringBootApplication
public class SpringBootConceptApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootConceptApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
//		
//		User user = new User();
//		user.setName("buri");
//		user.setCity("board bazar");
		
		// saving single user ..!
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
//		User user1 = new User();
//		user1.setName("ABC");
//		user1.setCity("Dhaka");
//		
//		User user2 = new User();
//		user2.setName("DEF");
//		user2.setCity("Sreepur");
		
		// saving multiple user ..!
		
//		ArrayList<User> list1 = new ArrayList<>();
//		list1.add(user);
//		list1.add(user1);
//		list1.add(user2);
//
//		List<User> list = List.of(user,user1,user2);
//		
//		Iterable<User> result = userRepository.saveAll(list);
//		
//		result.forEach(rs -> {
//			System.out.println(rs);
//		});
		
		
		
		// update the user 
		
//		Optional<User> optional = userRepository.findById(203);
//		
//		User user = optional.get();
//		user.setName("ZZZ");
//		userRepository.save(user);
//		
//		System.out.println(user.getName()+" : "+user.getCity()+" : "+user.getId());
//		
		
		// get the user data 
		
//		 Iterable<User> itr = userRepository.findAll();
		 
//		 Iterator<User> iterator = itr.iterator();
//		 
//		 while(iterator.hasNext()) {
//			 User user = iterator.next();
//			 System.out.println(user.getId() + " : "+ user.getName() + " : "+ user.getCity());
//		 }
		
		 // consumer ..
//		 itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				System.out.println(t.getId()+" : "+ t.getName() + " : "+ t.getCity());
//				
//			}
//			 
//		 });
		 
		 // lambda
		 
//		 itr.forEach(user -> {
//			 System.out.println(user.getId()+" : "+user.getName()+ " : "+user.getCity());
//		 });
		
		// delete user
		/// single user delete
//		userRepository.deleteById(204);
		
		
		// all user delete
		
//		Iterable<User> users = userRepository.findAll();
//		
//		users.forEach(user-> {
//			System.out.println(user.getId()+" : "+user.getName()+" : "+user.getCity());
//		});
//
//		userRepository.deleteAll(users);
		
		
		// derived query method 
		
//		List<User> user =  userRepository.findByName("buri");
//		
//		user.forEach(rs -> {
//			System.out.println(rs.getId()+" : "+rs.getName()+" : "+rs.getCity());
//		});
		
		
		List<User> user1 = userRepository.findbyNameAndCity("ABC", "Dhaka");
		
		user1.forEach(rs -> {
			System.out.println(rs.getId()+" : "+rs.getName()+" : "+rs.getCity());
		});
		
	}

}
