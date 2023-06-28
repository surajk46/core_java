public class Pattern {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            int c=n-i+1;
            for(int x=1;x<=i;x++)
            {
                System.out.print(c+" ");
                c++;
            }
            int d=n-1;
            for(int y=1;y<=i-1;y++)
            {
                System.out.print(d+" ");
                d--;
            }
            System.out.println();
        }
    }
}
