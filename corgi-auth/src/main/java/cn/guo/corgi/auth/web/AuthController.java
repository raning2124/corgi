package cn.guo.corgi.auth.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (username.equals("admin") && password.equals("1234")) {
            return "success";
        }
        return "fail";
    }

}
