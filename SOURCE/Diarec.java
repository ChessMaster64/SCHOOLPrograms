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
        a=ar.length-1;
        for( int v=1;v<=j;v++)
        {
            for(int q=0;q<=v;q++)
            {
                System.out.print(ar[q]);
            }
            for(int p=0;p<=a-v-2;p++)
            {
                if(p!=0)
                    System.out.print(" ");
            }
            for(int l=a-1;l<=ar.length-1;l++)
            {
                if(l==(ar.length/2))
                {
                    for(int z=0;z<=s.length()-1;z++)
                    {
                        System.out.print(ar[z]);
                    }
                    break;
                }
                System.out.print(ar[l-((ar.length/2)+1)]);
            }   
            System.out.println();
            a--;
        }
    }
}
