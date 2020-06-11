class Triangle
{
	int x,y,z;
    Triangle()
    {
      x=3;
      y=4;
      z=5;
    }
    public double getArea()
    {
      double s = (x+y+z)/2;
      return Math.pow((s*(s-x)*(s-y)*(s-z)),.5);
    }
    public double getPerimeter()
    {
      return (x+y+z)/2;
    }

    public static void main( String[] args )
    {
        Triangle t = new Triangle();
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
    }
}



