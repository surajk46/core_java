package threaddemos;

public class DefaultThreadDemo {

	public static void main(String[] args)
	{
		Thread t = Thread.currentThread();
		System.out.println("Name : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
        //1 to 10
		t.setName("application_thread");
		t.setPriority(7);
		System.out.println("After modification......");
		System.out.println("Name : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
	}

}
