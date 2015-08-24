
/**
 * Created by karthikr on 24/08/15.
 */

import java.util.Scanner;
class commodity
{
    int quantity;
    String name;
    float cost;
    //int imported;



    commodity(int q,String item,float c)
    {
        quantity=q;
        name=item;
        cost=c;

    }
    float computeTax()
    {
        float temp;
        switch(name)
        {
            'book':
            'food':
            'medical products':break;
            default:temp=c.cost+(c.cost*c.quantity*0.1);

        }
        return temp;


    }

}

public class sales {

    int Total,SalesTax;

    public static void main(String []args )
    {


        commodity c1=new commodity(1,"book",12.49);
        commodity c2=new commodity(1,"musicCD",14.99);
        commodity c2=new commodity(1,"chocolate",0.85);
        Total=compute(c1);

    }
}
