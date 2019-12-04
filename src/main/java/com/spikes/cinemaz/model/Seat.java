package com.spikes.cinemaz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    @Id
    @GeneratedValue
    @Getter
    Long id;
    @Getter
    @Setter
    int row;
    @Getter
    @Setter
    int col;
    @Getter
    @Setter
    boolean isFree;
    @Getter
    @Setter
    @ManyToOne
    Cinema cinema;
}
