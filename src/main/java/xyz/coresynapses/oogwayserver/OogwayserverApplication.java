package xyz.coresynapses.oogwayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OogwayserverApplication {
    
    public static void main(String[] args) {
	SpringApplication.run(OogwayserverApplication.class, args);
    }
    
    
    @GetMapping("/oogway")
    public String oogway(@RequestParam(value = "name", defaultValue = "Doctor Who") String name) {
	return String.format("Welcome to Oogway, %s.", name);
    }
}
