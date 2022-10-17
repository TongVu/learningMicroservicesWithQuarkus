package com.axonactive.microservices;

import lombok.Data;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import java.time.Instant;

@Data
@Schema(description = "Several ISBN numbers for books")
public class IsbnNumber {

    @Schema(required = true)
    @JsonbProperty("isbn_13")
    public String isbn13;

    @Schema(required = true)
    @JsonbProperty("isbn_10")
    public String isbn10;

    @JsonbTransient
    public Instant generationDate;
}
