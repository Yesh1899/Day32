package com.ejb.calc;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.java.ejb.Employ;
import com.java.ejb.EmployCrudBeanRemote;

public class EmployShowAllMain {

	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		   EmployCrudBeanRemote service = null;

		    // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");

		    // service = (HelloService)new
		    // InitialContext().lookup("java:comp/env/ejb/HelloService");
		    service = (EmployCrudBeanRemote)
		    		new InitialContext().lookup("EmployBean/remote");

		    List<Employ> employList = service.showEmployBean();
		    for (Employ employ : employList) {
				System.out.println(employ);
			}

	}
}