package cl.test.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cl.test")
public class EjemploMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploMicroservicioApplication.class, args);
	}

}
