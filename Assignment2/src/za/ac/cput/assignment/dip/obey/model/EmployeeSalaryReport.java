package za.ac.cput.assignment.dip.obey.model;

import java.math.BigDecimal;

/**
 *
 * @author Zac Blazic
 */

public final class EmployeeSalaryReport
{
    private final int numberEmployees;
    private final BigDecimal highestSalary;
    private final BigDecimal lowestSalary;
    private final BigDecimal averageSalary;

    public EmployeeSalaryReport(int numberEmployees, BigDecimal highestSalary, BigDecimal lowestSalary, BigDecimal averageSalary) 
    {
        this.numberEmployees = numberEmployees;
        this.highestSalary = highestSalary;
        this.lowestSalary = lowestSalary;
        this.averageSalary = averageSalary;
    }

    public BigDecimal getAverageSalary() 
    {
        return averageSalary;
    }

    public BigDecimal getHighestSalary() 
    {
        return highestSalary;
    }

    public BigDecimal getLowestSalary() 
    {
        return lowestSalary;
    }

    public int getNumberEmployees() 
    {
        return numberEmployees;
    }

    @Override
    public String toString() 
    {
        return "EmployeeSalaryReport{" + "numberEmployees=" + numberEmployees + ", averageSalary=" + averageSalary + ", highestSalary=" + highestSalary + ", lowestSalary=" + lowestSalary + '}';
    }
}
