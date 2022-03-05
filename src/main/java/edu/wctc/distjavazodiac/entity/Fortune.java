package edu.wctc.distjavazodiac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Table(name = "Fortune")
public class Fortune {
    @Id
    @Column(name = "fortune_name")
    private int id;
    @Column(name = "fortune_text")
    private String text;
}
