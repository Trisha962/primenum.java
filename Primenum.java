public class Primenum
{
    public static void main(String args[])
    {
        int i,j=0,k=0;
        int n=209;
        j=n/2;
        if(n==0||n==1)
        {
System.out.println(n+" is not prime number");
        }
        else
            {
            for(i=2;i<=j;i++)
            {
                if(n%i==0)
                {
System.out.println(n+" is not a prime number.");
                    k=1;
break;
                }
            }
            if(k==0)  {System.out.println(n+" is a prime number."); }
        }
    }
}

