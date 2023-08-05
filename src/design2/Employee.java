package design2;

public abstract class Employee implements Ibank{
	@Override
	public void payWages(String cardno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("卡号为"+cardno+"的银行卡入账金额为"+amount);
		
	}
	
	private String num;//编号
	private String name;//姓名
	private String sex;//性别
	private int age;//年龄
	private String professionaltitle="初级";//职称
	private String educationbackground;//学历
	private String department;//所在部门
	private boolean ispartymember;//是否为党员
	private int basicSalary;//基本工资
	
	public abstract double netSalary();//计算实发工资
	
	public void show() {
		System.out.println("编号："+num);
		System.out.println("姓名："+name);
		System.out.println("性别："+sex);
		System.out.println("年龄："+age);
		System.out.println("职称："+professionaltitle);
		System.out.println("学历："+educationbackground);
		System.out.println("所在部门："+department);
		System.out.println("是否为党员："+ispartymember);
		System.out.println("实发工资："+netSalary());
		System.out.println("基本工资："+basicSalary);
		
		
	}
	
	
	public String toString() {
		
		return "编号："+num+"\n姓名："+name+"\n性别："+sex+"\n年龄："+age+"\n职称："+professionaltitle+
		"\n学历："+educationbackground+"\n所在部门："+department+
"\n是否为党员："+ispartymember+"\n实发工资："+netSalary()+"\n基本工资："+basicSalary+"\n--------------------";
		
	}
	
	public Employee(String num, String name, String sex, int age, String professionaltitle, String educationbackground,
			String department, boolean ispartymember) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.professionaltitle = professionaltitle;
		this.educationbackground = educationbackground;
		this.department = department;
		this.ispartymember = ispartymember;
		setBasicSalary();
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfessionaltitle() {
		return professionaltitle;
	}

	public void setProfessionaltitle(String professionaltitle) {
		this.professionaltitle = professionaltitle;
		setBasicSalary();
	}

	public String getEducationbackground() {
		return educationbackground;
	}

	public void setEducationbackground(String educationbackground) {
		this.educationbackground = educationbackground;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isIspartymember() {
		return ispartymember;
	}

	public void setIspartymember(boolean ispartymember) {
		this.ispartymember = ispartymember;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	private void setBasicSalary() {
		if(professionaltitle.equals("初级")) basicSalary=3000;
		if(professionaltitle.equals("中级")) basicSalary=4000;
		if(professionaltitle.equals("高级")) basicSalary=5000;
	}
	public int setJob(int job) {
		return job;
	}
	public double setPersonsaleamount(double personsaleamount) {
		return  personsaleamount;
	}

}
