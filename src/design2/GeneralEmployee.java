package design2;

import design2.Employee;

public class GeneralEmployee extends Employee {
	int job=5;
	double jobWage;

	public GeneralEmployee(String num, String name, String sex, int age, String professionaltitle,
			String educationbackground, String department, boolean ispartymember,int job) {
		super(num, name, sex, age, professionaltitle, educationbackground, department, ispartymember);
		this.job=job;
		setJobWage();
		// TODO Auto-generated constructor stub
	}
	
	public int getJob() {
		return job;
	}

	public int setJob(int job) {
		this.job = job;
		setJobWage();
		return job;
	}

	public double getJobWage() {
		return jobWage;
	}

	public void setJobWage() {
		if(job==1) jobWage=2000;
		if(job==2) jobWage=1800;
		if(job==3) jobWage=1600;
		if(job==4) jobWage=1400;
		if(job==5) jobWage=1200;		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("工资："+job);
		System.out.println("岗位工资："+jobWage);
	}

	@Override
	public double netSalary() {
		// TODO Auto-generated method stub
		return getBasicSalary()+getJobWage();
	}

	
}
