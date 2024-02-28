package DemoTest.DemoTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.entities")
public class DemoTestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoTestApplication.class, args);
	}

}
