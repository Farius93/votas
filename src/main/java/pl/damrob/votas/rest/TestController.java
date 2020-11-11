package pl.damrob.votas.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping(value = "/kirwej")
    ResponseEntity<String> kirwejMethod() {
        return ResponseEntity.ok("Siemanko Kirwej, jestem online!, kiedy pijem?!");
    }

    @GetMapping(value = "/java11")
    ResponseEntity<String> java11Method() {
        return ResponseEntity.ok("Działa");
    }

    @GetMapping(value = "/authenticate")
    ResponseEntity<String> matiMethod() {

        return ResponseEntity.ok("Zrób autentykacje");
    }
}
