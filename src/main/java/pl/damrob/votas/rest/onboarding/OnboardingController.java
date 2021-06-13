package pl.damrob.votas.rest.onboarding;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/onboarding")
@Slf4j
public class OnboardingController {

    @PutMapping("/register/{userId}")
    @ApiResponse(ref = "200", description = "User updated")
    public ResponseEntity<OnboardingResponseBody> updateUser(
            @PathVariable("userId") String userId,
            @RequestBody OnboardingRequestBody onboardingRequestBody) {

        log.warn("Method not implemented called for userId={}", userId);
        return new ResponseEntity<>(new OnboardingResponseBody(userId), HttpStatus.CREATED);
    }
}
