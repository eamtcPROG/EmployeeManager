package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	public static void ShowMeniu(){
		System.out.println("\t\t\t-----------------------------Meniu-----------------------------");
		System.out.println("\t\t\t--------------------- 1 - Add     -----------------------------");
		System.out.println("\t\t\t--------------------- 2 - Edit    -----------------------------");
		System.out.println("\t\t\t--------------------- 3 - Delete  -----------------------------");
		System.out.println("\t\t\t--------------------- 4 - View    -----------------------------");
		System.out.println("\t\t\t--------------------- 5 - Exit    -----------------------------");
	}
	public static void ShowMeniu2(){
		System.out.println("\t\t\t-----------------------------Meniu-----------------------------");
		System.out.println("\t\t\t--------------------- 1 - Edit nume     ----------------------------");
		System.out.println("\t\t\t--------------------- 2 - Edit prenume    --------------------------");
		System.out.println("\t\t\t--------------------- 3 - Edit idnp   -------------------------------");
		System.out.println("\t\t\t--------------------- 4 - Edit gen    ----------------------------");
	}
    public static void main(String[] args) {
		EmployeeManager employeeManager = new EmployeeManager();
		ArrayList employeeList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		byte finish = 0;
		char input;
		int id =0 ; String nume,prenume,idnp,gen;
		try {
			do {
				clearScreen();
				ShowMeniu();
				input = scan.next().charAt(0);
				switch (input) {
					case '1': {
						clearScreen();
						System.out.println("Add");
						//System.out.println("Enter id:");

						System.out.println("Enter nume:");
						scan.nextLine();
						nume = scan.nextLine();
						System.out.println("Enter prenume:");
						prenume = scan.nextLine();
						System.out.println("Enter idnp:");
						idnp = scan.nextLine();
						System.out.println("Enter gen:");
						gen = scan.nextLine();

						employeeManager.Add(employeeList, nume, prenume, idnp, gen);
						break;
					}
					case '2': {
						clearScreen();
						System.out.println("Edit");
						System.out.println("Enter nr employee:");
						id = scan.nextInt();
						ShowMeniu2();
						input = scan.next().charAt(0);
						scan.nextLine();
						switch (input) {
							case '1':{
								clearScreen();
								System.out.println("Enter nume:");
								nume = scan.nextLine();
								employeeManager.EditNume(employeeList, id, nume);
								break;
							}
							case '2':{
								clearScreen();
								System.out.println("Enter prenume:");
								prenume = scan.nextLine();
								employeeManager.EditPrenume(employeeList, id,prenume);
								break;
							}
							case '3':{
								clearScreen();
								System.out.println("Enter idnp:");
								idnp = scan.nextLine();
								employeeManager.EditIdnp(employeeList, id,idnp);
								break;
							}
							case '4':{
								clearScreen();
								System.out.println("Enter gen:");
								gen = scan.nextLine();
								employeeManager.EditGen(employeeList, id,gen);
								break;
							}
							default: {
								clearScreen();
								System.out.print("Enter 1|2|3|4|5 only");
							}
						}

						//scan.nextLine();

						break;
					}
					case '3': {
						clearScreen();
						System.out.println("Delete");
						System.out.println("Enter nr:");
						id = scan.nextInt();
						employeeManager.Delete(employeeList, id);
						break;
					}
					case '4': {
						clearScreen();
						System.out.println("View");
						employeeManager.View(employeeList);
						break;
					}
					case '5': {
						clearScreen();
						System.out.println("Exit");
						finish = 1;
						break;
					}
					default: {
						clearScreen();
						System.out.print("Enter 1|2|3|4|5 only");
					}
				}

			} while (finish != 1);
		}catch (Exception e){
			System.out.print("Error");
		}
    }
}
