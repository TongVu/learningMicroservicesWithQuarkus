package com.axonactive.microservicesbook.book;

import lombok.Data;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import java.time.Instant;

@Schema(description = "This is a book")
@Data
public class Book {

    @Schema(required = true)
    @JsonbProperty("isbn_13")
    public String isbn13;

    @Schema(required = true)
    @JsonbProperty("isbn_10")
    public String isbn10;

    public String title;

    public String author;

    @JsonbProperty("year_of_publication")
    public int yearOfPublication;

    public String genre;

    @Schema(implementation = String.class, format = "date")
    @JsonbDateFormat("yyyy/dd/MM")
    @JsonbProperty("creation_date")
    public Instant creationDate;
}
