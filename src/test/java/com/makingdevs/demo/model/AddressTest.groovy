package com.makingdevs.demo.model

import spock.lang.Specification


public class AddressTest extends Specification {

    public void 'verify if the address object is created'(){

        given: "address object"

        direccion = new Address(
                street: "Av Mañana",
                outdoorNumber: 7,
                interiorNumber: 6,
                postCode: 55673,
                neighborhood: "Quinto Sol",
                state: "Edo. Mex",
                city: "Ecatepec",
                country: "Mexico",
        )

        then: "the object is the same"

        direccion == new Address(
                street: "Av Mañana",
                outdoorNumber: 7,
                interiorNumber: 6,
                postCode: 55673,
                neighborhood: "Quinto Sol",
                state: "Edo. Mex",
                city: "Ecatepec",
                country: "Mexico",)

    }
}
