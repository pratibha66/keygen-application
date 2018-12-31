package pratibha.co;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pratibha.co.pratibha.repository.KeyGen;

@SpringBootApplication
public class Application {
    private static KeyGen keygen;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		keygen.generateAllKeys();
	}
	@Autowired
	public void setKeygen(KeyGen key){
		Application.keygen = key;
	}
}

