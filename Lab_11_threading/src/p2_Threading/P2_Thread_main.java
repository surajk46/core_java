package p2_Threading;

public class P2_Thread_main {

	public static void main(String[] args) {
		Thread t1=new Thread_Class();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t1.start();
		
		
		Runnable r1=new Runnable_Interface();
		Thread r2=new Thread(r1);
		r2.start();
		
	}

}
