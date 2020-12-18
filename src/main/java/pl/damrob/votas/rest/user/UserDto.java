package pl.damrob.votas.rest.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class UserDto {
    String name;
    String password;
}
