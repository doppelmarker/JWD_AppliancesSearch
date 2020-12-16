package com.markedline.task01.entity;

import com.markedline.task01.entity.base.Appliance;

import java.util.Objects;

public class TabletPC extends Appliance {

    private Double batteryCapacity;
    private Double displayInches;
    private Double memoryROM;
    private Double flashMemoryCapacity;
    private String color;

    public TabletPC() {}

    public TabletPC(Double batteryCapacity, Double displayInches, Double memoryROM, Double flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(batteryCapacity, tabletPC.batteryCapacity) &&
                Objects.equals(displayInches, tabletPC.displayInches) &&
                Objects.equals(memoryROM, tabletPC.memoryROM) &&
                Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryROM=" + memoryROM +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
