package me.ye.springinaction.controller;

import me.ye.springinaction.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author Jacob
 * @date 16/04/2018
 */

@Controller
public class SignUpController {

    @PostMapping("/signUp")
    public String signUp(@RequestPart("image") MultipartFile image)
            throws Exception{
        image.transferTo(new File("/image/" + image.getOriginalFilename()));
        return "home";
    }

    @GetMapping("/signUpPage")
    public String signUpPage() {
        return "sign_up";
    }
}
