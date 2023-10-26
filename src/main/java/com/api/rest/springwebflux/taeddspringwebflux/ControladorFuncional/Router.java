package com.api.rest.springwebflux.taeddspringwebflux.ControladorFuncional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> functionalRoutes(Handler handler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/functional/mono"),handler::mostrarMensajeMono)
                .andRoute(RequestPredicates.GET("/functional/flux"), handler::mostrarNumerosFlux);
    }


}
