package pl.damrob.votas.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping(value = "/demo")
    ResponseEntity<String> java11Method() {
        return ResponseEntity.ok("Teraz masz token :D");
    }
}
