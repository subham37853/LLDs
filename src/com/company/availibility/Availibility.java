package com.company.availibility;

import java.util.HashMap;

public class Availibility {
    private final HashMap<Integer, Integer> timing = new HashMap<>();
    private final String days;
    //private final String date;

    public Availibility(int from, int to, String days) {
        this.days = days;
        assert false;
        this.timing.put(from, to);
        //this.date = date;
    }

    public HashMap<Integer, Integer> getTiming() {
        return timing;
    }

    public String getDays() {
        return days;
    }

//    public String getDate(){
//        return this.getDate();
//    }
}
