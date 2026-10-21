package com.booknest.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    void returnsWelcomeMessage() {
        assertEquals("Greetings from core", new Greeting().message());
    }
}