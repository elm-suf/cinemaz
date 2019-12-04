package com.spikes.cinemaz.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Hall {
    @Id
    @GeneratedValue
    @Getter
    Long id;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    @OneToMany
    List<Seat> seats;
    @Getter
    @Setter
    @ManyToOne
    Cinema cinema;


}

