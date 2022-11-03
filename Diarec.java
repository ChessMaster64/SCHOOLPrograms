import java.util.*;
public class Diarec
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=(2*s.length()+1)/2;
        String ar[]=new String[2*s.length()+1];
        ar[a]="-";
        int j=a;
        int g=0;
        for(int i=0;i<s.length();i++)
        {
            ar[i]=s.charAt(i)+"";
        }
        for(int i=a+1;i<ar.length;i++)
        {
            ar[i]=ar[g];
            g++;
        }
        for(int i=0;i<2*s.length()+1;i++)
        {
            System.out.print(ar[i]);
        }
        System.out.println();
        for(int i=a;i>=0;i--)
        {
            if(a==ar.length&&i==0)
            {
                while(a!=i)
                {
                    for(int m=0;m<=i;m++)
                    {
                        System.out.print(ar[m]);
                    }
                    for(int p=0;p<=a-i;p++)
                    {
                        System.out.print(" ");
                    }
                    for(int n=2*s.length();n>=a;n--)
                    {
                        System.out.print(ar[n]);
                    }
                    System.out.println();
                    a--;
                    i++;
                }
            }
            if(i==a)
            {
                for(int f=0;f<2*s.length()+1;f++)
                {
                    System.out.print(ar[f]);
                }                
                System.out.println();
                i--;
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(ar[k]);
            }
            for(int p=0;p<=a-i;p++)
            {
                if(p!=0)
                    System.out.print(" ");
            }
            for(int l=a+1;l<ar.length;l++)
            {
                System.out.print(ar[l]);
            }
            System.out.println();
            a++;
        }
    }
}
