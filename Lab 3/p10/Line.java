package p10;

public class Line {
	private Point startPoint;
	private Point endPoint;
	
	
	public Line() {
		this.startPoint= new Point();
		this.endPoint= new Point();
	}


	public Line(String point1,String point2 ) {
		
		this.startPoint = new Point(point1);
		this.endPoint = new Point(point2);
	}
	public void display()
	{
		System.out.print("Start point =  ");
		startPoint.displayPoint();
		System.out.print("End point =  ");
		endPoint.displayPoint();
		
	}
	
}
