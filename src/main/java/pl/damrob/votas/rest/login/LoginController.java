package pl.damrob.votas.rest.login;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @PostMapping
    @ApiResponse(ref = "201", description = "User updated")
    public ResponseEntity<LoginResponseBody> login(
            @RequestBody LoginRequestBody loginResponseBody) {

        log.warn("Method not implemented called");
        return new ResponseEntity<>(new LoginResponseBody("not implemented", "not implemented"), HttpStatus.CREATED);
    }
}
