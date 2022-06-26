package io.swagger.service;

import io.swagger.domain.Address;
import io.swagger.domain.Customer;
import io.swagger.mapper.CustomerMapper;
import io.swagger.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CustomerService{
	@Autowired
	protected CustomerMapper customerMapper;

	@Autowired
	protected AddressMapper addressMapper;

	public Address getCustomerAddress(Integer id) {
		Customer customer = customerMapper.selectByPrimaryKey(id);
		if(customer!=null) {
			Address address= addressMapper.selectByPrimaryKey(Integer.valueOf(customer.getAddressId()));
			return address;
		}
		return null;
	}

	public void addAddress(Address address) {
		addressMapper.insert(address);
	}
}
