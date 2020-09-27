
package app;

import java.util.Date;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
@Controller
public class Application {

    public static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(final String[] args) throws Exception {

        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String home(final Map<String, Object> model) {

        LOGGER.debug("Index page hit");
        model.put("message", "Hello World");
        model.put("title", "Hello Home");
        model.put("date", new Date());
        return "index";
    }

    @Bean
    public LayoutDialect layoutDialect() {

        return new LayoutDialect();
    }
}
