package spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/skypro")
public class SpringMVCController {

    @RequestMapping("/enterInfo")
    public String enterInfo(){
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("country") String country,
                           @RequestParam("capital") String capital,
                           Model model) {
        String message = "Country - " + country + ".\n" +
                "Capital - " + capital + ".";
        model.addAttribute("message", message);
        return "showInfo";
    }
}
