package shape;

public class main {
    public static void main(String[] args) {
        Shape obj=new Area();
        obj.rectangleArea(5,6);
        obj.squareArea(25);
        obj.CircleArea(1.5f);

        Area[] rectangle = new Area[4];
        rectangle[0]=new Area();
        rectangle[1]= new Area();
        rectangle[2]=new Area();
        rectangle[3]=new Area();
        System.out.println("=============================");
        rectangle[0].rectangleArea(45,65);
        rectangle[1].rectangleArea(12,78);
        rectangle[2].rectangleArea(5,5);
        rectangle[3].rectangleArea(10,15);
        System.out.println("===========================");
        Area[]square=new Area[4];
        square[0]=new Area();
        square[1]=new Area();
        square[2]=new Area();
        square[3]=new Area();

        square[0].squareArea(12);
        square[1].squareArea(25);
        square[2].squareArea(16);
        square[3].squareArea(6);
        System.out.println("=============================");

        Area[]circle=new Area[5];
        circle[0]=new Area();
        circle[1]=new Area();
        circle[2]=new Area();
        circle[3]=new Area();
        circle[4]=new Area();

        circle[0].CircleArea(35);
        circle[1].CircleArea(14);
        circle[2].CircleArea(42);
        circle[3].CircleArea(7);
        circle[4].CircleArea(56);





    }
}
