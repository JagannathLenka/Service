package hello;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hello-user")
public class HelloUserController {

	private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    
    public @ResponseBody User sayHelloUser(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new User(counter.incrementAndGet(), "Jagannath", "1500 White Birch Terrace");
    }
    
    @RequestMapping(value="/new", method=RequestMethod.GET) 
    public @ResponseBody User findUsersayHelloUser (@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    
    	return new User(1, "Jagannath", "White");
    }

}
