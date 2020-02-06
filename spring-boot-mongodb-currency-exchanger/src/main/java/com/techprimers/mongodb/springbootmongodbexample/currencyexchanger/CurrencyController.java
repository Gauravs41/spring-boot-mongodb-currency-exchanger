package com.techprimers.mongodb.springbootmongodbexample.currencyexchanger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyService currencyService;

	@RequestMapping("/currency")
	public List<Currency> getAllTopics() {
		return currencyService.getAllCurrency();
	}
	
	@RequestMapping("/currency/{id}")
	public Currency getTopic(@PathVariable String id) {
		return currencyService.getCurrency(id);
	}
	
	@PostMapping("/currency")
	//@RequestMapping(method=RequestMethod.POST, value="/currency")
	public String addTopic(@RequestBody List<Currency> currency) {
                
		currencyService.addCurrency(currency);
		String response = "{\"success\": true, \"message\": Topic has been added successfully.}";
		return response;
	}
	
	//@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	@PutMapping("/currency/{id}")
	public String updateTopic(@RequestBody Currency currency, @PathVariable String id) {
		currencyService.updateCurrency(id, currency);
		String response = "{\"success\": true, \"message\": Topic has been updated successfully.}";
		return response;
	}
	
	//@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	@DeleteMapping("/currency/{id}")
	public String deleteTopic(@PathVariable String id) {
		currencyService.deleteCurrency(id);
		String response = "{\"success\": true, \"message\": Topic has been deleted successfully.}";
		return response;
	}
}
