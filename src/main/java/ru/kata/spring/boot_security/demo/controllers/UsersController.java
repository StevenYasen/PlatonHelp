package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.services.RoleService;
import ru.kata.spring.boot_security.demo.services.UserService;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService, RoleService roleService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showUserById(Principal principal, Model model) {
        model.addAttribute("user", userService.getUserByUserName(principal.getName()));
        return "user/user";
    }
}