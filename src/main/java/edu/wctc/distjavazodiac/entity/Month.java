package edu.wctc.distjavazodiac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Table(name = "Month")
public class Month {
    @Id
    @Column(name = "month_id")
    private int number;
    @Column(name = "month_name")
    private String name;
}