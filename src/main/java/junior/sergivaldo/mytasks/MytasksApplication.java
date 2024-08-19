package junior.sergivaldo.mytasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MytasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytasksApplication.class, args);
    }

}
