package top.gsc.javaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@SpringBootApplication
public class JavaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaServiceApplication.class, args);
    }
    @GetMapping("/list")
    public List<String> getList() {
        return List.of("abc", "bsss", "cdd");
    }

}

