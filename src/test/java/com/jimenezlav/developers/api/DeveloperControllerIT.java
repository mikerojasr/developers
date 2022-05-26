package com.jimenezlav.developers.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.jimenezlav.developers.DevelopersApplication;

@AutoConfigureMockMvc
@SpringBootTest(classes = DevelopersApplication.class)
public class DeveloperControllerIT {
	
	@Autowired
	private MockMvc developerControllerMockMvc;

	@Test
	public void getAllDevelopers() throws Exception {
		developerControllerMockMvc.perform(get("/developers"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(jsonPath("*.developerName").isArray())
        .andExpect(jsonPath("*.programmingLanguagesKnowAbout").isArray());
	}
}
