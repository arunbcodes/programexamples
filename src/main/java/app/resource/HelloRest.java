package app.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRest {

    @RequestMapping("/")
    public String HelloRest(){
        return "Hello rest";
    }
}
