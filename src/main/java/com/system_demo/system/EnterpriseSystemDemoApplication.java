package com.system_demo.system;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.system_demo.system.repository.interfaces.Database;

@SpringBootApplication
public class EnterpriseSystemDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnterpriseSystemDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(Database database) {
        return args -> {
            try {
                String sql = Files.readString(Path.of("src/main/resources/schema.sql"));
                database.writeSQL(sql);
            } catch (SQLException e) {
                System.out.println("Failed to connect: " + e.getMessage());
            }
        };
    }
}
