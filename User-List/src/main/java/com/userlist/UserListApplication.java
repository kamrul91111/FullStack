package com.userlist;

import com.userlist.model.User;
import com.userlist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //CommandLineRunner allows you to run a method
public class UserListApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(UserListApplication.class, args);
	}

	@Autowired //injects the model
	private UserRepository userRepository;


	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Kamrul", "islam", "kamrul.islam91111@gmail"));
		this.userRepository.save(new User("Zahidul", "islam", "zahidul.islam91111@gmail"));
		this.userRepository.save(new User("Mainul", "Hossain", "mainul.hossain@gmail"));
	}
}
