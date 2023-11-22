package application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String name = sc.next();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        String phone = sc.next();

        Department department = new Department(name, payDay, new Address(email, phone));

        System.out.print("Quantos funcionarios tem o departamento ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do funcionario "+ (1 + i) +" ");
            System.out.print("Nome: ");
            String employeeName = sc.next();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(employeeName, salary);

            department.addEmployee(employee);
        }

        showReport(department);


        sc.close();
    }
    private static void showReport(Department department) {
        System.out.println(department);
    }
}
