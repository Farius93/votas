package pl.damrob.votas.rest.login;

import lombok.Value;

@Value
public class LoginResponseBody {
    String accessToken;
    String refreshToken;
}
