package com.brbl.association;

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank bank = new Bank("Axis"); 
	        Employee emp = new Employee("lp"); 
	          
	        System.out.println(emp.getEmployeeName() +  
	               " is employee of " + bank.getBankName()); 
	}

}
