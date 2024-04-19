package ru.erik182182.load.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CsvController {

    @GetMapping("/csv")
    public String getCsvPage() {
        return "addcsv";
    }

    @PostMapping("/csv")
    public String getAnalyticPage() {
        return "analyticcsv";
    }

}
