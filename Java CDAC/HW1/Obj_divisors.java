import java.util.Scanner;

class Divisor{
    int no;
    public void getNo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        no=sc.nextInt();
    }
    public void diviors(){
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                System.out.print(i+"  ");
            }

        }
    }
}
public class Obj_divisors {
    public static void main(String[] args) {
        Divisor d1=new Divisor();
        d1.getNo();
        d1.diviors();
    }
}
