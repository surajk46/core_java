package p3_EmpReadWrite;

import java.io.*;

public class P3_empObjWriteInFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Emp [] allemp= {new Emp("sourabh",13,10,1999,25,25000.00),new Emp("omkar",10,8,1999,25,25000.00),
						new Emp("nishant",13,9,2000,25,25000.00)};
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file Name To add Emp object in its : ");
		String fname=br.readLine();
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("L:/myfiles/"+fname));
		for(Emp f1:allemp)
		{
			oos.writeObject(f1);
		}
		System.out.println("all objects Are added in file : "+fname);
	}

}
