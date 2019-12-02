package lv.javaguru.lesson8.HomeWork2;

//"implements Shape" nav nepieciešams, jo AbstractShape šo interfeisu jau implementē
public class Rectangle extends AbstractShape implements Shape {
   private final double height;
   private final double width;

   public Rectangle (double height, double width){
       this.height = height;
       this.width = width;

   }

    @Override
    String color() {
        return "melna";
    }

    @Override
    int edges() {
        return 4;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
