package raycook.bookingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ViewController {
//    @Value("${app-mode}")
    private String appMode;

    //Alternate method for getting the app-mode property. Used in place of @Value.
    @Autowired
    public ViewController(Environment environment){
        appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Ray Cook");
        model.addAttribute("mode", appMode);
        return "index";
    }
}