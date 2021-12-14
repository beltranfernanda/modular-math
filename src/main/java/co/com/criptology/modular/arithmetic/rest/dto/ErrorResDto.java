package co.com.criptology.modular.arithmetic.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResDto {

    private String status;
    private String message;

}
