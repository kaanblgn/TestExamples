package org.example;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("before - I am only called once");
    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
        System.out.println("In before each...");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Kaan"));
    }
    @Test
    void helloWorld2() {System.out.println(greeting.helloWorld("Mert"));}

    @AfterEach
    void tearDown(){
        System.out.println("In After each....");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("after and last - I am only called once");
    }
}