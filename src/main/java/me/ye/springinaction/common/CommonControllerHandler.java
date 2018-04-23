package me.ye.springinaction.common;

import me.ye.springinaction.exception.DemoException;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author Jacob
 * @date 19/04/2018
 */

@ControllerAdvice
public class CommonControllerHandler {


    @ExceptionHandler(NullPointerException.class)
    public String handException() {
        return "error";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("in init binder");
        binder.addCustomFormatter(new DateFormatter("yyyyMMdd"));
    }

/*    @ModelAttribute("key")
    public String initModel() {
        return "value";
    }*/
}
