package com.axonactive.microservices;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Number microservice",
                description = "This microservice generates book numbers",
                version = "1.0",
                contact = @Contact(name = "Tong Vu")
        ),
        externalDocs = @ExternalDocumentation(url = "https://quarkus.io/"),
        tags = {
               @Tag(name = "api", description = "Description for api"),
                @Tag(name = "number", description = "Description for number")
        }

)
public class NumberMicroservice extends Application {
}
