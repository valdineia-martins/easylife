package com.easylife.easyapi.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@Data
@Entity
@Table(name = "RESERVA")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESERVA_SEQ")
    @SequenceGenerator(name = "RESERVA_SEQ", sequenceName = "RESERVA_SEQ", allocationSize = 1)
    @Column(name = "ID_RESERVA")
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "espaco_comum")
    private EspacoComum espacoComum;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa")
    private Pessoa pessoa;

    @Column(name = "DATA_RESERVA")
    @NotNull
    private Date dataReserva;

}
