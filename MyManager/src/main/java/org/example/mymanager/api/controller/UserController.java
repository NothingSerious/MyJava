package org.example.mymanager.api.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.mymanager.api.controller.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/user")
@SentinelResource(value = "someResource")
public class UserController {
    @Autowired
    private UserFeignService userFeignService;
    // 保存用户
    @GetMapping("/save")
    ResponseEntity<String> save(@RequestBody Map<String, String> user)
    {
        userFeignService.saveUser(user);
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/get")
    ResponseEntity<String> get(@RequestParam(value = "userId", required = false) Long userId, @RequestParam(value = "userName", required = false) String userName, @RequestParam(value = "userAge", required = false) Integer userAge)
    {

        return ResponseEntity.ok("测试");
    }
    @GetMapping("/login")
    ResponseEntity<String> login(@RequestBody Map<String, String> par)
    {
        return ResponseEntity.ok(userFeignService.login(par));
    }
}
