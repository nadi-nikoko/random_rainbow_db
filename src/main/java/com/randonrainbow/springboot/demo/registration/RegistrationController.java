package com.randonrainbow.springboot.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final com.randonrainbow.springboot.demo.registration.RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody com.randonrainbow.springboot.demo.registration.RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
