public class MainWk5Q2 {
    
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s = new Square(6,6);
        Shape test;

        test= r;
        System.out.println("Inside Area for " + test.returnShape());
        System.out.println("Area is " + test.area());
        test= t;
        System.out.println("Inside Area for " + test.returnShape());
        System.out.println("Area is " + test.area());
        test= c;
        System.out.println("Inside Area for " + test.returnShape());
        System.out.println("Area is " + test.area());
        test= e;
        System.out.println("Inside Area for " + test.returnShape());
        System.out.println("Area is " + test.area());
        test= s;
        System.out.println("Inside Area for " + test.returnShape());
        System.out.println("Area is " + test.area());

   

    }
}
