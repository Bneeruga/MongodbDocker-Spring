package com.mongodbdocker.mongodbspring;

import com.mongodbdocker.mongodbspring.product.Product;
import com.mongodbdocker.mongodbspring.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongodbDockerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbDockerSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            var product = Product.builder()
                    .name("booK")
                    .description("new command line book")
                    .build();
            productRepository.insert(product);
        };
    }


}
