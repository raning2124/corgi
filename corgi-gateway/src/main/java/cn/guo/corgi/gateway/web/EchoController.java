package cn.guo.corgi.gateway.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("{message}")
    public String echo(@PathVariable String message) {
        return "Hello: " + message;
    }

}
