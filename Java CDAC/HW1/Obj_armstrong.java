import java.util.Scanner;

class Armstrong{
    int a;
    public void getA(){
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
    }
    public int Count_no_of_digit(){
        int ac=this.a;
        int c=0;
        while (ac>0){
            c++;
            ac/=10;
        }
        return c;
    }
    public int armstrong(){
        int c=Count_no_of_digit();
        int ac=this.a;
        int rem,sum=0;
        while (ac>0){
            rem=ac%10;
            sum+=(int)Math.pow(rem,c);
            ac/=10;
        }
        return sum;
    }
    public void printAns(){
        int ans=armstrong();
        if(a==ans)
            System.out.println(a+" is Armstrong");
        else
            System.out.println(a+" is Not Armstrong");
    }
}
public class Obj_armstrong {
    public static void main(String[] args) {
        Armstrong a1=new Armstrong();
        a1.getA();
        a1.printAns();
    }
}
