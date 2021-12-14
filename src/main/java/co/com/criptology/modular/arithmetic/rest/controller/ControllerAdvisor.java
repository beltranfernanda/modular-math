package co.com.criptology.modular.arithmetic.rest.controller;

import co.com.criptology.modular.arithmetic.rest.dto.ErrorResDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResDto> numberGreaterOrEqualThanModulo(){
        ErrorResDto response = new ErrorResDto("Error", "The numbers cannot be greater or equal than modulo");
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ErrorResDto> DivisionError(ArithmeticException e){
        ErrorResDto response = new ErrorResDto("Error", e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResDto> handleAllExceptions(){
        ErrorResDto response = new ErrorResDto("Error", "Something wrong happened");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
