package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class HRManager extends Employee{

    private List<Employee> employeeList;
    private int workours;

    public HRManager(int id, String name, double salary, int workHours) {
        super(id, name, salary);
        this.workours  = workHours;
        this.employeeList = new ArrayList<Employee>();
    }

    public int getWorkHours() {
        return workours;
    }

    public List<Employee> addEmployee(Employee e) {
            employeeList.add(e);

            return employeeList;
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "employeeList=" + employeeList +
                ", workours=" + workours +
                '}';
    }
}
