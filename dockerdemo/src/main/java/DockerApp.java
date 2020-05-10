import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fanminjie
 * @ClassName DockerApp
 * @Description TODO
 * @date 2020-03-08 23:50
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan("com.demo")
public class DockerApp {

    public static void main(String[] args) {
        SpringApplication.run(DockerApp.class,args);
    }

}
