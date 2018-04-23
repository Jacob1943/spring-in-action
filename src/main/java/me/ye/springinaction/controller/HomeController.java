package me.ye.springinaction.controller;

import me.ye.springinaction.entity.User;
import me.ye.springinaction.exception.DemoException;
import me.ye.springinaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

/**
 * @author Jacob
 * @date 13/04/2018
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/")
    public String home(@ModelAttribute("key")String key) {
        //throw new DemoException();
        return "home";
    }


    @GetMapping("/date")
    public String date(@RequestParam("date")Date date, Model model) {
        System.out.println("in date");
        model.addAttribute("date", date);
        return "date";
    }



    @RequestMapping(value = "/register", method=RequestMethod.POST)
    public String register(User user) {
        User savedUser = userService.save(user);
        return "redirect: /userInfo/" + savedUser.getId();
    }

    @PostMapping("/user")
    public String user(User user, RedirectAttributes model) {
        model.addAttribute("id", 100);
        model.addAttribute("name", "Jacob");
        model.addFlashAttribute("user", user);
        return "redirect:/userInfo/{name}";
    }

    @GetMapping("/userInfo/{name}")
    public String userInfo(@RequestParam("id") String id,
                          @PathVariable("name") String name,
                          Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "user";
    }

}
