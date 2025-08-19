package com.example.springapitest.controller;

<<<<<<< HEAD
import com.example.springapitest.model.Hello;
import com.example.springapitest.service.SpringbootHelloWorldAppService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> 442ce38 (Initial commit: Spring Boot Hello World + Maven Wrapper + Postman collection)
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
<<<<<<< HEAD
	private final SpringbootHelloWorldAppService service;

	public HelloController(SpringbootHelloWorldAppService service) {
		this.service = service;
	}

	@GetMapping("/hello")
	public List<Hello> getAll() {
		return service.getAll();
	}

	@GetMapping("/hello/{id}")
	public ResponseEntity<Hello> getOne(@PathVariable Long id) {
		Optional<Hello> result = service.getById(id);
		return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
=======
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
>>>>>>> 442ce38 (Initial commit: Spring Boot Hello World + Maven Wrapper + Postman collection)
	}
}


