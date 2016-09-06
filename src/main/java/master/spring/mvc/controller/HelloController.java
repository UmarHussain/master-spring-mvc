package master.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bv on 9/6/2016.
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello,World";
    }
}
