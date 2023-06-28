package p1_Printer;

public class SyncDemo {
	public static void main(String[] args) {
		
		Printer p=new Printer();
		PrintTask pt=new PrintTask(p,"The","Shivam","Sharma");
		pt.getT().start();
		PrintTask pt2=new PrintTask(p,"MBA","Aspraint","Pritish");
		pt2.getT().start();
		PrintTask pt3=new PrintTask(p,"Deutsche","Banker","Shrikant");
		pt3.getT().start();
		
		
		
		}
}
