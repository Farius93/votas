package pl.damrob.votas.rest.login;

import lombok.Value;

@Value
public class LoginRequestBody {
    String email;
    String password;
    String os;
    String deviceId;
}
