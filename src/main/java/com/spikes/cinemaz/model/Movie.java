package com.spikes.cinemaz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue
    @Getter
    Long id;
    @Getter
    @Setter
    String title;
}
