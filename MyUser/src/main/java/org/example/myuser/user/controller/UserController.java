package org.example.myuser.user.controller;

import org.example.myuser.user.domain.Users;
import org.example.myuser.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/rpc/user")
public class UserController {
    @Autowired
    private UsersService usersService;
    @PostMapping("/signup")
    ResponseEntity<String> save(@RequestBody Users users)
    {
        usersService.createUser(users);
        return ResponseEntity.ok("Success");
    }
    @PostMapping("/login")
    ResponseEntity<String> login(@RequestBody Map<String, String> pra)
    {
        String username = pra.get("username");
        String password = pra.get("password");
        String token = usersService.login(username, password);
        return ResponseEntity.ok(token);
    }
}
