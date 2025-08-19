package com.example.springapitest.repository;

import com.example.springapitest.model.Hello;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HelloRepository {
	private final List<Hello> storage = new ArrayList<>();

	public HelloRepository() {
		storage.add(new Hello(1L, "Hello World"));
	}

	public List<Hello> findAll() {
		return new ArrayList<>(storage);
	}

	public Optional<Hello> findById(Long id) {
		return storage.stream().filter(h -> h.getId().equals(id)).findFirst();
	}
}


