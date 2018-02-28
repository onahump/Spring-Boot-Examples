package com.makingdevs.demo.repository

import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import com.makingdevs.demo.model.Address
import com.makingdevs.demo.repository.AddressRepository

@DataJpaTest
@SpringBootTest
class AddressTest extends Specification{

    @Autowired
    AddressRepository addressRepository

    Address addressX = new Address(street:"Boulevard Tomorrow",
                                  outdoorNumber: 4,
                                  interiorNumber: 7,
                                  postCode: 6678,
                                  neighborhood: "London",
                                  state: "Mexico",
                                  city: "Ecatepec",
                                  country: "México")

    @Test
    def 'find Address by Id'(){

        def savedAddressEntity = addressRepository.save(addressX)

        when: "load Address Entity"

        def AddressFromDb = addressRepository.findOne(savedAddressEntity.id)

        then: "saved and retrieved entity by id must be equal"

        savedAddressEntity.getId() == AddressFromDb.getId()

    }

}