package com.randomgreeting.controller;

import com.randomgreeting.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RandomController {
    @Autowired
    private PhraseService service;

    @GetMapping("/random")
    public String listUsers(Model model) {
        model.addAttribute("context", service.randomPhrase());
        model.addAttribute("url", "https://images.unsplash.com/photo-1471623432079-b009d30b6729?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        return "exmp";
    }
}
