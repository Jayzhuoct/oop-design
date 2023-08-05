package design1;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings("all")
public class StudentsAdmin {
	private ArrayList<Student> students;

	public StudentsAdmin() {
	    students = new ArrayList<Student>();
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void init(){		
		File file = new File("D:\\JAVA\\oopcoursedisign9\\src\\design1\\studentsdata.txt");     
			try {
				Scanner sc = new Scanner(file);
				for(int i=0;i<5;i++) {				
				String no = sc.next();
				String name = sc.next();
				int oopscore = sc.nextInt();
				int osscore = sc.nextInt();
				int datastucturescore = sc.nextInt();
				getStudents().add(new Student(no, name, oopscore, osscore,datastucturescore));
				
			}	
				sc.close();				
				}
			catch (FileNotFoundException e) {			
				System.out.println(e.getMessage());
			}
		}
	public void display() {
		for (Student s : students) {
			System.out.println(s.getInfo());
		}
		
	}

	public void add(Student s) {
		this.students.add(s);
	}

	public void remove(String no) {
		for (int index = 0; index < students.size(); index++) {
			if (students.get(index).getNo() == no) {
				students.remove(index);
			}			
		}
		System.out.println("----------------------------已删除" + no + "号学生信息");	
	}

	public double max(int cno) {//cno的取值：1:oopscore  2：osscore   3：datastructurescore
		double max = 0;
		if (cno == 1) {
			for (Student s : students) {
				if (s.getOopscore() > max) {
					max = s.getOopscore();
				}
			}
		} else if (cno == 2) {
			for (Student s : students) {
				if (s.getOsscore() > max) {
					max = s.getOsscore();
				}
			}
		} else if(cno == 3){
			for (Student s : students) {
				if (s.getDatastucturescore()> max) {
					max = s.getDatastucturescore();
				}
			}
		}

		return max;
	}

	public double min(int cno) {
		double min = 100;
		if (cno == 1) {
			for (Student s : students) {
				if (s.getOopscore() < min) {
					min = s.getOopscore();
				}
			}
		} else if (cno == 2) {
			for (Student s : students) {
				if (s.getOsscore() < min) {
					min = s.getOsscore();
				}
			}
		} else {
			for (Student s : students) {
				if (s.getDatastucturescore() < min) {
					min = s.getDatastucturescore();
				}
			}
		}

		return min;
	}

	public int countzhang(String name) {
		int count = 0;
		for (Student s : students) {
			if (s.getName().contains(name) == true) {
				count++;
			}
		}
		return count;
	}
}