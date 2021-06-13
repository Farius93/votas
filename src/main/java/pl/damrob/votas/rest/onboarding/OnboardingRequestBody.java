package pl.damrob.votas.rest.onboarding;

import lombok.Value;

@Value
public class OnboardingRequestBody {
    String email;
    String password;
}
