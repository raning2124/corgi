package cn.guo.corgi.gateway.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Paths;

@RestController
public class EchoController {

    @GetMapping("/api/{*message}")
    public String echo(@PathVariable String message) {
        String fileName = Paths.get(message).getFileName().toString();
        return "Hello: " + fileName;
    }

}
