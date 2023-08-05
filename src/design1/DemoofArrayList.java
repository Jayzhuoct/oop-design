package design1;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings("unused")
public class DemoofArrayList {

	public static  void main(String[] args) {
//		// TODO Auto-generated method stub	
		StudentsAdmin sa = new StudentsAdmin();		
		sa.init();			
		sa.add(new Student("6", "王一", 90, 95, 89));
		sa.add(new Student("7", "李二", 92, 96, 79));
		sa.add(new Student("8", "李三", 93, 97, 99));
		sa.display();
		System.out.println();
	    sa.remove("8");	    
	    sa.display();
	    System.out.println("oopscore最高成绩：" + sa.max(1));//1:oopscore  
		System.out.println("datastuctures最低成绩：" + sa.min(3));//3：datastructurescore
		System.out.println("学生中姓李的人数是：" + sa.countzhang("李"));
				
	}
}

