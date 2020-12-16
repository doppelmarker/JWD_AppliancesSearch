package com.markedline.task01.entity;

import com.markedline.task01.entity.base.Appliance;

import java.util.Objects;

public class Speakers extends Appliance {

    private Double powerConsumption;
    private Integer numberOfSpeakers;
    private String frequencyRange;
    private Double cordLength;

    public Speakers() {}

    public Speakers(Double powerConsumption, Integer numberOfSpeakers, String frequencyRange, Double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Objects.equals(powerConsumption, speakers.powerConsumption) &&
                Objects.equals(numberOfSpeakers, speakers.numberOfSpeakers) &&
                Objects.equals(frequencyRange, speakers.frequencyRange) &&
                Objects.equals(cordLength, speakers.cordLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }
}
