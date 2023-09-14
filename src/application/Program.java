package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\ws-eclipse\\Interface_Comparable\\EmployeeList.txt";
		List <Employee> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				String[]fields = line.split(",");
			list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
			line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		Collections.sort(list);
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
	}

}
