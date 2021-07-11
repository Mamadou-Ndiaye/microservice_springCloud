package com.adria.customerservice;

import com.adria.customerservice.entities.Customer;
import com.adria.customerservice.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.UUID;


//@ComponentScan
//@EnableJpaRepositories
//@ComponentScan ({"com.adria", "com.adria.customerservice.repositories", "com.adria.customerservice.mappers", "com.adria.customerservice.dto", "com.adria.customerservice.entities", "com.adria.customerservice.services"})
//@EnableJpaRepositories("com.adria.customerservice") // this fix the problem

@SpringBootApplication
public class CustomerServiceApplication {
	 

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
   @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer("001","Adria","med@adria.com"));
            customerRepository.save(new Customer("002","LinkedIn","linked@adria.com"));
        };
    }

}
