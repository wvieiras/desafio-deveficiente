package br.com.desafiocdc.cdc.request;

import br.com.desafiocdc.cdc.entity.Autor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AutorRequest {

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(max = 400)
    private String description;

    public AutorRequest(String name, String email, String description) {
        super();
        this.name = name;
        this.email = email;
        this.description = description;
    }

    public Autor toModel() {
        return new Autor(
                this.name,
                this.description,
                this.email
        );
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }
}
