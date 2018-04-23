package me.ye.springinaction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Jacob
 * @date 17/04/2018
 */

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DemoException extends RuntimeException {
}
