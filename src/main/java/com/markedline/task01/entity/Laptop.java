package com.markedline.task01.entity;

import com.markedline.task01.entity.base.Appliance;

import java.util.Objects;

public class Laptop extends Appliance {

    private Double batteryCapacity;
    private String os;
    private Double memoryROM;
    private Double systemMemory;
    private Double cpu;
    private Double displayInches;

    public Laptop() {}

    public Laptop(Double batteryCapacity, String os, Double memoryROM, Double systemMemory, Double cpu, Double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(batteryCapacity, laptop.batteryCapacity) &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(memoryROM, laptop.memoryROM) &&
                Objects.equals(systemMemory, laptop.systemMemory) &&
                Objects.equals(cpu, laptop.cpu) &&
                Objects.equals(displayInches, laptop.displayInches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryROM, systemMemory, cpu, displayInches);
    }

    @Override
    public String
    toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryROM=" + memoryROM +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
