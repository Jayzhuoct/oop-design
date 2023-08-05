package design2;

import java.util.ArrayList;
import java.util.Scanner;
//a.显示所有员工信息
//b.添加员工
//c.删除员工
//d.按编号查询员工基本信息
//e.按编号修改职称
//f.按编号修改岗位
//g.按编号修改销售额
@SuppressWarnings("resource")
public class EmployeesManagement {

	ArrayList<Employee> employees = new ArrayList<>();

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public void show() {// a.显示所有员工信息
		for (int i = 0; i < employees.size(); i++) {
			
			System.out.println(employees.get(i));
		}
	}

	public void add(Employee e) {// b.添加员工
		employees.add(e);
	}


	public boolean delete(String num) {
		int a = 0;
		for (int i = 0; i < employees.size(); i++)
			if (num.equals(employees.get(i).getNum())) {
				employees.remove(i);a++;break;
			}
		if (a == 1) {
			return true;
		}
		return false;
		
	}

	public Employee findByNum(String num) {// d.按编号查询员工基本信息
		for (int i = 0; i < employees.size(); i++)
			if (num.equals(employees.get(i).getNum())) {
				return employees.get(i);
			}
		return null;
	}

	public void modifyProfessionaltitleBynum(String num) {// e.按编号修改职称
		System.out.println("请输入要修改的职称：");
		
		Scanner scanner = new Scanner(System.in);
		String professionaltitle = scanner.next();
		findByNum(num).setProfessionaltitle(professionaltitle);
		System.out.println(employees);
	}

	public void modifyjobBynum(String num) {// f.按编号修改岗位
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入要修改的岗位：");
		int job = sca.nextInt();
		findByNum(num).setJob(job);
		System.out.println(" " + employees);
	}

	public void modifypersonsaleAmountBynum(String num) {// g.按编号修改销售额
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改的销售额：");
		double personsaleamount = sc.nextDouble();
		findByNum(num).setPersonsaleamount(personsaleamount);
		System.out.println(employees);
	}

	public void showSalaryBynum(String num) {// 按编号显示员工工资信息
		System.out.println("编号" + num);
		System.out.println("姓名:" + findByNum(num).getName());
		System.out.println("实发工资:" + findByNum(num).netSalary());
	}

	public void showSalaryInfo() {// 显示所有员工工资信息
		for (int i = 0; i < employees.size(); i++) {
			System.out.println("--------------------");
			System.out.println("编号：" + employees.get(i).getNum());
			System.out.println("姓名:" + employees.get(i).getName());
			System.out.println("实发工资:" + employees.get(i).netSalary());
		}
	}
}
