package com.ust.test;

class this_Test
{
     int val1;
     int val2;
    this_Test(int val1, int val2)
    {
        this.val1 = val1 + val1;
        this.val2 = val2 + val2;
    }
 
   void display()
    {
          System.out.println("Value val1 = " + val1 + " Value val2 = " + val2);
    }
}
 
class ThisExample1{
 
       public static void main(String[] args)
       {
            this_Test object = new this_Test(5,10);
            object.display();
       }
}

