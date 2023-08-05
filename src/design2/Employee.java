package design2;

public abstract class Employee implements Ibank{
	@Override
	public void payWages(String cardno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("����Ϊ"+cardno+"�����п����˽��Ϊ"+amount);
		
	}
	
	private String num;//���
	private String name;//����
	private String sex;//�Ա�
	private int age;//����
	private String professionaltitle="����";//ְ��
	private String educationbackground;//ѧ��
	private String department;//���ڲ���
	private boolean ispartymember;//�Ƿ�Ϊ��Ա
	private int basicSalary;//��������
	
	public abstract double netSalary();//����ʵ������
	
	public void show() {
		System.out.println("��ţ�"+num);
		System.out.println("������"+name);
		System.out.println("�Ա�"+sex);
		System.out.println("���䣺"+age);
		System.out.println("ְ�ƣ�"+professionaltitle);
		System.out.println("ѧ����"+educationbackground);
		System.out.println("���ڲ��ţ�"+department);
		System.out.println("�Ƿ�Ϊ��Ա��"+ispartymember);
		System.out.println("ʵ�����ʣ�"+netSalary());
		System.out.println("�������ʣ�"+basicSalary);
		
		
	}
	
	
	public String toString() {
		
		return "��ţ�"+num+"\n������"+name+"\n�Ա�"+sex+"\n���䣺"+age+"\nְ�ƣ�"+professionaltitle+
		"\nѧ����"+educationbackground+"\n���ڲ��ţ�"+department+
"\n�Ƿ�Ϊ��Ա��"+ispartymember+"\nʵ�����ʣ�"+netSalary()+"\n�������ʣ�"+basicSalary+"\n--------------------";
		
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
		if(professionaltitle.equals("����")) basicSalary=3000;
		if(professionaltitle.equals("�м�")) basicSalary=4000;
		if(professionaltitle.equals("�߼�")) basicSalary=5000;
	}
	public int setJob(int job) {
		return job;
	}
	public double setPersonsaleamount(double personsaleamount) {
		return  personsaleamount;
	}

}
