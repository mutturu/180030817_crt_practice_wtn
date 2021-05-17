package inheitance2practice;

public class Person {
	int pid;
	String pname,pgender;
	public Person(int pid,String pname,String pgender)
	{
		this.pid=pid;
		this.pname=pname;
		this.pgender=pgender;
	}
	void setPid(int pid)
	{
		this.pid=pid;
	}
	int getPid()
	{
		return pid;
	}
	void setPname(String pname)
	{
		this.pname=pname;
	}
	String getPname()
	{
		return pname;
	}
	void setPgender(String pgender)
	{
		this.pgender=pgender;
	}
	String getPgender()
	{
		return pgender;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pgender=" + pgender + "]";
	}
	
	
}
