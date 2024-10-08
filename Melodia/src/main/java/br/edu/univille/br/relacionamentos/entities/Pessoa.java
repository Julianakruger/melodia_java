package br.edu.univille.br.relacionamentos.entities;

import java.util.List;

import jakarta.persistence.*;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String email;

    private boolean verificado;

    @OneToMany
    @JoinColumn(name = "pessoa_id")
    private List<Playlist> playlists;
}
