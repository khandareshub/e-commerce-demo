package com.ecom.e_commerce_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
@SpringBootTest
class ECommerceDemoApplicationTests {
    @Autowired
	private MockMvc mockMvc;
	
	@Test
	void testGreetingEndpoint() throws Exception {
		String name= "Shubhangi Akshay Thokale";
   mockMvc.perform(MockMvcRequestBuilders.get("greetings/{name}", name)).andExpect(MockMvcResultMatchers.status().isOk())
   .andExpect(MockMvcResultMatchers.content().string("Hello "+name+" Congratulation you have successfully completed the devops course."));
   
		;
	}

}
