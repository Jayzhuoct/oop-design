package design2;

import java.util.ArrayList;
import java.util.Scanner;
//a.��ʾ����Ա����Ϣ
//b.���Ա��
//c.ɾ��Ա��
//d.����Ų�ѯԱ��������Ϣ
//e.������޸�ְ��
//f.������޸ĸ�λ
//g.������޸����۶�
@SuppressWarnings("resource")
public class EmployeesManagement {

	ArrayList<Employee> employees = new ArrayList<>();

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public void show() {// a.��ʾ����Ա����Ϣ
		for (int i = 0; i < employees.size(); i++) {
			
			System.out.println(employees.get(i));
		}
	}

	public void add(Employee e) {// b.���Ա��
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

	public Employee findByNum(String num) {// d.����Ų�ѯԱ��������Ϣ
		for (int i = 0; i < employees.size(); i++)
			if (num.equals(employees.get(i).getNum())) {
				return employees.get(i);
			}
		return null;
	}

	public void modifyProfessionaltitleBynum(String num) {// e.������޸�ְ��
		System.out.println("������Ҫ�޸ĵ�ְ�ƣ�");
		
		Scanner scanner = new Scanner(System.in);
		String professionaltitle = scanner.next();
		findByNum(num).setProfessionaltitle(professionaltitle);
		System.out.println(employees);
	}

	public void modifyjobBynum(String num) {// f.������޸ĸ�λ
		Scanner sca = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵĸ�λ��");
		int job = sca.nextInt();
		findByNum(num).setJob(job);
		System.out.println(" " + employees);
	}

	public void modifypersonsaleAmountBynum(String num) {// g.������޸����۶�
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ����۶");
		double personsaleamount = sc.nextDouble();
		findByNum(num).setPersonsaleamount(personsaleamount);
		System.out.println(employees);
	}

	public void showSalaryBynum(String num) {// �������ʾԱ��������Ϣ
		System.out.println("���" + num);
		System.out.println("����:" + findByNum(num).getName());
		System.out.println("ʵ������:" + findByNum(num).netSalary());
	}

	public void showSalaryInfo() {// ��ʾ����Ա��������Ϣ
		for (int i = 0; i < employees.size(); i++) {
			System.out.println("--------------------");
			System.out.println("��ţ�" + employees.get(i).getNum());
			System.out.println("����:" + employees.get(i).getName());
			System.out.println("ʵ������:" + employees.get(i).netSalary());
		}
	}
}
