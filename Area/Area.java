import java.util.*;
class Area
{
   int length;
   int breadth;
   public Area(int l, int b)
   {
      length = l;
      breadth = b;
   }
   public int returnArea()
   {
      return length*breadth;
   }
   public static void main(String[] args)
   {
      int l,b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length of a Rectangle :");
      l = sc.nextInt();
      System.out.println("Enter breadth of a Rectangle :");
      b = sc.nextInt();
      Area a = new Area(l,b);
      System.out.println("Area: "+a.returnArea());
   }
}
