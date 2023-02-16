package shape;

abstract class Shape {
 abstract void rectangleArea(int length,int breath);
 abstract void squareArea(int sides);
 abstract void CircleArea(float radius);

}
class Area extends Shape{
 int length;
 int breadth;
 double Area;
 int sides;
 float radius;
 double pie =3.14;



 void rectangleArea(int length, int breadth) {
this.length=length;
this.breadth=breadth;
Area=length*breadth;
  System.out.println("the Area of rectangle is: "+length * breadth +"m2");
 }

 @Override
 void squareArea(int sides) {
  this.sides=sides;
  Area = sides * sides;
  System.out.println("the area of square is: "+sides * sides + "m2");


 }

 @Override
 void CircleArea(float radius) {
  this.radius=radius;
Area=pie*radius;
  System.out.println("the Are of circle is: "+pie * radius + "m2 ");

 }
}
