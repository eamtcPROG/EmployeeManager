package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void clearScreen() {
		//
	}
	public static void ShowMeniu(){
		System.out.println("\t\t\t-----------------------------Meniu-----------------------------");
		System.out.println("\t\t\t--------------------- 1 - Add     -----------------------------");
		System.out.println("\t\t\t--------------------- 2 - Edit    -----------------------------");
		System.out.println("\t\t\t--------------------- 3 - Delete  -----------------------------");
		System.out.println("\t\t\t--------------------- 4 - View    -----------------------------");
		System.out.println("\t\t\t--------------------- 5 - Exit    -----------------------------");
	}

    public static void main(String[] args) {
	    Employee employee = new Employee();
		EmployeeManager employeeManager = new EmployeeManager();
		List employeeList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		byte finish = 0;
		char input;
		do {
			clearScreen();
			ShowMeniu();
			input = scan.next().charAt(0);
			switch (input){
				case '1':{
					clearScreen();
					System.out.print("Add");
					break;
				}
				case '2':{
					clearScreen();
					System.out.print("Edit");
					break;
				}
				case '3':{
					clearScreen();
					System.out.print("Delete");
					break;
				}
				case '4':{
					clearScreen();
					System.out.print("View");
					break;
				}
				case '5':{
					clearScreen();
					System.out.print("Exit");
					finish = 1;
					break;
				}
				default:{
					clearScreen();
					System.out.print("Enter 1|2|3|4|5 only");
				}
			}

		}while (finish != 1);
    }
}
