package com.claymore.bamder;

import com.claymore.bamder.common.config.FileStorageProperties;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class BamderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BamderApplication.class, args);
	}


	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
