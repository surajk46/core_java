package p1_defaultThreading;

public class P1_defaultThreading {

	public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println(t.getPriority());
	System.out.println(t.getName());
	t.setPriority(8);
	System.out.println(t.getPriority());
	t.setName("Skkkk");
	System.out.println(t.getName());
	//System.out.println(t.getId());
	System.out.println(t.isAlive());
	System.out.println(t.threadId());
	System.out.println(t.isVirtual());
	}

}
