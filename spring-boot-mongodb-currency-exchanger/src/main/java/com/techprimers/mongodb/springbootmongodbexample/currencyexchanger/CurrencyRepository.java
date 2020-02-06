
package com.techprimers.mongodb.springbootmongodbexample.currencyexchanger;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrencyRepository extends MongoRepository<Currency, String>{
    
}
