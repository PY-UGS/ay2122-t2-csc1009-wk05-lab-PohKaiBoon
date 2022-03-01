public class Rectangle extends GeometricObject  {
    
    private double width;
    private double height;

    public Rectangle() {
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
       
        super(color, filled);
        this.width = width;
        this.height = height;
        
    }
    
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        
        double area = (this.width * this.height);
        return area;
    }

    public double getPerimeter() {
        
        double pm = (this.height+this.width)*2;
        return pm;
    }


}
