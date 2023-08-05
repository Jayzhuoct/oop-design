package design1;

public class Student {
	private String no;
	private String name;
	private int oopscore;
	private int osscore;
	private int datastucturescore;
	
	
	public Student() {
		super();
	}
	public Student(String no, String name, int oopscore, int osscore, int datastucturescore) {
		super();
		this.no = no;
		this.name = name;
		this.oopscore = oopscore;
		this.osscore = osscore;
		this.datastucturescore = datastucturescore;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOopscore() {
		return oopscore;
	}
	public void setOopscore(int oopscore) {
		if (oopscore<0) {
			this.oopscore=-oopscore;
		}else if (oopscore>0) {
			this.oopscore = oopscore;
		}
	}
	public int getOsscore() {
		
		return osscore;
	}
	public void setOsscore(int osscore) {
		if (osscore<0) {
			this.osscore=-osscore;
		}else if (osscore>0) {
			this.osscore = osscore;
		}
	}
	public int getDatastucturescore() {
		return datastucturescore;
	}
	public void setDatastucturescore(int datastucturescore) {
		if (datastucturescore<0) {
			this.datastucturescore=-datastucturescore;
		}else if (datastucturescore>0) {
			this.datastucturescore = datastucturescore;
		}
	}
	public String getInfo() {
		return "Student [no=" + no + ", name=" + name + ", oopscore=" + oopscore + ",osscore="+osscore+",detastucturescore="+datastucturescore+"]";
	}

 
}




