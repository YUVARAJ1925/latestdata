package appConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dataCodeController")
public class ConfigureAppDataCode {

	public static void main(String[] args) {
		System.out.println("----------start data config--->");
		SpringApplication.run(ConfigureAppDataCode.class, args);
	}
	
}
