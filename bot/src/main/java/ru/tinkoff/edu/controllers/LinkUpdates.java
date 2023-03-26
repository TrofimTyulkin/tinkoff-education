package ru.tinkoff.edu.controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import ru.tinkoff.edu.dto.UserRequest;
import ru.tinkoff.edu.dto.UserResponse;

import java.util.UUID;

@RequestMapping("/updates")
@RestController
public class LinkUpdates {
    @Value("${app.test}")
    String str;

    @GetMapping
    String hello() {
        return "<html> <h1>Hello " + str + " <br> World!!!</html>";
    }

    @GetMapping("/{userId}/{dir}")
    String helloById(@PathVariable String userId, @PathVariable String dir) {
        return "<html> <h1> id "+ userId + dir + " <br> World!!!</html>";
    }

    @PostMapping("/{userId}/{dir}")
    String helloByIdPost(@PathVariable String userId, @PathVariable String dir) {
        return "<html> <h1> id "+ userId + dir + " <br> World!!!</html>";
    }

    @PostMapping
    UserResponse hi(UserRequest userRequest){ return new UserResponse(UUID.randomUUID(), userRequest.name()); }


}

