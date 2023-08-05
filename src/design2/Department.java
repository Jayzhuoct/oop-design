package design2;

import java.util.ArrayList;

import design2.Employee;


public class Department {
	 private String dno;
	 private String dname;
	 private Employee dManager;
	  ArrayList<Employee> employees=new ArrayList<Employee>();
	public Department(String dno, String dname, Employee dManager) {
		super();
		this.dno = dno;//���ű��
		this.dname = dname;//��������
		this.dManager = dManager;//���ž���
	}
	public ArrayList<Employee> getemployees() {
		return employees;
	}
	

	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Employee getdManager() {
		return dManager;
	}
	public void setdManager(Employee dManager) {
		this.dManager = dManager;
	}
	
	public  ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	public int getCount() {
		 return employees.size();
	 }
	
	
	public String toString() {
		return "�������ƣ�"+dname+"\n���ű�ţ�"+dno+"\n���ž���    \n"+dManager;
	}
	

}
