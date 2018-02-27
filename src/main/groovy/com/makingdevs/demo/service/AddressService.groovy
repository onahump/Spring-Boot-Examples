package com.makingdevs.demo.service

import com.makingdevs.demo.model.Address

interface AddressService{

	Iterable<Address> listAllAddresses()
	Address getAddressById(Integer id)
	Address saveAddress(Address address)
	Address deleteAddress(Integer id)

} 