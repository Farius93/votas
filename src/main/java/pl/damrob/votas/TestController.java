package pl.damrob.votas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    ResponseEntity<String> testMethod() {
        return ResponseEntity.ok("Siemanko");
    }
}
