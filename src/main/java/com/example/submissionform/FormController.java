package com.example.submissionform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    @RequestMapping("/")
    public String Edureka(){
        return "edureka.jsp";
    }
}
