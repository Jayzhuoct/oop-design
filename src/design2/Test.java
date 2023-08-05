package design2;

import java.util.Scanner;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		DepartmentManagement DM = new DepartmentManagement();
		EmployeesManagement EM = new EmployeesManagement();// ����������Ӫ�������ڲ������۲����з����Ȳ��š�

		Department e1 = new Department("1", "������",
				new GeneralEmployee("01", "����", "��", 26, "����", "����", "������", false, 5));
		Department e2 = new Department("2", "��Ӫ��",
				new GeneralEmployee("02", "����", "��", 26, "����", "����", "��Ӫ��", false, 5));
		Department e3 = new Department("3", "���ڲ�",
				new GeneralEmployee("03", "����", "��", 26, "����", "����", "���ڲ�", false, 5));
		Department e4 = new Department("4", "���۲�",
				new SaleEmployee("04", "����", "��", 26, "����", "����", "���۲�", false, 50000));
		Department e5 = new Department("5", "�з���",
				new GeneralEmployee("05", "���", "��", 26, "����", "����", "�з���", false, 5));
		
		EM.add(new GeneralEmployee("01", "����", "��", 26, "����", "����", "������", false, 5));
		EM.add(new GeneralEmployee("02", "����", "��", 26, "����", "����", "��Ӫ��", false, 5));
		EM.add(new GeneralEmployee("03", "����", "��", 26, "����", "����", "���ڲ�", false, 5));
		EM.add(new GeneralEmployee("04", "����", "��", 26, "����", "����", "���۲�", false, 50000));
		EM.add(new GeneralEmployee("05", "���", "��", 26, "����", "����", "�з���", false, 5));
		
		DM.add(e1);
		DM.add(e2);
		DM.add(e3);
		DM.add(e4);
		DM.add(e5);

		
		//���һЩԱ��(������
		EM.add(new GeneralEmployee("06", "���", "��", 26, "����", "����", "�з���", false, 5));
		DM.addGeneralEmployeebloolean("06", "���", "��", 26, "����", "����", "�з���", false, 5);
		
		
		EM.add(new GeneralEmployee("07", "СK", "Ů", 26, "����", "����", "���ڲ�", false, 1));
		DM.addGeneralEmployeebloolean("07", "СK", "Ů", 26, "����", "����", "���ڲ�", false, 1);

		EM.add(new SaleEmployee("08", "����", "��", 26, "����", "����", "���۲�", false, 50000));
		DM.addSaleEmployeeboolean("08", "����", "��", 26, "����", "����", "���۲�", false, (double) 50000);

		
		
		Scanner sc = new Scanner(System.in);
		String func;
		boolean ismain = true;
		boolean issub1 = true;
		boolean issub2 = true;

		while (ismain) {
			showMainMenu();
			func = sc.next();
			switch (func) {
			case "a":
				issub1 = true;
				while (issub1) {

					showSubMenu1();
					func = sc.next();
					switch (func) {
					case "a":// ��ʾ����Ա����Ϣ
						EM.show();
						break;
					case "b":// ���Ա��
						issub2 = true;
						while (issub2) {
							showSubMenu4();
							func = sc.next();
							switch (func) {
							case "a":
								System.out.println("��������:");
								String num = sc.next();// ���
								if (EM.findByNum(num) != null) {
									System.out.println("����Ѵ���");
									break;
								}
								System.out.println("����������:");
								String name = sc.next();// ����
								System.out.println("�������Ա�:");
								String sex = sc.next();// �Ա�
								System.out.println("����������:");
								int age = sc.nextInt();// ����
								System.out.println("������ְ��:");
								String professionaltitle = sc.next();// ְ��
								System.out.println("������ѧ��:");
								String educationbackground = sc.next();// ѧ��
								System.out.println("���������ڲ���:");
								String department = sc.next();// ���ڲ���
								System.out.println("�������Ƿ�Ϊ��Ա:");
								boolean ispartymember = sc.next() != null;// �Ƿ�Ϊ��Ա
								System.out.println("�������۶�Ϊ:");
								double personsaleamount = sc.nextDouble();


								if (DM.addSaleEmployeeboolean(num, name, sex, age, professionaltitle,
										educationbackground, department, ispartymember, personsaleamount) == true) {

									EM.add(new SaleEmployee(num, name, sex, age, // ��ӽ�Ա������ϵͳ
											professionaltitle, educationbackground, department, ispartymember,
											personsaleamount));
									System.out.println("���벿�ųɹ�");
									break;
								}
								System.out.println("�޴˲��ţ�");

								
								break;
							case "b":
								System.out.println("��������:");
								String num1 = sc.next();// ���
								if (EM.findByNum(num1) != null) {
									System.out.println("����Ѵ���");
									break;
								}
								System.out.println("����������:");
								String name1 = sc.next();// ����
								System.out.println("�������Ա�:");
								String sex1 = sc.next();// �Ա�
								System.out.println("����������:");
								int age1 = sc.nextInt();// ����
								System.out.println("������ְ��:");
								String professionaltitle1 = sc.next();// ְ��
								System.out.println("������ѧ��:");
								String educationbackground1 = sc.next();// ѧ��
								System.out.println("���������ڲ���:");
								String department1 = sc.next();// ���ڲ���
								System.out.println("�������Ƿ�Ϊ��Ա:");
								boolean ispartymember1 = sc.next() != null;// �Ƿ�Ϊ��Ա
								System.out.println("�������λ:");
								int job = sc.nextInt();


								if (DM.addGeneralEmployeebloolean(num1, name1, sex1, age1, professionaltitle1,
										educationbackground1, department1, ispartymember1, job) == true) {

									EM.add(new GeneralEmployee(num1, name1, sex1, age1, professionaltitle1,
											educationbackground1, department1, ispartymember1, job));
									System.out.println("���벿�ųɹ�");
									break;
								}
								System.out.println("�޴˲��ţ�");
								break;
							case "c":
								issub2 = false;
								break;
							default:
								break;

							}

						}
						break;
					case "c":// ɾ��Ա��
						System.out.println("������Ҫɾ����Ա���ı�ţ�");
						func = sc.next();

						if (EM.delete(func)) {
							System.out.println("ɾ���ɹ�");break;
						}
						System.out.println("���޴���");

						break;
					case "d":// ����Ų�ѯԱ��������Ϣ
						System.out.println("������Ҫ��ѯԱ���ı�ţ�");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("���޴��ˣ���");
							break;
						}
						System.out.println(EM.findByNum(func));
						break;
					case "e":// ������޸�ְ��
						System.out.println("������Ҫ�޸�ְ�Ƶ�Ա���ı�ţ�");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("���޴��ˣ���");
							break;
						}
						EM.modifyProfessionaltitleBynum(func);
						break;
					case "f":// ������޸ĸ�λ
						System.out.println("������Ҫ�޸ĸ�λ��Ա���ı�ţ�");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("���޴��ˣ���");
							break;
						}						
						System.out.println("�޸ĳɹ���");
						break;
					case "g":// ������޸����۶�
						System.out.println("������Ҫ�޸����۶��Ա���ı�ţ�");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("���޴��ˣ���");
							break;
						}
						System.out.println("�޸ĳɹ���");
						break;
					case "h":
						issub1 = false;
						break;
					}

				}
				break;
			case "b":
				issub1 = true;
				while (issub1) {
					showSubMenu2();
					func = sc.next();
					switch (func) {
					case "a":// ��Ӳ���
						issub2 = true;
						while (issub2) {
							showSubMenu5();
							func = sc.next();
							switch (func) {
							case "a":
								System.out.println("�����벿�����ƣ�");
								String dname = sc.next();
								System.out.println("�����벿�ű�ţ�");
								String dno = sc.next();
								System.out.println("�����벿�ž�����Ϣ");
								System.out.println("��������:");
								String num1 = sc.next();// ���
								if (EM.findByNum(num1) != null) {
									System.out.println("����Ѵ���");
									break;
								}
								System.out.println("����������:");
								String name1 = sc.next();// ����
								System.out.println("�������Ա�:");
								String sex1 = sc.next();// �Ա�
								System.out.println("����������:");
								int age1 = sc.nextInt();// ����
								System.out.println("������ְ��:");
								String professionaltitle1 = sc.next();// ְ��
								System.out.println("������ѧ��:");
								String educationbackground1 = sc.next();// ѧ��
								System.out.println("���������ڲ���:");
								String department1 = sc.next();// ���ڲ���

								System.out.println("�������Ƿ�Ϊ��Ա:");
								boolean ispartymember1 = sc.next() != null;// �Ƿ�Ϊ��Ա
								System.out.println("�������λ:");
								int job = sc.nextInt();
								DM.add(new Department(dno, dname, new GeneralEmployee(num1, name1, sex1, age1,
										professionaltitle1, educationbackground1, department1, ispartymember1, job)));
								System.out.println("��Ӳ��ųɹ���");
								break;

							case "b":
								System.out.println("�����벿�����ƣ�");
								String dname1 = sc.next();
								System.out.println("�����벿�ű�ţ�");
								String dno1 = sc.next();
								System.out.println("��������:");
								String num = sc.next();// ���
								if (EM.findByNum(num) != null) {
									System.out.println("����Ѵ���");
									break;
								}
								System.out.println("����������:");
								String name = sc.next();// ����
								System.out.println("�������Ա�:");
								String sex = sc.next();// �Ա�
								System.out.println("����������:");
								int age = sc.nextInt();// ����
								System.out.println("������ְ��:");
								String professionaltitle = sc.next();// ְ��
								System.out.println("������ѧ��:");
								String educationbackground = sc.next();// ѧ��
								System.out.println("���������ڲ���:");
								String department = sc.next();// ���ڲ���
								System.out.println("�������Ƿ�Ϊ��Ա:");
								boolean ispartymember = sc.next() != null;// �Ƿ�Ϊ��Ա
								System.out.println("�������۶�Ϊ��:");
								double personsaleamount = sc.nextDouble();
								DM.add(new Department(dno1, dname1,
										new SaleEmployee(num, name, sex, age, professionaltitle, educationbackground,
												department, ispartymember, personsaleamount)));
								System.out.println("��Ӳ��ųɹ���");
								break;
							case "c":
								issub2 = false;
								break;
							}
						}
						break;
					case "b":// ɾ������
						System.out.println("������Ҫɾ���Ĳ��ŵı�ţ�");
						func = sc.next();
						if (DM.delete(func)) {
							System.out.println("ɾ���ɹ���");break;
						}
						System.out.println("���Ų����ڣ�");
						break;
					case "c":// �����ű�Ų�ѯ����
						System.out.println("���������ѯ���ŵı�ţ�");
						func = sc.next();
						DM.findDepartmentByDno(func);						
						break;
					case "d":// �����ű����ʾԱ����Ϣ
						System.out.println("�����벿�ű�ţ�");
						func = sc.next();
						DM.showEmployeeByDno(func);
						break;
					case "e":// ��ʾ������Ϣ
						DM.showDepartments();
						break;
					case "f":
						issub1 = false;
						break;

					}
				}
				break;
			case "c":
				issub1 = true;
				while (issub1) {
					showSubMenu3();
					func = sc.next();
					switch (func) {
					case "a":// �������ʾԱ��������Ϣ
						System.out.println("��������Ҫ��ѯԱ���ı��:");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("���޴��ˣ�");
							break;
						}
						EM.showSalaryBynum(func);
						break;
					case "b":// ��ʾ����Ա��������Ϣ
						EM.showSalaryInfo();
						break;
					case "c":
						issub1 = false;
						break;

					}
				}
				break;
			case "d":// �˳�
				ismain = false;
				break;

			}
		}

	}

	public static void showMainMenu() {
		System.out.println("*******************************");
		System.out.println("aԱ����Ϣ����");
		System.out.println("b������Ϣ����");
		System.out.println("c������Ϣ����");
		System.out.println("d�˳�");
		System.out.println("�����빦�ܱ�ţ�");
		System.out.println("*******************************");
	}

	public static void showSubMenu1() {
		System.out.println("*******************************");
		System.out.println("a��ʾ����Ա����Ϣ");
		System.out.println("b���Ա��");
		System.out.println("cɾ��Ա��");
		System.out.println("d����Ų�ѯԱ��������Ϣ");
		System.out.println("e������޸�ְ��");
		System.out.println("f������޸ĸ�λ");
		System.out.println("g������޸����۶�");
		System.out.println("h�������˵�");
		System.out.println("�����빦�ܱ�ţ�");
		System.out.println("*******************************");
	}

	public static void showSubMenu2() {
		System.out.println("*******************************");
		System.out.println("a��Ӳ���");
		System.out.println("bɾ������");
		System.out.println("c�����ű�Ų�ѯ����");
		System.out.println("d�����ű����ʾԱ����Ϣ");
		System.out.println("e��ʾ������Ϣ");
		System.out.println("f�������˵�");
		System.out.println("�����빦�ܱ�ţ�");
		System.out.println("*******************************");
	}

	public static void showSubMenu3() {
		System.out.println("*******************************");
		System.out.println("a�������ʾԱ��������Ϣ");
		System.out.println("b��ʾ����Ա��������Ϣ");
		System.out.println("c�������˵�");
		System.out.println("�����빦�ܱ�ţ�");
		System.out.println("*******************************");

	}

	public static void showSubMenu4() {
		System.out.println("*******************************");
		System.out.println("a�������Ա��");
		System.out.println("b�����ͨ��Ա��");
		System.out.println("c������һ���˵�");
		System.out.println("�����빦�ܱ�ţ�");
		System.out.println("*******************************");

	}

	public static void showSubMenu5() {
		System.out.println("*******************************");
		System.out.println("a���ž�������ͨԱ��");
		System.out.println("b���ž���������Ա��");
		System.out.println("c������һ���˵�");
		System.out.println("�����빦�ܱ�ţ�");
		System.out.println("*******************************");

	}

}
