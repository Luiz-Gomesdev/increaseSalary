package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter employee name: ");
		emp.name = sc.nextLine();
		System.out.println("Enter the gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Enter the tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.println("Which percentage to increase salaray? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + emp);
		
		
		sc.close();
	}

}
