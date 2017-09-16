/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/
package com.testdefaultprefabs.bubbledata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Bubble generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`bubble`")
public class Bubble implements Serializable {

    private Integer id;
    private String name;
    private Double lifeExpectency;
    private Double fertilityRate;
    private String region;
    private Double population;
    private Double area;
    private Double density;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`name`", nullable = true, length = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`lifeExpectency`", nullable = true, scale = 4, precision = 12)
    public Double getLifeExpectency() {
        return this.lifeExpectency;
    }

    public void setLifeExpectency(Double lifeExpectency) {
        this.lifeExpectency = lifeExpectency;
    }

    @Column(name = "`fertilityRate`", nullable = true, scale = 4, precision = 12)
    public Double getFertilityRate() {
        return this.fertilityRate;
    }

    public void setFertilityRate(Double fertilityRate) {
        this.fertilityRate = fertilityRate;
    }

    @Column(name = "`region`", nullable = true, length = 20)
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Column(name = "`population`", nullable = true, scale = 4, precision = 12)
    public Double getPopulation() {
        return this.population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    @Column(name = "`area`", nullable = true, scale = 4, precision = 12)
    public Double getArea() {
        return this.area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Column(name = "`density`", nullable = true, scale = 4, precision = 12)
    public Double getDensity() {
        return this.density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bubble)) return false;
        final Bubble bubble = (Bubble) o;
        return Objects.equals(getId(), bubble.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

