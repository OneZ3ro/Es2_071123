package angelomoreno.Es2_071123.entities;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Autore {
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
}
