package hassani.abdellatif.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("clients-service", r -> r.path("/clients-service/**")
                        .filters(f -> f.rewritePath("/clients-service/(?<remaining>.*)", "/${remaining}"))
                        .uri("http://localhost:8081"))
                .build();
    }
}
