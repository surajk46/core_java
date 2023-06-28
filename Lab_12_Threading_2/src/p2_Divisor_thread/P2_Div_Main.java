package p2_Divisor_thread;

public class P2_Div_Main {

	public static void main(String[] args) {
		Div_Writer d=new Div_Writer();
		Div_Job div=new Div_Job(d,25);
		div.getT().start();
	}

}
