package org.pensive.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.test.web.servlet.MockMvc;

public class UserControllerTest {

	@InjectMocks
	private UserController userController;
	
	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		this.mockMvc = standaloneSetup(userController).build();
	}

	@Test
	public void init() throws Exception {
		standaloneSetup(userController).build().perform(get("/"))
				.andExpect(status().isOk()).andExpect(forwardedUrl("index"));
	}

}
