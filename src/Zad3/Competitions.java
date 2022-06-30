package Zad3;


import java.util.Objects;

public class Competitions {
    private String organization;
    private String fullName;
    private int birthYear;
    private double result;
    private int rankedPlace;


    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public int getRankedPlace() {
        return rankedPlace;
    }

    public void setRankedPlace(int rankedPlace) {
        this.rankedPlace = rankedPlace;
    }

    public Competitions(String organization, String fullName, int birthYear, double result, int rankedPlace) {
        this.organization = organization;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.result = result;
        this.rankedPlace = rankedPlace;
    }

    @Override
    public String toString() {
        return organization + "," + fullName + "," + birthYear + "," + result + "," + rankedPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Competitions that = (Competitions) o;
        return fullName.equals(that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}
