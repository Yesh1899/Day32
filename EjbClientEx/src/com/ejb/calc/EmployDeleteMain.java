package com.ejb.calc;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.java.ejb.EmployCrudBeanRemote;

public class EmployDeleteMain {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		EmployCrudBeanRemote service = null;
	    service = (EmployCrudBeanRemote)
	    		new InitialContext().lookup("EmployBean/remote");
	    System.out.println("Enter Employ No : ");
	    Scanner sc=new Scanner(System.in);
	    int h=sc.nextInt();
	    String employ=service.deleteEmployBean(h);
	    if (employ!=null) {
	    	System.out.println("employ details deleted");
			
		}

	}
}
