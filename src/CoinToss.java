import java.util.Random;
class CoinToss
{
    public static void main (String[]args)
    {
         int p=0;
        double differ=10;
        double arr[]=new double[15];
        for(int i=0;i<15;i++)
        {
            arr[i]=differ;
            differ=(differ+10)*2;
        }


       for(int i = 0;i<15;i++)
       {
           System.out.println(arr[i]);
       }
        System.out.println("\n\ncheck");





        double arr2[]=new double[2];
        double arr3[]=new double[15];
        Random r = new Random();

       int n=0;
       for(int i=0;i<15;i++)
       {


            p=0;
            
           for(int j=0;j<arr[i];j++)
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


       double arr4[]=new double[15];
       double d=0.0;
       for(int i=0;i<15;i++)
       {
           d=arr3[i]/arr[i];
           System.out.println(1-d);



        }



    }
}