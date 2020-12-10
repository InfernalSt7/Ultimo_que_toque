package com.spring.ultimoquetoque;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UltimoQueToqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(UltimoQueToqueApplication.class, args);
	}
	
	@Bean
    public DozerBeanMapper studentMapper() {
        return new DozerBeanMapper ();
    }

}
