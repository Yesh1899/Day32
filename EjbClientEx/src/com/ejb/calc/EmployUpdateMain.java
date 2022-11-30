package com.ejb.calc;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.java.ejb.Employ;
import com.java.ejb.EmployCrudBeanRemote;

public class EmployUpdateMain {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		EmployCrudBeanRemote service = null;
	    service = (EmployCrudBeanRemote)
	    		new InitialContext().lookup("EmployBean/remote");
	    Scanner sc=new Scanner(System.in);
	    Employ employ = new Employ();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextInt());
		System.out.println(service.updateEmployBean(employ));
	
	}

}
