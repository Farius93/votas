package pl.damrob.votas.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    private static final String TEXT =
            "___*****_*****___*****__*****\n" +
            "_*****____*****_*****_____*****\n" +
            "*****________*****_________*****\n" +
            "*****_____Kocham Cie :*____*****\n" +
            "_*****_____  Anetko  ______*****\n" +
            "__***** _________________*****\n" +
            "___***** ________________*****\n" +
            "_____***** ___________*****\n" +
            "_______***** _______ *****\n" +
            "_________*****____*****\n" +
            "__________*****__*****\n" +
            "______________*****\n";

    @GetMapping(value = "/kirwej")
    ResponseEntity<String> kirwejMethod() {
        return ResponseEntity.ok("Siemanko Kirwej, jestem online!, kiedy pijem?!");
    }

    @GetMapping(value = "/anetka")
    ResponseEntity<String> anetkaMethod() {
        return ResponseEntity.ok(TEXT);
    }
}
