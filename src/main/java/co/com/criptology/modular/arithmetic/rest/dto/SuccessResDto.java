package co.com.criptology.modular.arithmetic.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessResDto {

    private String operation;
    private int number1;
    private int number2;
    private int modulo;
    private int result;

}
