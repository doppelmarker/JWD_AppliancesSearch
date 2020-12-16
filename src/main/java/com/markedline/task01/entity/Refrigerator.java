package com.markedline.task01.entity;

import com.markedline.task01.entity.base.Appliance;

import java.util.Objects;

public class Refrigerator extends Appliance {

    private Double powerConsumption;
    private Double weight;
    private Double freezerCapacity;
    private Double overallCapacity;
    private Double height;
    private Double width;

    public Refrigerator() {}

    public Refrigerator(Double powerConsumption, Double weight, Double freezerCapacity, Double overallCapacity, Double height, Double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(freezerCapacity, that.freezerCapacity) &&
                Objects.equals(overallCapacity, that.overallCapacity) &&
                Objects.equals(height, that.height) &&
                Objects.equals(width, that.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
