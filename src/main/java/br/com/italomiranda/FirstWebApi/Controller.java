package br.com.italomiranda.FirstWebApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class Controller {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello world";
    }

}
