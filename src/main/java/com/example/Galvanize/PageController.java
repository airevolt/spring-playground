package com.example.Galvanize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @RequestMapping("/{length}/{width}/{height}")
    public String calculate(@PathVariable(value="length") String length
                            ,@PathVariable(value="width") String width
                            ,@PathVariable(value="height") String height) {
        int l = Integer.valueOf(length);
        int w = Integer.valueOf(width);
        int h = Integer.valueOf(height);
        String volume = String.valueOf(l*w*h);
        return "The volume of a is: " + volume;
    }

}