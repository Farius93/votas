package pl.damrob.votas.rest.exceptionHandling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.damrob.votas.domain.VotasApplicationService;
import pl.damrob.votas.infrastructure.persistance.UserRepositoryImpl;

import javax.servlet.http.HttpServletRequest;

import static pl.damrob.votas.rest.exceptionHandling.ExceptionMessage.of;

@Slf4j
@ControllerAdvice
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class RequestExceptionHandler {

    @ExceptionHandler(UserRepositoryImpl.NotFoundException.class)
    public ResponseEntity<ExceptionMessage> handleNotFoundException(UserRepositoryImpl.NotFoundException ex, HttpServletRequest request) {
        log.warn("Returning error HTTP response - Not found exception thrown during processing request (URL:{})", buildUrlWithQueryParams(request));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(of(ex.getLocalizedMessage()));
    }

    @ExceptionHandler(VotasApplicationService.UserAlreadyExistsException.class)
    public ResponseEntity<ExceptionMessage> handleBusiness(RuntimeException ex, HttpServletRequest request) {
        log.warn("Exception thrown during votas request processing (URL:{}), message={}", buildUrlWithQueryParams(request), ex.getLocalizedMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(of(ex.getLocalizedMessage()));
    }

    private static String buildUrlWithQueryParams(HttpServletRequest request) {
        final String queryParamPart = request.getQueryString() != null ? "?".concat(request.getQueryString()) : "";
        return request.getRequestURL().append(queryParamPart).toString();
    }
}
