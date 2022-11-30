package com.ejb.calc;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.java.ejb.Employ;
import com.java.ejb.EmployCrudBeanRemote;

public class EmploySearchMain {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		   EmployCrudBeanRemote service = null;
		    service = (EmployCrudBeanRemote)
		    		new InitialContext().lookup("EmployBean/remote");
		Employ employ = service.searchEmployBean(empno);
		if (employ!=null) {
			System.out.println(employ);
		}

	}
}