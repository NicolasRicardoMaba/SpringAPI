package br.com.projeto.api.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Control {
    @GetMapping("")
    public String message () {

        return "A";
    }    







}
