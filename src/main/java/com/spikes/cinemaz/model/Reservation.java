package com.spikes.cinemaz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue
    @Getter
    Long id;
    @Getter
    @Setter
    @OneToOne
    Seat seat;
    @Getter
    @Setter
    @OneToOne
    User user;
    @Getter
    @Setter
    @OneToOne
    Screening screening;
}
