package pl.creditapp.core;

public class Person {
    private final String name;
    private final String lastName;
    private final String mothersMaidenName;
    private final double totalMonthlyIncomeInPln;
    private final boolean married;
    private final int numOfDependants;


    public Person(String name, String lastName, String mothersMaidenName, double totalMonthlyIncomeInPln, boolean married, int numOfDependants) {
        this.name = name;
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
        this.married = married;
        this.numOfDependants = numOfDependants;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public double getTotalMonthlyIncomeInPln() {
        return totalMonthlyIncomeInPln;
    }

    public boolean isMarried() {
        return married;
    }

    public int getNumOfDependants() {
        return numOfDependants;
    }
}
