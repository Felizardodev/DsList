package com.felizardodev.dslist.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "tb_anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    //private String plataforma;
    private Double nota;
    private String imgUrl;
    private String descricao;
    private String descricaoCompleta;

    public Anime() {

    }

    public Anime(Long id, String titulo, Integer ano, String genero, Double nota, String imgUrl, String descricao, String descricaoCompleta) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.nota = nota;
        this.imgUrl = imgUrl;
        this.descricao = descricao;
        this.descricaoCompleta = descricaoCompleta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(id, anime.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
