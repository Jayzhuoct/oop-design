package design2;

import java.util.ArrayList;

public class DepartmentManagement {
	ArrayList<Department> department = new ArrayList<Department>();

	public ArrayList<Department> getDepartment() {
		return department;
	}

	public void setDepartment(ArrayList<Department> department) {
		this.department = department;
	}

	public void add(Department d) {// a.��Ӳ���
		department.add(d);
	}

	public boolean addSaleEmployeeboolean(String num, String name, String sex, int age, String professionaltitle,
			String educationbackground, String department, boolean ispartymember, Double personsaleamount) {
		int a = 0;
		for (int i = 0; i < this.getDepartment().size(); i++) {
			if (department.equals(this.getDepartment().get(i).getDname())) {
				this.getDepartment().get(i).getEmployees().add(new SaleEmployee// ��ӽ����Ź���ϵͳ
				(num, name, sex, age, professionaltitle, educationbackground, department, ispartymember,
						personsaleamount));
				a++;break;
			}
		}
		if (a == 1) {
			return true;
		}
		return false;
	}


	
	
	public boolean addGeneralEmployeebloolean(String num, String name, String sex, int age, String professionaltitle,
			String educationbackground, String department, boolean ispartymember, int job) {
		int a = 0;
		for (int i = 0; i < this.getDepartment().size(); i++) {
			if (department.equals(this.getDepartment().get(i).getDname())) {
				this.getDepartment().get(i).getEmployees().add(new GeneralEmployee// ��ӽ����Ź���ϵͳ
(num, name, sex, age, professionaltitle, educationbackground, department, ispartymember,job));
				a++;break;
			}
		}
		if (a == 1) {
			return true;
		}
		return false;
	}

	public boolean delete(String num) {// b.ɾ������
		int a = 0;
		for (int i = 0; i < department.size(); i++)
			if (num.equals(department.get(i).getDno())) {
				department.remove(i);a++;break;
			}
		if (a == 1) {
			return true;
		}
		return false;
		
	}

	public void showEmployeeByDno(String dno) {// d.�����ű����ʾԱ����Ϣ
		for (int i = 0; i < department.size(); i++)
			if (dno.equals(department.get(i).getDno())) {
				System.out.println(department.get(i));
				System.out.println(department.get(i).getEmployees());
			}

	}

	public void findDepartmentByDno(String dno) {// c.�����ű�Ų�ѯ����
		for (int i = 0; i < department.size(); i++)
			if (dno.equals(department.get(i).getDno())) {
				System.out.println(department.get(i));
			}
	}

	public void showDepartments() {// e.��ʾ������Ϣ
		for (int i = 0; i < department.size(); i++) {
			System.out.println(department.get(i) + " ");
		}
	}

}
