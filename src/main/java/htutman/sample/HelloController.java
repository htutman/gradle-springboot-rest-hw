package htutman.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple MVC controller <em>"Hello World!"</em> example.
 *
 * @author Hrvoje Tutman
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Message printHello() {
        return new Message("Hello world!");
    }
}
