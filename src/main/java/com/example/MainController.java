package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class MainController {

  @GetMapping("/register")
  public String showForm(Model model) {
    log.info("In showForm()");
    User user = new User();
    model.addAttribute(user);
    log.info("empty user: " + user);

    return "register_form";
  }

  @PostMapping("/register")
  public String submitForm(@ModelAttribute("user") User user) {
    log.info("In submitForm()");
    log.info(String.valueOf(user));
    return "register_success";
  }
}
