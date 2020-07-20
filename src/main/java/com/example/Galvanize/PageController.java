package com.example.Galvanize;

import org.springframework.web.bind.annotation.*;

@RestController
public class PageController {

//    @RequestMapping("/{length}/{width}/{height}")
//    public String calculate(@PathVariable(value="length") String length
//                            ,@PathVariable(value="width") String width
//                            ,@PathVariable(value="height") String height) {
//        int l = Integer.valueOf(length);
//        int w = Integer.valueOf(width);
//        int h = Integer.valueOf(height);
//        String volume = String.valueOf(l*w*h);
//        return "The volume of a is: " + volume;
//    }

    @PostMapping("/math/area")
    public String area(@RequestParam(value = "radius") String radius,
                       @RequestParam(value = "width") String width,
                       @RequestParam(value = "height") String height,
                       @RequestParam(value = "type") String type
                       ){
                int w = Integer.valueOf(width);
                int h = Integer.valueOf(height);
                int r = Integer.valueOf(radius);
                double pi = 3.14;

                if(type.contains("circle")){
                    return String.valueOf(pi * r * r);
                }else if(type.contains("triangle")){
                    return String.valueOf(w * h);
                }

                return "No type found";

    }

}