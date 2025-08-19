package com.example.springapitest.service;

import com.example.springapitest.model.Hello;
import com.example.springapitest.repository.HelloRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class SpringbootHelloWorldAppService {
	private final HelloRepository repository;

	public SpringbootHelloWorldAppService() {
		this.repository = new HelloRepository();
	}

	public List<Hello> getAll() {
		return repository.findAll();
	}

	public Optional<Hello> getById(Long id) {
		return repository.findById(id);
	}
}


