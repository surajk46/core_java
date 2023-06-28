import java.util.Scanner;

class Reverce
        {
            int n;
            int rem,sum=0,nc=n;
            public void getN(){
                Scanner sc=new Scanner(System.in);
                n=sc.nextInt();
            }
            public void rev(){
                while(n>0){
                    rem=n%10;
                    sum=sum*10+rem;
                    n/=10;
                }

            }
            public void printAns(){
                System.out.println("Reverce of "+nc+" = "+sum);
            }
        }

public class Obj_rev_no {
    public static void main(String[] args) {

        Reverce r1 = new Reverce();
        r1.getN();
        r1.rev();
        r1.printAns();
    }
}
