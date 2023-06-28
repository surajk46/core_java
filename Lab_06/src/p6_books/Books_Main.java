package p6_books;
abstract class Book
{
	private int bookId;
	private String title;
	private double price;
	public Book() {
		super();
	}
	public Book(int bookId, String title, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	
	
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "\nBook bookId = " + bookId + "\ntitle = " + title + "\nPrice = "+price;
	}
	public abstract double calculateCost();
	
	
}

class Ebook extends Book
{
	private double price=super.getPrice();
	public Ebook()
	{
		super();
	}
	public Ebook(int bookId, String title, double price)
	{
		super(bookId,title,price);
	}
	@Override
	public double calculateCost() {
		if(price<=500)
			price=(price*98)/100;
		else if(price>500 && price<=1000)
			price=(price*95)/100;
		else if(price >1000 && price>=5000)
			price=(price*93)/100;
		return price;
	}
	@Override
	public String toString() 
	{
		return super.toString()+"\nFinal Price with disount = "+ calculateCost();
	}
	
	
}

class PaperBook extends Book
{
	private double price=super.getPrice();
	public PaperBook()
	{
		super();
	}
	public PaperBook(int bookId, String title, double price)
	{
		super(bookId,title,price);
	}
	@Override
	public double calculateCost() {
		if(price<=500)
			price=(price*107)/100;
		else if(price>500 && price<=1000)
			price=(price*105)/100;
		else if(price >1000 && price>=5000)
			price=(price*102)/100;
		return price;
	}
	@Override
	public String toString() {
		return super.toString()+"\nFinal Price with delivery Charges = "+ calculateCost();
	}
	
}

public class Books_Main {

	public static void main(String[] args) {
		Book []b= {(new Ebook(101,"Physics",400)),(new Ebook(102,"maths",450))
				  ,(new PaperBook(103,"Chemistry",650)),(new PaperBook(104,"Marathi",250))
				  ,(new PaperBook(105,"Geography",350))};

		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			
		}
	}

}
