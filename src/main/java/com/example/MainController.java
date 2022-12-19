package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/register")
  public String showForm(Model model) {
    model.addAttribute(new User());
    return "register_form";
  }
}
