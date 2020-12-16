package com.markedline.task01.entity.base;

import com.markedline.task01.entity.*;
import com.markedline.task01.entity.criteria.CriteriaList;

import java.util.Map;

public class ApplianceFactory {
    public static Appliance createAppliance(ApplianceType type, Map<String, Object> map) {

        switch (type) {
            case OVEN -> {
                if (!map.containsKey(CriteriaList.Oven.POWER_CONSUMPTION.name()) ||
                        !map.containsKey(CriteriaList.Oven.WEIGHT.name()) ||
                        !map.containsKey(CriteriaList.Oven.CAPACITY.name()) ||
                        !map.containsKey(CriteriaList.Oven.DEPTH.name()) ||
                        !map.containsKey(CriteriaList.Oven.HEIGHT.name()) ||
                        !map.containsKey(CriteriaList.Oven.WIDTH.name())
                ) return null;
                return new Oven(
                        Integer.parseInt(map.get(CriteriaList.Oven.POWER_CONSUMPTION.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Oven.WEIGHT.name()).toString()),
                        Integer.parseInt(map.get(CriteriaList.Oven.CAPACITY.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Oven.DEPTH.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Oven.HEIGHT.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Oven.WIDTH.name()).toString())
                );
            }
            case LAPTOP -> {
                if (!map.containsKey(CriteriaList.Laptop.BATTERY_CAPACITY.name()) ||
                        !map.containsKey(CriteriaList.Laptop.OS.name()) ||
                        !map.containsKey(CriteriaList.Laptop.MEMORY_ROM.name()) ||
                        !map.containsKey(CriteriaList.Laptop.SYSTEM_MEMORY.name()) ||
                        !map.containsKey(CriteriaList.Laptop.CPU.name()) ||
                        !map.containsKey(CriteriaList.Laptop.DISPLAY_INCHES.name())
                ) return null;
                return new Laptop(
                        Double.parseDouble(map.get(CriteriaList.Laptop.BATTERY_CAPACITY.name()).toString()),
                        map.get(CriteriaList.Laptop.OS.name()).toString(),
                        Double.parseDouble(map.get(CriteriaList.Laptop.MEMORY_ROM.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Laptop.SYSTEM_MEMORY.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Laptop.CPU.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Laptop.DISPLAY_INCHES.name()).toString())
                );
            }
            case REFRIGERATOR -> {
                if (!map.containsKey(CriteriaList.Refrigerator.POWER_CONSUMPTION.name()) ||
                        !map.containsKey(CriteriaList.Refrigerator.WEIGHT.name()) ||
                        !map.containsKey(CriteriaList.Refrigerator.FREEZER_CAPACITY.name()) ||
                        !map.containsKey(CriteriaList.Refrigerator.OVERALL_CAPACITY.name()) ||
                        !map.containsKey(CriteriaList.Refrigerator.HEIGHT.name()) ||
                        !map.containsKey(CriteriaList.Refrigerator.WIDTH.name())
                ) return null;
                return new Refrigerator(
                        Double.parseDouble(map.get(CriteriaList.Refrigerator.POWER_CONSUMPTION.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Refrigerator.WEIGHT.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Refrigerator.FREEZER_CAPACITY.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Refrigerator.OVERALL_CAPACITY.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Refrigerator.HEIGHT.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.Refrigerator.WIDTH.name()).toString())
                );
            }
            case VACUUMCLEANER -> {
                if (!map.containsKey(CriteriaList.VacuumCleaner.POWER_CONSUMPTION.name()) ||
                        !map.containsKey(CriteriaList.VacuumCleaner.FILTER_TYPE.name()) ||
                        !map.containsKey(CriteriaList.VacuumCleaner.BAG_TYPE.name()) ||
                        !map.containsKey(CriteriaList.VacuumCleaner.WAND_TYPE.name()) ||
                        !map.containsKey(CriteriaList.VacuumCleaner.MOTOR_SPEED_REGULATION.name()) ||
                        !map.containsKey(CriteriaList.VacuumCleaner.CLEANING_WIDTH.name())
                ) return null;
                return new VacuumCleaner(
                        Double.parseDouble(map.get(CriteriaList.VacuumCleaner.POWER_CONSUMPTION.name()).toString()),
                        map.get(CriteriaList.VacuumCleaner.FILTER_TYPE.name()).toString(),
                        map.get(CriteriaList.VacuumCleaner.BAG_TYPE.name()).toString(),
                        map.get(CriteriaList.VacuumCleaner.WAND_TYPE.name()).toString(),
                        Double.parseDouble(map.get(CriteriaList.VacuumCleaner.MOTOR_SPEED_REGULATION.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.VacuumCleaner.CLEANING_WIDTH.name()).toString())
                );
            }
            case TABLETPC -> {
                if (!map.containsKey(CriteriaList.TabletPC.BATTERY_CAPACITY.name()) ||
                        !map.containsKey(CriteriaList.TabletPC.DISPLAY_INCHES.name()) ||
                        !map.containsKey(CriteriaList.TabletPC.MEMORY_ROM.name()) ||
                        !map.containsKey(CriteriaList.TabletPC.FLASH_MEMORY_CAPACITY.name()) ||
                        !map.containsKey(CriteriaList.TabletPC.COLOR.name())
                ) return null;
                return new TabletPC(
                        Double.parseDouble(map.get(CriteriaList.TabletPC.BATTERY_CAPACITY.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.TabletPC.DISPLAY_INCHES.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.TabletPC.MEMORY_ROM.name()).toString()),
                        Double.parseDouble(map.get(CriteriaList.TabletPC.FLASH_MEMORY_CAPACITY.name()).toString()),
                        map.get(CriteriaList.TabletPC.COLOR.name()).toString()
                );
            }
            case SPEAKERS -> {
                if (!map.containsKey(CriteriaList.Speakers.POWER_CONSUMPTION.name()) ||
                        !map.containsKey(CriteriaList.Speakers.NUMBER_OF_SPEAKERS.name()) ||
                        !map.containsKey(CriteriaList.Speakers.FREQUENCY_RANGE.name()) ||
                        !map.containsKey(CriteriaList.Speakers.CORD_LENGTH.name())
                ) return null;
                return new Speakers(
                        Double.parseDouble(map.get(CriteriaList.Speakers.POWER_CONSUMPTION.name()).toString()),
                        Integer.parseInt(map.get(CriteriaList.Speakers.NUMBER_OF_SPEAKERS.name()).toString()),
                        map.get(CriteriaList.Speakers.FREQUENCY_RANGE.name()).toString(),
                        Double.parseDouble(map.get(CriteriaList.Speakers.CORD_LENGTH.name()).toString())
                );
            }
            default -> {
                return null;
            }
        }
    }
}
