package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int ano;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("carros")
    private Marca marca;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "carro_proprietario")
    private List<Proprietario> proprietarios;
}
