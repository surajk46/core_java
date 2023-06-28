class Book
{	
// DATA MEMBERS
	private int bookId;
	private float price;

	//static data member
	private static int c;
	static
	{
		c=0;
	}
	
	public Book()
	{	
		this.bookId=1+c;
		c=c+1;
		price=100.00f;
	}
	public Book(float price)
	{	
		bookId=1+c;
		c=c+1;
		this.price=price;
	}
	
	//function
	public void display()
	{
		System.out.println("Book id ="+bookId);
		System.out.println("Price ="+price);
	}


	
}