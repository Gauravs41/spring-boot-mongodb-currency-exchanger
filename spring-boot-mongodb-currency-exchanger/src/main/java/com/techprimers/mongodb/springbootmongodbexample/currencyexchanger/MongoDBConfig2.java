package com.techprimers.mongodb.springbootmongodbexample.currencyexchanger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
/**
 *
 * @author Lenovo
 */
@Configuration
public class MongoDBConfig2 {
     @Bean
    CommandLineRunner commandLineRunner(CurrencyRepository currencyReposiory) {
        return strings -> {
            currencyReposiory.save(new Currency("1", "Peter", "Development", "100","200"));
            currencyReposiory.save(new Currency("2", "Sam", "Operations", "200","500"));
        };
    }
}
