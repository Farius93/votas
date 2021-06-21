package pl.damrob.votas.rest.login;

import lombok.Value;

@Value
public class LoginResponseBody {
    Long userId;
    String accessToken;
    String refreshToken;
}
