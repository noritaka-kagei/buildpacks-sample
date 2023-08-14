package com.noritakakagei.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PathValiableController {

    @GetMapping("/parameter")
    @ResponseBody
    public String showParamResponse(@RequestParam String response) {
        // HTTP Access to /parameter?response=hoge -> return "hoge"
        return response;
    }
}