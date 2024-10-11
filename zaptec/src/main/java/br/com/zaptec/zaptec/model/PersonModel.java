package br.com.zaptec.zaptec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Getter
@Setter

@Table(name="pessoas")
public class PersonModel {

    @Id
    @GeneratedValue
    private Integer id_pessoa;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String apelido;

    @Date
    private Date data_nascimento
}
