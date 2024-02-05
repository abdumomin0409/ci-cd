package com.company.localhostsakson;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = {HomeController.class})
public class HomeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void home() throws Exception {
        mockMvc.perform(get("/sakson/"))
                .andExpect(status().isOk());

    }

    @Test
    void error() throws Exception {
        mockMvc.perform(get("/sakson/er"))
                .andExpect(status().isOk());
    }

    @Test
    void warn() throws Exception {
        mockMvc.perform(get("/sakson/warn"))
                .andExpect(status().isOk());
    }

}
