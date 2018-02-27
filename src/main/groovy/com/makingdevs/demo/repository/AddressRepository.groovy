package com.makingdevs.demo.repository

import org.springframework.data.repository.CrudRepository

import com.makingdevs.demo.model.Address

interface AddressRepository extends CrudRepository<Address, Long>{

}