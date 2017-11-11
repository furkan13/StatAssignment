import java.util.Random;
class CoinToss
{
    public static void main (String[]args)
    {

        int differ=10;
        int arr[]=new int[15];
        for(int i:arr)
        {
            arr[i]=differ+(2*10);
        }

        Random r = new Random();

       int n=0;
       for(int i=0;i<15;i++)
       {

           for(int j=0;j<arr[i];j++)
           {
               n = r.nextInt(2) + 1;


           }

       }
    }
}