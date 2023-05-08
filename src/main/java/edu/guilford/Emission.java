package edu.guilford;

public class Emission {
    private double year;
    private double coal;
    private double solar;
    private double crudeOil;
    private double naturalGas;
    private double traditionalBiofuels;
    private double otherRenewables;
    private double hydropower;
    private double nuclear;

    public Emission(double year, double coal, double solar, double crudeOil, double naturalGas, double traditionalBiofuels, double otherRenewables, double hydropower, double nuclear) {
        this.year = year;
        this.coal = coal;
        this.solar = solar;
        this.crudeOil = crudeOil;
        this.naturalGas = naturalGas;
        this.traditionalBiofuels = traditionalBiofuels;
        this.otherRenewables = otherRenewables;
        this.hydropower = hydropower;
        this.nuclear = nuclear;
    }

    // Getters and Setters
    public double getYear() {
        return year;
    }
    public double getCoal() {
        return coal;
    }
    public double getSolar() {
        return solar;
    }
    public double getCrudeOil() {
        return crudeOil;
    }
    public double getNaturalGas() {
        return naturalGas;
    }
    public double getTraditionalBiofuels() {
        return traditionalBiofuels;
    }
    public double getOtherRenewables() {
        return otherRenewables;
    }
    public double getHydropower() {
        return hydropower;
    }
    public double getNuclear() {
        return nuclear;
    }
    public void setYear(double year) {
        this.year = year;
    }
    public void setCoal(double coal) {
        this.coal = coal;
    }
    public void setSolar(double solar) {
        this.solar = solar;
    }
    public void setCrudeOil(double crudeOil) {
        this.crudeOil = crudeOil;
    }
    public void setNaturalGas(double naturalGas) {
        this.naturalGas = naturalGas;
    }
    public void setTraditionalBiofuels(double traditionalBiofuels) {
        this.traditionalBiofuels = traditionalBiofuels;
    }
    public void setOtherRenewables(double otherRenewables) {
        this.otherRenewables = otherRenewables;
    }
    public void setHydropower(double hydropower) {
        this.hydropower = hydropower;
    }
    public void setNuclear(double nuclear) {
        this.nuclear = nuclear;
    }
}
