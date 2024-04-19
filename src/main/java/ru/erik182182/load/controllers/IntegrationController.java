package ru.erik182182.load.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntegrationController {

    @GetMapping("/integration")
    public String getAddIntegrationPage() {
        return "addintegration";
    }

}
