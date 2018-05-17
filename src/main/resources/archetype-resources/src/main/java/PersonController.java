#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @Autowired
    private Service<Person> personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView newIndexView() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("persons", personService.getAll());
        mv.addObject("newPerson", new Person());
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute("newPerson") Person person) {
        personService.save(person);
        model.addAttribute("persons", personService.getAll());
        return "index";
    }

}
