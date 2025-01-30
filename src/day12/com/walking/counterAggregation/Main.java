package day12.com.walking.counterAggregation;

import day12.com.walking.counterAggregation.model.Counter;

public class Main {
    public static final String GAS_COUNTER_NAME = "Газ";
    public static final String COLD_WATER_COUNTER_NAME = "Холодная вода";
    public static final String HOT_WATER_COUNTER_NAME = "Горячая вода";
    public static final String ELECTRIC_COUNTER_NAME = "Электричество";

    public static final String M_3_UNIT = "м3";
    public static final String KW_H_UNIT = "кВт/ч";

    public static void main(String[] args) {

    }

    private static void printCounterValues(Counter[] counters){
        for(Counter counter: counters){
            System.out.printf("%s: %s\n", counter.getName(), counter.getValue());
        }
    }
}
