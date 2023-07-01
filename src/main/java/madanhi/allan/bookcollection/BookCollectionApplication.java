package madanhi.allan.bookcollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class BookCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookCollectionApplication.class, args);
    }

}
