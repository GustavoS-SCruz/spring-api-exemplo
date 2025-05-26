package com.exemplo.api;

import com.example.api.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();
        assertEquals("Hello, world!", controller.hello());
    }
}