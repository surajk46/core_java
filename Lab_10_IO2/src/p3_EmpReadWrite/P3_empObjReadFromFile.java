package p3_EmpReadWrite;

import java.io.*;

public class P3_empObjReadFromFile {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file Name to Read Emp object in its : ");
		String fname=br.readLine();
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("L:/myfiles/"+fname));
		Emp [] e=new Emp[3];
		for(int i=0;i<e.length;i++)
		{
			e[i]=(Emp)ois.readObject();
			System.out.print(e[i]);
		}
	}
}
