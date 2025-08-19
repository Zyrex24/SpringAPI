package com.example.springapitest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringbootHelloWorldApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		// Verifies that the Spring context starts successfully
	}

	@Test
	void getAllHello_returnsList() throws Exception {
		mockMvc.perform(get("/api/hello"))
				.andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith("application/json"))
				.andExpect(jsonPath("$[0].id").value(1))
				.andExpect(jsonPath("$[0].message").value("Hello World"));
	}

	@Test
	void getHelloById_returnsObject() throws Exception {
		mockMvc.perform(get("/api/hello/1"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(1))
				.andExpect(jsonPath("$.message").value("Hello World"));
	}

	@Test
	void getHelloById_notFound() throws Exception {
		mockMvc.perform(get("/api/hello/999"))
				.andExpect(status().isNotFound());
	}
}


