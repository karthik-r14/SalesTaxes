/**
 * Created by karthikr on 24/08/15.
 */
import java.util.Scanner;

public class salesTaxes {



    public static void main(String []args )
    {
      String str;
      int num,index=0;
        Scanner a=new Scanner(System.in);
        System.out.println("Input1:");
        System.out.println("Enter no of items:");
        num=a.nextInt();


        while(index<num)
        {
            str = a.nextLine();
            String[] parts = str.split(" ");

            int i = 0;
            while (i < parts.length)
            {

                System.out.println(parts[i]);

                i++;
            }


            index++;


        }
    }











}



