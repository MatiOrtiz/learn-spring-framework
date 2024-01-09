package com.masterSpring.helloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address){};
record Address (String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Matias";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public String firstLine(){
        return "Bedford st";
    }

    @Bean
    public String city(){
        return "New York";
    }

    @Bean
    public Person person(){
        return new Person(name(),age(), address());
    }

    @Bean
    public Address address(){
        return new Address(firstLine(),city());
    }

}
