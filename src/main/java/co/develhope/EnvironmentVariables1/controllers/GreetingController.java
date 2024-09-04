package co.develhope.EnvironmentVariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    private String devName;
    private String authCode;

    public GreetingController(@Value("${devName}") String devName,
                              @Value("${authCode}") String authCode) {
        this.devName = devName;
        this.authCode = authCode;
    }

    // Getter per devName
    public String getDevName() {
        return devName;
    }

    // Setter per devName
    public void setDevName(String devName) {
        this.devName = devName;
    }

    // Getter per authCode
    public String getAuthCode() {
        return authCode;
    }

    // Setter per authCode
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @GetMapping
    public String getGreeting() {
        return "Hello from " + devName + "! Your auth code is " + authCode + ".";
    }
}
