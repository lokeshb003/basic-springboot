package com.devops.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloEndpointReturnsHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hi"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello Lokesh!"));
    }

    @Test
    public void helloEndpointReturnsHelloName() throws Exception {
        String name = "Lokesh";
        mockMvc.perform(MockMvcRequestBuilders.get("/hi")
                .param("name", name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello " + name + "!"));
    }
}

