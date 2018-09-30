package demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class ControllerTest {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Vee 哈哈哈哈嚯嚯嚯嚯";
    }
    
    public static void main(String[] args) {  
        SpringApplication.run(ControllerTest.class);  
 } 
    
}