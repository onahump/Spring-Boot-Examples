package com.makingdevs.demo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.makingdevs.demo.model.Address
import com.makingdevs.demo.repository.AddressRepository

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddressRepository addressRepository

	public Iterable<Address> listAllAddresses(){
		addressRepository.findAll()
	}

	public Address getAddressById(Integer id){
		addressRepository.findOne(id)
	}
	
	public Address saveAddress(Address address){
		addressRepository.save(address)
	}
	
	public Address deleteAddress(Integer id){
		addressRepository.delete(id)
	}

}