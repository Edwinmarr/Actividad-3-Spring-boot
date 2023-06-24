package co.edu.udec.act3.edwinmarrugo.gradescrud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.udec.act3.edwinmarrugo.gradescrud"})
@EnableJpaRepositories(basePackages = "co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao")
@EntityScan("co.edu.udec.act3.edwinmarrugo.gradescrud.model")
public class GradesCrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(GradesCrudApplication.class, args);
	}

}
