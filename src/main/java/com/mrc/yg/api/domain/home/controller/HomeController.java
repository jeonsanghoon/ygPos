package com.mrc.yg.api.domain.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String index()
    {
        return "redirect:swagger-ui.html";
    }
}
