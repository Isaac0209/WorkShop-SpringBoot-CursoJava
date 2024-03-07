package com.isaac.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaac.course.entities.User;
import com.isaac.course.repositories.UserRepository;
import com.isaac.course.services.exceptions.ResourceNotFoundException;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id) );
	}
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	public User update(Long id, User obj) {
		User entity = userRepository.getReferenceById(id);
		entity.setEmail(obj.getEmail());
		entity.setName(obj.getName());
		entity.setPhone(obj.getPhone());
		return userRepository.save(entity);
	}
}
