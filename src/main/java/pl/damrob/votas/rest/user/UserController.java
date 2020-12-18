package pl.damrob.votas.rest.user;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.damrob.votas.domain.User;
import pl.damrob.votas.domain.VotasApplicationService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    public final VotasApplicationService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void postUser(@RequestBody UserDto dto) {
        service.addUser(dto.getName(), dto.getPassword());
    }

    @GetMapping("/{name}")
    @ApiResponse(ref = "404", description = "User does not exist")
    public ResponseEntity<UserDto> getUser(@PathVariable("name") String name) {
        User user = service.getUser(name);
        return ResponseEntity.ok()
                .body(UserDto.builder()
                        .name(user.getName())
                        .password(user.getPassword()).build());
    }
}
