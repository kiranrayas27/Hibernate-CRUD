package com.msedcl.main;

import com.msedcl.main.util.DeleteEmployee;

public class MainClass {
public static void main(String[] args) {
	System.out.println("new project begins here for employee - CRUD operations");
	DeleteEmployee d = new DeleteEmployee();
	d.deleteEmployee();
}
}
