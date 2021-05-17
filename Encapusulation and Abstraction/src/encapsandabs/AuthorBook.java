package encapsandabs;
class Author
{
	String name,email,gender;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	String getEmail()
	{
		return email;
	}
	void setGender(String gender)
	{
		this.gender=gender;
	}
	String getGender(String gender)
	{
		return gender;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
}
class Book
{
	String name;
	Author author;
	double price;
	int qty;
	void setName(String name)
	{
		this.name=name;
	}
	void setAuthor(Author author)
	{
		this.author=author;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void setQty(int qty)
	{
		this.qty=qty;
	}
	String getName()
	{
		return name;
	}
	Author getAuthor()
	{
		return author;
	}
	double getPrice()
	{
		return price;
	}
	int getQty()
	{
		return qty;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}
	
}

public class AuthorBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author();
		a.setName("M V Bargava");
		a.setEmail("veerabhargavreddy641@gmail.com");
		a.setGender("Male");
		Book b=new Book();
		b.setName("ramayanama");
		b.setAuthor(a);
		b.setPrice(4500);
		b.setQty(52);
		System.out.println("Author and Book details");
		System.out.println(b);
		

	}

}
