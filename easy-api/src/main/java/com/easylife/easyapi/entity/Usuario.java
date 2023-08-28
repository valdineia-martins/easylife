package com.easylife.easyapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "USUARIO")
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_SEQ")
    @SequenceGenerator(name = "USUARIO_SEQ", sequenceName = "USUARIO_SEQ", schema = "EASY_LIFE", allocationSize = 1)
    @Column(name = "ID_USUARIO")
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_criacao")
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "permissao_usuario",
            joinColumns = @JoinColumn(name = "id_usuario"),
            inverseJoinColumns = @JoinColumn(name = "id_permissao"))
    private List<Permissao> permissoes;



}
