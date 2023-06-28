package threaddemos;

public class MyJobDemo {

	public static void main(String[] args) {
		MyJob j = new MyJob(); //newly created
		j.getT().start();   //ready to run
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
