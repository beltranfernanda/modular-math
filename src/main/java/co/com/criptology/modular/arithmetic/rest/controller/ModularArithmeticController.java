package co.com.criptology.modular.arithmetic.rest.controller;

import co.com.criptology.modular.arithmetic.rest.dto.SuccessResDto;
import co.com.criptology.modular.arithmetic.service.IModularArithmeticService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ModularArithmeticController {

    IModularArithmeticService modArithmetic;

    @Autowired
    public ModularArithmeticController(IModularArithmeticService modArithmetic){
        this.modArithmetic = modArithmetic;
    }

    @Operation(summary = "Adicion modular dados dos numeros y el modulo.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operacion exitosa",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
            @ApiResponse(responseCode = "400", description = "Numeros mayores o iguales al modulo no aplican",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
    })
    @GetMapping("/sum/{num1}/{num2}/{modulo}")
    public ResponseEntity<SuccessResDto> modularAddition(@PathVariable("num1") int num1, @PathVariable("num2") int num2, @PathVariable("modulo") int modulo){
        int result = modArithmetic.sum(num1, num2, modulo);
        SuccessResDto response = new SuccessResDto("Modular addition", num1, num2, modulo, result);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "Multiplicacion modular dados dos numeros y el modulo.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operacion exitosa",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
            @ApiResponse(responseCode = "400", description = "Numeros mayores o iguales al modulo no aplican",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
    })
    @GetMapping("/product/{num1}/{num2}/{modulo}")
    public ResponseEntity<SuccessResDto> modularMultiplication(@PathVariable("num1") int num1, @PathVariable("num2") int num2, @PathVariable("modulo") int modulo){
        int result = modArithmetic.product(num1, num2, modulo);
        SuccessResDto response = new SuccessResDto("Modular multiplication", num1, num2, modulo, result);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "Resta modular dados dos numeros y el modulo.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operacion exitosa",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
            @ApiResponse(responseCode = "400", description = "Numeros mayores o iguales al modulo no aplican",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
    })
    @GetMapping("/subtract/{num1}/{num2}/{modulo}")
    public ResponseEntity<SuccessResDto> modularSubtraction(@PathVariable("num1") int num1, @PathVariable("num2") int num2, @PathVariable("modulo") int modulo){
        int result = modArithmetic.subtract(num1, num2, modulo);
        SuccessResDto response = new SuccessResDto("Modular subtraction", num1, num2, modulo, result);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "Division modular dados dos numeros y el modulo.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operacion exitosa",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
            @ApiResponse(responseCode = "400", description = "Numeros mayores o iguales al modulo no aplican",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class))}),
    })
    @GetMapping("/division/{num1}/{num2}/{modulo}")
    public ResponseEntity<SuccessResDto> modularDivision(@PathVariable("num1") int num1, @PathVariable("num2") int num2, @PathVariable("modulo") int modulo){
        int result = modArithmetic.division(num1, num2, modulo);
        SuccessResDto response = new SuccessResDto("Modular division", num1, num2, modulo, result);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
