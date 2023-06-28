public class Pattern2 {
    public static void main(String[] args) {
        int n=10;

        for(int i=1;i<n;i++)
        {
            // for spaces
            for(int x=n;x>=i;x--)
            {
                System.out.print(" ");
            }
            // for star
            for(int y=1;y<=2*i-1;y++)
            {
                if(y==1)
                     System.out.print("*");
                else
                    System.out.print(" ");
                if(y==2*i-2)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
