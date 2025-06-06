package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

/// Initializes our RESTful API.
///
/// The [OpenAPIDefinition] annotation was used to enable HTTPS in the Swagger UI.
/// For more details, see the following post on Stack Overflow:
/// <a href="https://stackoverflow.com/a/71132608/3072570">...</a>
///
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}