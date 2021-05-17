package inheitance2practice;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(0, null, null);
		p.setPid(10);
		p.setPname("Bhargava reddy");
		p.setPgender("Male");
		Employee em=new Employee(0, null, null, 0, null, null);
		em.setPerson(p);
		em.setAnsal(15894.5);
		em.setDoj("16-06-2018");
		em.setNain("589456");
		System.out.println(em);

	}

}
