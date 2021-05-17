package inheitance2practice;
public class Employee extends Person{
	public Employee(int pid, String pname, String pgender,double ansal,String doj,String nain) {
		super(pid, pname, pgender);
		// TODO Auto-generated constructor stub
		this.ansal=ansal;
		this.doj=doj;
		this.nain=nain;
		
	}
	double ansal;
	String doj,nain;
	Person person;
	void setAnsal(double ansal)
	{
		this.ansal=ansal;
	}
	double getAnsal()
	{
		return ansal;
	}
	void setDoj(String doj)
	{
		this.doj=doj;
	}
	String getDoj()
	{
		return doj;
	}
	void setNain(String nain)
	{
		this.nain=nain;
	}
	String getNain()
	{
		return nain;
	}
	void setPerson(Person person)
	{
		this.person=person;
	}
	Person getPerson()
	{
		return person;
	}
	@Override
	public String toString() {
		return "Employee [ansal=" + ansal + ", doj=" + doj + ", nain=" + nain + ", person=" + person + "]";
	}
	

}
