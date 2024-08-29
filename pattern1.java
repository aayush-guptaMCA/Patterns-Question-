// pattern 1

class pattern1
{
  public static void main(String str[])
  
  {
      // Solid Rectangle
     for(int i=1;i<=4;i++)
      {
        for(int j=1;j<=5;j++)
         {
            System.out.print("*");
         }
        System.out.println();
      }
  
      // patter2
      // hollow rectangle
    System.out.println("Next pattern");
     for(int i=1;i<=4;i++)
      {
         for(int j=1;j<=5;j++)
          {
             if(i==1 || i==4 || j==1 || j==5)
             {
                System.out.print("*");
             }
              else
             {
               System.out.print(" ");
             }
          }
        System.out.println();
      }
       // half pyramid
    System.out.println("Next pattern");
            for(int i=1;i<=4;i++)
          {    
             for(int j=1;j<=i;j++)
             {
              System.out.print("*");
              
             }
           
           System.out.println();
          }
 
  }
}


