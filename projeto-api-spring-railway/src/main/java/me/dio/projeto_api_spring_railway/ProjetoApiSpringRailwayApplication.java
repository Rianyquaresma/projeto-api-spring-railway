package me.dio.projeto_api_spring_railway;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class ProjetoApiSpringRailwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiSpringRailwayApplication.class, args);
	}

}
