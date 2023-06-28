package threaddemos;

public class CountDownJobDemo {

	public static void main(String[] args) {
		//newly created
		CountDownJob j1 = new CountDownJob("first",400);
		CountDownJob j2 = new CountDownJob("second",750);
		CountDownJob j3 = new CountDownJob("third",900);
		
		System.out.println("Couting down begins.....");
		//ready to run
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		//Thread.sleep();   //time is not known
		System.out.println("j1 alive : "+j1.getT().isAlive());
		System.out.println("j2 alive : "+j2.getT().isAlive());
		System.out.println("j3 alive : "+j3.getT().isAlive());
		try
		{
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("j1 alive : "+j1.getT().isAlive());
		System.out.println("j2 alive : "+j2.getT().isAlive());
		System.out.println("j3 alive : "+j3.getT().isAlive());
		
		System.out.println("Couting down ends.....");

	}

}
