package com.api.rest.springwebflux.taeddspringwebflux.ControladorFuncional;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class Handler {

    public Mono<ServerResponse> mostrarMensajeMono(ServerRequest serverRequest){
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(
                        Mono.just("EJEMPLO CONTROLADOR FUNCIONAL TIPO MONO"), String.class
                );
    }

    public Mono<ServerResponse>mostrarNumerosFlux(ServerRequest serverRequest){
        return ServerResponse.ok()
                .body(
                        Flux.range(1,100), Integer.class
                );
    }
}
