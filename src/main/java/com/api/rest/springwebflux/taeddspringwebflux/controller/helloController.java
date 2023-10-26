package com.api.rest.springwebflux.taeddspringwebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api")
public class helloController {

    @GetMapping("/mono")
    public Mono<String> getMono(){
        return Mono.just("EJEMPLO DE FLUJO DE UN SOLO ELEMENTO");

    }

    @GetMapping("/flux")
    public Flux<Integer> getNumeros(){
        return Flux.range(1,100);

    }

}
