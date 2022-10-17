package oop;

public enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static void main(String[] args) {
        System.out.println(DaysOfWeek.valueOf(String.valueOf(SATURDAY)));
    }
}

