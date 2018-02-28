package com.makingdevs.demo.repository

import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import com.makingdevs.demo.model.Address
import com.makingdevs.demo.repository.AddressRepository


@SpringBootTest
class AddressTest extends Specification{

    @Autowired
    AddressRepository addressRepository

    @Test
    def 'createAddress'(){
        when:

        address = new Address(street:"Boulevard Tomorrow",
                                    outdoorNumber: 4,
                                    interiorNumber: 7,
                                    postCode: 6678,
                                    neighborhood: "London",
                                    state: "Mexico",
                                    city: "Ecatepec",
                                    country: "México"
        )

        then:
        
    }


}