package ar.com.jalmeyda.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@ControllerAdvice
public class ErrorCustomController {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDto> handleManagedException(RuntimeException ex) {
        return new ResponseEntity<ErrorDto>(new ErrorDto(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDto> handleValidationApiException(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult().getAllErrors()
                .stream().map(objectError -> objectError.getDefaultMessage())
                .collect(Collectors.joining(". "));
        return new ResponseEntity<ErrorDto>(new ErrorDto(message), HttpStatus.BAD_REQUEST);
    }

}
