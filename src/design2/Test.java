package design2;

import java.util.Scanner;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		DepartmentManagement DM = new DepartmentManagement();
		EmployeesManagement EM = new EmployeesManagement();// 行政部、运营部、后勤部、销售部、研发部等部门。

		Department e1 = new Department("1", "行政部",
				new GeneralEmployee("01", "张三", "男", 26, "初级", "本科", "行政部", false, 5));
		Department e2 = new Department("2", "运营部",
				new GeneralEmployee("02", "李四", "男", 26, "初级", "本科", "运营部", false, 5));
		Department e3 = new Department("3", "后勤部",
				new GeneralEmployee("03", "王二", "男", 26, "初级", "本科", "后勤部", false, 5));
		Department e4 = new Department("4", "销售部",
				new SaleEmployee("04", "赵五", "男", 26, "初级", "本科", "销售部", false, 50000));
		Department e5 = new Department("5", "研发部",
				new GeneralEmployee("05", "朱八", "男", 26, "初级", "本科", "研发部", false, 5));
		
		EM.add(new GeneralEmployee("01", "张三", "男", 26, "初级", "本科", "行政部", false, 5));
		EM.add(new GeneralEmployee("02", "李四", "男", 26, "初级", "本科", "运营部", false, 5));
		EM.add(new GeneralEmployee("03", "王二", "男", 26, "初级", "本科", "后勤部", false, 5));
		EM.add(new GeneralEmployee("04", "赵五", "男", 26, "初级", "本科", "销售部", false, 50000));
		EM.add(new GeneralEmployee("05", "朱八", "男", 26, "初级", "本科", "研发部", false, 5));
		
		DM.add(e1);
		DM.add(e2);
		DM.add(e3);
		DM.add(e4);
		DM.add(e5);

		
		//添加一些员工(测试用
		EM.add(new GeneralEmployee("06", "麻匪", "男", 26, "初级", "本科", "研发部", false, 5));
		DM.addGeneralEmployeebloolean("06", "麻匪", "男", 26, "初级", "本科", "研发部", false, 5);
		
		
		EM.add(new GeneralEmployee("07", "小K", "女", 26, "初级", "本科", "后勤部", false, 1));
		DM.addGeneralEmployeebloolean("07", "小K", "女", 26, "初级", "本科", "后勤部", false, 1);

		EM.add(new SaleEmployee("08", "菠萝", "男", 26, "初级", "本科", "销售部", false, 50000));
		DM.addSaleEmployeeboolean("08", "菠萝", "男", 26, "初级", "本科", "销售部", false, (double) 50000);

		
		
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
					case "a":// 显示所有员工信息
						EM.show();
						break;
					case "b":// 添加员工
						issub2 = true;
						while (issub2) {
							showSubMenu4();
							func = sc.next();
							switch (func) {
							case "a":
								System.out.println("请输入编号:");
								String num = sc.next();// 编号
								if (EM.findByNum(num) != null) {
									System.out.println("编号已存在");
									break;
								}
								System.out.println("请输入姓名:");
								String name = sc.next();// 姓名
								System.out.println("请输入性别:");
								String sex = sc.next();// 性别
								System.out.println("请输入年龄:");
								int age = sc.nextInt();// 年龄
								System.out.println("请输入职称:");
								String professionaltitle = sc.next();// 职称
								System.out.println("请输入学历:");
								String educationbackground = sc.next();// 学历
								System.out.println("请输入所在部门:");
								String department = sc.next();// 所在部门
								System.out.println("请输入是否为党员:");
								boolean ispartymember = sc.next() != null;// 是否为党员
								System.out.println("个人销售额为:");
								double personsaleamount = sc.nextDouble();


								if (DM.addSaleEmployeeboolean(num, name, sex, age, professionaltitle,
										educationbackground, department, ispartymember, personsaleamount) == true) {

									EM.add(new SaleEmployee(num, name, sex, age, // 添加进员工管理系统
											professionaltitle, educationbackground, department, ispartymember,
											personsaleamount));
									System.out.println("加入部门成功");
									break;
								}
								System.out.println("无此部门！");

								
								break;
							case "b":
								System.out.println("请输入编号:");
								String num1 = sc.next();// 编号
								if (EM.findByNum(num1) != null) {
									System.out.println("编号已存在");
									break;
								}
								System.out.println("请输入姓名:");
								String name1 = sc.next();// 姓名
								System.out.println("请输入性别:");
								String sex1 = sc.next();// 性别
								System.out.println("请输入年龄:");
								int age1 = sc.nextInt();// 年龄
								System.out.println("请输入职称:");
								String professionaltitle1 = sc.next();// 职称
								System.out.println("请输入学历:");
								String educationbackground1 = sc.next();// 学历
								System.out.println("请输入所在部门:");
								String department1 = sc.next();// 所在部门
								System.out.println("请输入是否为党员:");
								boolean ispartymember1 = sc.next() != null;// 是否为党员
								System.out.println("请输入岗位:");
								int job = sc.nextInt();


								if (DM.addGeneralEmployeebloolean(num1, name1, sex1, age1, professionaltitle1,
										educationbackground1, department1, ispartymember1, job) == true) {

									EM.add(new GeneralEmployee(num1, name1, sex1, age1, professionaltitle1,
											educationbackground1, department1, ispartymember1, job));
									System.out.println("加入部门成功");
									break;
								}
								System.out.println("无此部门！");
								break;
							case "c":
								issub2 = false;
								break;
							default:
								break;

							}

						}
						break;
					case "c":// 删除员工
						System.out.println("请输入要删除的员工的编号：");
						func = sc.next();

						if (EM.delete(func)) {
							System.out.println("删除成功");break;
						}
						System.out.println("查无此人");

						break;
					case "d":// 按编号查询员工基本信息
						System.out.println("请输入要查询员工的编号：");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("查无此人！！");
							break;
						}
						System.out.println(EM.findByNum(func));
						break;
					case "e":// 按编号修改职称
						System.out.println("请输入要修改职称的员工的编号：");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("查无此人！！");
							break;
						}
						EM.modifyProfessionaltitleBynum(func);
						break;
					case "f":// 按编号修改岗位
						System.out.println("请输入要修改岗位的员工的编号：");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("查无此人！！");
							break;
						}						
						System.out.println("修改成功！");
						break;
					case "g":// 按编号修改销售额
						System.out.println("请输入要修改销售额的员工的编号：");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("查无此人！！");
							break;
						}
						System.out.println("修改成功！");
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
					case "a":// 添加部门
						issub2 = true;
						while (issub2) {
							showSubMenu5();
							func = sc.next();
							switch (func) {
							case "a":
								System.out.println("请输入部门名称：");
								String dname = sc.next();
								System.out.println("请输入部门编号：");
								String dno = sc.next();
								System.out.println("请输入部门经理信息");
								System.out.println("请输入编号:");
								String num1 = sc.next();// 编号
								if (EM.findByNum(num1) != null) {
									System.out.println("编号已存在");
									break;
								}
								System.out.println("请输入姓名:");
								String name1 = sc.next();// 姓名
								System.out.println("请输入性别:");
								String sex1 = sc.next();// 性别
								System.out.println("请输入年龄:");
								int age1 = sc.nextInt();// 年龄
								System.out.println("请输入职称:");
								String professionaltitle1 = sc.next();// 职称
								System.out.println("请输入学历:");
								String educationbackground1 = sc.next();// 学历
								System.out.println("请输入所在部门:");
								String department1 = sc.next();// 所在部门

								System.out.println("请输入是否为党员:");
								boolean ispartymember1 = sc.next() != null;// 是否为党员
								System.out.println("请输入岗位:");
								int job = sc.nextInt();
								DM.add(new Department(dno, dname, new GeneralEmployee(num1, name1, sex1, age1,
										professionaltitle1, educationbackground1, department1, ispartymember1, job)));
								System.out.println("添加部门成功！");
								break;

							case "b":
								System.out.println("请输入部门名称：");
								String dname1 = sc.next();
								System.out.println("请输入部门编号：");
								String dno1 = sc.next();
								System.out.println("请输入编号:");
								String num = sc.next();// 编号
								if (EM.findByNum(num) != null) {
									System.out.println("编号已存在");
									break;
								}
								System.out.println("请输入姓名:");
								String name = sc.next();// 姓名
								System.out.println("请输入性别:");
								String sex = sc.next();// 性别
								System.out.println("请输入年龄:");
								int age = sc.nextInt();// 年龄
								System.out.println("请输入职称:");
								String professionaltitle = sc.next();// 职称
								System.out.println("请输入学历:");
								String educationbackground = sc.next();// 学历
								System.out.println("请输入所在部门:");
								String department = sc.next();// 所在部门
								System.out.println("请输入是否为党员:");
								boolean ispartymember = sc.next() != null;// 是否为党员
								System.out.println("个人销售额为：:");
								double personsaleamount = sc.nextDouble();
								DM.add(new Department(dno1, dname1,
										new SaleEmployee(num, name, sex, age, professionaltitle, educationbackground,
												department, ispartymember, personsaleamount)));
								System.out.println("添加部门成功！");
								break;
							case "c":
								issub2 = false;
								break;
							}
						}
						break;
					case "b":// 删除部门
						System.out.println("请输入要删除的部门的编号：");
						func = sc.next();
						if (DM.delete(func)) {
							System.out.println("删除成功！");break;
						}
						System.out.println("部门不存在！");
						break;
					case "c":// 按部门编号查询部门
						System.out.println("请输入需查询部门的编号：");
						func = sc.next();
						DM.findDepartmentByDno(func);						
						break;
					case "d":// 按部门编号显示员工信息
						System.out.println("请输入部门编号：");
						func = sc.next();
						DM.showEmployeeByDno(func);
						break;
					case "e":// 显示部门信息
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
					case "a":// 按编号显示员工工资信息
						System.out.println("请输入需要查询员工的编号:");
						func = sc.next();
						if (EM.findByNum(func) == null) {
							System.out.println("查无此人！");
							break;
						}
						EM.showSalaryBynum(func);
						break;
					case "b":// 显示所有员工工资信息
						EM.showSalaryInfo();
						break;
					case "c":
						issub1 = false;
						break;

					}
				}
				break;
			case "d":// 退出
				ismain = false;
				break;

			}
		}

	}

	public static void showMainMenu() {
		System.out.println("*******************************");
		System.out.println("a员工信息管理");
		System.out.println("b部门信息管理");
		System.out.println("c工资信息管理");
		System.out.println("d退出");
		System.out.println("请输入功能编号：");
		System.out.println("*******************************");
	}

	public static void showSubMenu1() {
		System.out.println("*******************************");
		System.out.println("a显示所有员工信息");
		System.out.println("b添加员工");
		System.out.println("c删除员工");
		System.out.println("d按编号查询员工基本信息");
		System.out.println("e按编号修改职称");
		System.out.println("f按编号修改岗位");
		System.out.println("g按编号修改销售额");
		System.out.println("h返回主菜单");
		System.out.println("请输入功能编号：");
		System.out.println("*******************************");
	}

	public static void showSubMenu2() {
		System.out.println("*******************************");
		System.out.println("a添加部门");
		System.out.println("b删除部门");
		System.out.println("c按部门编号查询部门");
		System.out.println("d按部门编号显示员工信息");
		System.out.println("e显示部门信息");
		System.out.println("f返回主菜单");
		System.out.println("请输入功能编号：");
		System.out.println("*******************************");
	}

	public static void showSubMenu3() {
		System.out.println("*******************************");
		System.out.println("a按编号显示员工工资信息");
		System.out.println("b显示所有员工工资信息");
		System.out.println("c返回主菜单");
		System.out.println("请输入功能编号：");
		System.out.println("*******************************");

	}

	public static void showSubMenu4() {
		System.out.println("*******************************");
		System.out.println("a添加销售员工");
		System.out.println("b添加普通类员工");
		System.out.println("c返回上一级菜单");
		System.out.println("请输入功能编号：");
		System.out.println("*******************************");

	}

	public static void showSubMenu5() {
		System.out.println("*******************************");
		System.out.println("a部门经理是普通员工");
		System.out.println("b部门经理是销售员工");
		System.out.println("c返回上一级菜单");
		System.out.println("请输入功能编号：");
		System.out.println("*******************************");

	}

}
