import java.util.*;


class CoinToss
{
    public static void main (String[]args)
    {
        int p=0;
        double differ=2;
       int m;
        double arr[]=new double[1000];
        for( m=0;m<30;m++)
        {
            arr[m]=differ;
            differ=(differ+15);         //declaring checking times
        }

        int j;
        for(j=m;j<70;j++)
        {
            arr[j]=differ;
            differ=differ+150;
        }

        for(int i=j;i<100;i++)

        {
            arr[i]=differ;
            differ=differ+500;
        }


        System.out.println("number of checking time");
        for(int i = 0;i<100;i++)
        {
            System.out.println(arr[i]);    //number of check
        }
        System.out.println("number of success ");





        double arr2[]=new double[2];
        double arr3[]=new double[100];
        Random r = new Random();

        int n=0;
        for(int i=0;i<100;i++)
        {


            p=0;

            for(int t=0;t<arr[i];t++)
            {

                for(int k=0;k<2;k++)
                {
                    n = r.nextInt(2) + 1;
                    arr2[k]=n;
                    //System.out.println(arr2[k]);

                }
                if(arr2[0]==arr2[1] )

                {



                    p++;
                    // System.out.println(p);


                }


            }

            arr3[i]=p;
            System.out.println(arr3[i]);

        }


        double arr4[]=new double[100];
        double d=0.0;

        System.out.println("probability of having same face on first two toss");
        for(int i=0;i<100;i++)
        {
            d=arr3[i]/arr[i];

            System.out.println(d);



        }

        System.out.println("\n\nprobability of having same face on three or more than three toss  P(A)");

        for(int i=0;i<100;i++)
        {
            d=arr3[i]/arr[i];

            System.out.println(1-d);



        }


    }
}
