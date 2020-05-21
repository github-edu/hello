package org.javaee.web.hello;

import java.util.Map;
import java.util.Properties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "<h1>Hello</h1>";
    }

    @GetMapping("/jvm")
    public Properties jvm() {
        return System.getProperties();
    }

    @GetMapping("/env")
    public Map<String, String> env() {
        return System.getenv();
    }

}
