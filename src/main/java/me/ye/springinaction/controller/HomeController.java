package me.ye.springinaction.controller;

import me.ye.springinaction.entity.User;
import me.ye.springinaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Jacob
 * @date 13/04/2018
 */

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("key", "value");
        return "home";
    }

/*    @RequestMapping(value="/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, @RequestParam("id") String id) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "userInfo";
    }*/

    @RequestMapping(value="/userInfo/{id}", method = RequestMethod.GET)
    public String userInfo(Model model, @PathVariable("id") String id) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "userInfo";
    }

    @RequestMapping(value = "/register", method=RequestMethod.POST)
    public String register(User user) {
        User savedUser = userService.save(user);
        return "redirect: /userInfo/" + savedUser.getId();
    }
}
