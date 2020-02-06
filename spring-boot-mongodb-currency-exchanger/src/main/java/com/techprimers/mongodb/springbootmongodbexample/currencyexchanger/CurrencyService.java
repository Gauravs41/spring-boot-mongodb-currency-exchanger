
package com.techprimers.mongodb.springbootmongodbexample.currencyexchanger;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    @Autowired
	private CurrencyRepository currencyReposiory;
	
	
	
	public List<Currency> getAllCurrency() {
		return (List<Currency>) this.currencyReposiory.findAll();
	}

	public Currency getCurrency(String id) {
		return (Currency) this.currencyReposiory.findOne(id);
	}

	public void addCurrency(List<Currency> currency) {
		this.currencyReposiory.save(currency);
	}

	public void updateCurrency(String id, Currency currency) {
		this.currencyReposiory.save(currency);
	}

	public void deleteCurrency(String id) {
		this.currencyReposiory.delete(id);;
	}
}
