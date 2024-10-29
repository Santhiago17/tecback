package br.com.fujideia.iesp.tecback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@CacheConfig
@EnableFeignClients
public class TecbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TecbackApplication.class, args);
	}

}
