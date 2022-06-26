package io.swagger.controller;

import io.swagger.domain.Address;
import io.swagger.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CusmtonerController {

	@Autowired
	protected CustomerService customerService;
	
    @GetMapping("/customer/{customerId}")
    public Address get(@PathVariable Integer customerId) throws Exception {
        return customerService.getCustomerAddress(customerId);
    }

}
