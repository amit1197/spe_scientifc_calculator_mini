package com.iiitb.spe_scientifc_calculator_mini.controller;

import com.iiitb.spe_scientifc_calculator_mini.SpeScientifcCalculatorMiniApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*")
@RestController
public class controller {

    private static final Logger logger = LogManager.getLogger(SpeScientifcCalculatorMiniApplication.class);

    @PostMapping("/sqrt/{num}")
    public ResponseEntity<?> sqrt(@PathVariable String num){
        int number = Integer.parseInt(num);
        logger.info("Calculating Square Root of : " + number + "\n Result : " + Math.sqrt(number));
        return ResponseEntity.ok(Math.sqrt(number));
    }
    @PostMapping("/factorial/{num}")
    public ResponseEntity<?> factorial(@PathVariable String num){
        int number = Integer.parseInt(num);
        double fact = 1;
        if(number < 0){
            logger.info("Factorial of negative number is not possible!");
        }
        else {
            fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
        }
        logger.info("Factorial of the number : " + number + "\n Result is : " + number);
        return ResponseEntity.ok(fact);
    }
    @PostMapping("/log/{num}")
    public ResponseEntity<?> log(@PathVariable String num){
        double number = Double.parseDouble(num);
        logger.info("Calculating Natural Logarithm of : " + number + "\n Result : " + Math.log(number));
        return ResponseEntity.ok(Math.log(number));
    }
    @PostMapping("/power/{num1}/{num2}")
    public ResponseEntity<?> log(@PathVariable String num1,@PathVariable String num2){
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);
        logger.info("Power : " + number1 + "^" + number2 + "/n Result : " + Math.pow(number1, number2));
        return ResponseEntity.ok(Math.pow(number1, number2));
    }
}

