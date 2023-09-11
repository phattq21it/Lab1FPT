package com.example.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class AssignmentApplication {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       ApplicationContext context= SpringApplication.run(AssignmentApplication.class, args);
        Test test= context.getBean(Test.class);
        test.performTasks();
    }

}
