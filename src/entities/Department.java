package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Integer payDay;

    private List<Employee> employees= new ArrayList<>();
    private Address address;

    public Department(){

    }

    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double payroll() {
        double sum = 0;
        for (Employee c: employees) {
            sum += c.getSalary();
        }
        return sum;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Folha de pagamento: \n");
        sb.append("Departamento ");
        sb.append(getName() +" = ");
        sb.append(String.format("%.2f \n", payroll()));
        sb.append("Pagamento realizado no dia ");
        sb.append(getPayDay() +"\n");
        sb.append("Funcionarios: \n");
        for (Employee c: employees) {
            sb.append(c.getName() + "\n");
        }
        sb.append("Para duvidas favor entrar em contato: ");
        sb.append(address.getEmail());
        return sb.toString();
    }
}
