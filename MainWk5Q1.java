public class MainWk5Q1 {
    
    public static void main(String[] args) {
        
        
        Circle circle= new Circle(1, "white", false);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        
        
        Rectangle rectangle = new Rectangle(2, 4, "black", true);
        System.out.println("\nA rectangle "+ rectangle. toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        

    }
}
