package app.vercel.ferry.ferryspringaop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FerrySpringAopApplication implements CommandLineRunner{
	private final Calculator calculator;

	public FerrySpringAopApplication(Calculator calculator){
		this.calculator = calculator;
	}

	public static void main(String[] args){
		SpringApplication.run(FerrySpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		calculator.add(2, 1);
		calculator.subtract(2, 1);
		calculator.multiply(2, 1);
		calculator.divide(2, 0);
	}

}
