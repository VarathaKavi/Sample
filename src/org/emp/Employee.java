package org.emp;
public class Employee {
	private void empId() {
		System.out.println("12344");
}
	private void empName() {
System.out.println("Kavi");
	}
private void empDob() {
System.out.println("09.06.2020");
}
private void empPhone() {
System.out.println("987654321");
}
private void empEmail() {
System.out.println("emp@123");
}
private void empAddress() {
System.out.println("chennai");
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
}
}
