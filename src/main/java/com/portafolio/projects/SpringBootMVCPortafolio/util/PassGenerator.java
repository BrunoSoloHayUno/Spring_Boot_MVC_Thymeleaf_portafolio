package com.portafolio.projects.SpringBootMVCPortafolio.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGenerator {

    public static void main(String []args){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);

        System.out.println(bCryptPasswordEncoder.encode("1234"));

        //Resultado esperado: $2a$04$n6WIRDQlIByVFi.5rtQwEOTAzpzLPzIIG/O6quaxRKY2LlIHG8uty
    }
}
