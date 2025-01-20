// Write a Java Program to implement the following:
// Create a base class TwoD that contains two instance variable length and breadth
// and a method area(). Three subclasses triangle, square and rectangle inherits the
// base class TwoD and override the method area() according to their shape.
class TwoD{
  double length, breadth;
  TwoD(double length, double breadth){
    this.length=length;
    this.breadth=breadth;
  }
  double area(){
    return length*breadth;
  }
}
class Triangle extends TwoD{
  Triangle(double length, double breadth){
    super(length, breadth);
  }
  double area(){
    return 0.5*length*breadth;
  }
}
class Square extends TwoD{
  Square(double length, double breadth){
    super(length, breadth);
  }
  double area(){
    return length*length;
  }
}
class Rectangle extends TwoD{
  Rectangle(double length,double breadth){
    super(length, breadth);
  }
  double area(){
    return length*breadth;
  }
}
class Main{
  public static void main(String[] args) {
    Triangle t = new Triangle(10, 20);
    Square s = new Square(10, 10);
    Rectangle r = new Rectangle(10, 20);
    System.out.println("Area of Triangle: "+t.area());
    System.out.println("Area of Square: "+s.area());
    System.out.println("Area of Rectangle: "+r.area());
    
  }

}