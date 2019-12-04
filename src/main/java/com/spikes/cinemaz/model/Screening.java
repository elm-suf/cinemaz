package com.spikes.cinemaz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Screening {
    @Id
    @GeneratedValue
    @Getter
    Long id;
    @ManyToOne
    @Getter
    @Setter
    Hall hall;
    @ManyToOne
    @Getter
    @Setter
    Cinema cinema;
    @OneToOne
    @Getter
    @Setter
    Movie movie;
    @Getter
    @Setter
    Date date;

}
