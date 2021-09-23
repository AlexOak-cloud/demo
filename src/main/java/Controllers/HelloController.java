package Controllers;

import Entity.Person;
import Repository.Repository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

    @GetMapping("/hello")
    public String find(){
        final Person byId = Repository.getById(3);

        ModelAndView mv = new ModelAndView();

        mv.addObject("person",byId);
        return "hello";
    }
}
