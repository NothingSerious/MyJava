package org.example.mymanager.api.controller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "my-java-user", contextId = "UserFeignService")
public interface UserFeignService {

    @PostMapping(value = "/rpc/user/signup")
    void saveUser(@RequestBody Map<String, String> user);

    @PostMapping(value = "/rpc/user/login")
    String login(@RequestBody Map<String, String> par);
}
