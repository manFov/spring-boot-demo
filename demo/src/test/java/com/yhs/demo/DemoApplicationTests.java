package com.yhs.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.yhs.demo.web.controller.HelloWorldController;

@RunWith(SpringRunner.class)
public class DemoApplicationTests {

	private MockMvc mvc;

	@Before
	public void init() {
		mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}

	@Test
	public void testSay() throws Exception {
		ResultActions resultAction = mvc.perform(MockMvcRequestBuilders.get("/say2").accept(MediaType.APPLICATION_JSON));
		resultAction.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("helloWorld"));
	}

}
