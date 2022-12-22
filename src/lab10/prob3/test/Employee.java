package lab10.prob3.test;

import java.util.Objects;

public class Employee {
    String name;

    int salary;

    public Employee(String f, int s) {
        this.name = f;
        this.salary = s;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("first name: ");
        sb.append(name);
        sb.append(" last name: ");
        sb.append(" salary: ");
        sb.append("").append(salary).append(">");
        return sb.toString();

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

