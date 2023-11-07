package angelomoreno.Es2_071123.entities;

import angelomoreno.Es2_071123.enums.Categoria;
import lombok.*;

@Getter
@Setter
@ToString
public class Blog {
    private long id;
    private Categoria categoria;
    private String titolo;
    private String contenuto;
    private long minutiLettura;
}
