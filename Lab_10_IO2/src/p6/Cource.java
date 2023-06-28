package p6;

import java.io.Serializable;

public class Cource  implements Serializable{
	private int courceId ;
	private String courceName;
	private  double fee;
	
	
	public Cource() {
		super();
		courceId=0;
		courceName="";
		fee=0;
	}

	public Cource(int courceId, String courceName, double fee) {
		super();
		this.courceId = courceId;
		this.courceName = courceName;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "\nCourceId = " + courceId + "\nCource Name = " + courceName + "\nCource fee=" + fee;
	} 
	
	
}
