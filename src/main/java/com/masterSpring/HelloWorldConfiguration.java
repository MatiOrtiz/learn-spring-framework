package com.masterSpring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){};
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
        return "";
    }

    @Bean
    public String city(){
        return "Punta Alta";
    }

    @Bean
    public Person person(){
        return new Person(name(),age());
    }

    @Bean
    public Address address(){
        return new Address(firstLine(),city());
    }

}
