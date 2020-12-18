package pl.damrob.votas.rest.exceptionHandling;

import lombok.Value;

@Value
public class ExceptionMessage {
    String message;

    static ExceptionMessage of(String message) {
        return new ExceptionMessage(message);
    }
}
