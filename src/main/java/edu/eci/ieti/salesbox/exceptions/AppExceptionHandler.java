/*package edu.eci.ieti.salesbox.exceptions;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.time.ZonedDateTime;

@ControllerAdvice
public class AppExceptionHandler{

    @ExceptionHandler(AppRequestException.class)
    public ResponseEntity<Object> handleAppRequestException(AppRequestException e){
        //payload containing exception details
        AppException apiException = new AppException(e.getMessage(),HttpStatus.BAD_REQUEST,ZonedDateTime.now(ZoneId.of("Z")));
        return new ResponseEntity<>(apiException,HttpStatus.BAD_REQUEST);
    }
}
*/