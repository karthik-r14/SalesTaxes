/**
 * Created by karthikr on 24/08/15.
 */
import java.util.Scanner;
import java.lang.Integer;
import java.lang.Float;
public class salesTaxes {

   int Total,SalesTax;

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

            computeTax(parts);
            index++;


        }
    }


    static void computeTax(String [] s )
    {

        Integer quantity= Integer.parseInt(s[0]);
        float cost=Float.parseFloat(s[s.length-1]);

        //for(int i=1;i<s.length-1;++i)
        //{







       // }

    System.out.println(quantity);
    System.out.println(cost);
    }


}



