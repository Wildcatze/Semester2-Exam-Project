package com.demo.nmr.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TermsAndCond {

    @Id
    private int tc_id;
    private String season;
    private int rent_days;
    private int km;
    private String fuel_tank;
    private String cancellation;

    public TermsAndCond() {
    }

    public int getTc_id() {
        return tc_id;
    }

    public void setTc_id(int tc_id) {
        this.tc_id = tc_id;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getRent_days() {
        return rent_days;
    }

    public void setRent_days(int rent_days) {
        this.rent_days = rent_days;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getFuel_tank() {
        return fuel_tank;
    }

    public void setFuel_tank(String fuel_tank) {
        this.fuel_tank = fuel_tank;
    }

    public String getCancellation() {
        return cancellation;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }
}