package design2;

public class SaleEmployee extends Employee {
	double personsaleamount;//个人销售额
	static double deductrate = 20;//提成比例%
	
	public SaleEmployee(String num, String name, String sex, int age, String professionaltitle,
			String educationbackground, String department, boolean ispartymember,double personsaleamount) {
		super(num, name, sex, age, professionaltitle, educationbackground, department, ispartymember);
		this.personsaleamount = personsaleamount;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double netSalary() {
		// TODO Auto-generated method stub
		return getBasicSalary()+getPersonsaleamount()*deductrate/100;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("个人销售额:"+personsaleamount);
	}
	
	public double getPersonsaleamount() {
		return personsaleamount;
	}
	public double setPersonsaleamount(double personsaleamount) {
		return personsaleamount;
	}
	
}
