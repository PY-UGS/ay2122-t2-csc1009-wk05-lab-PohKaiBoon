public class Square extends Shape {
    
    public Square(double dim1, double dim2) {

        super(dim1,dim2);
    }

    public double area()
    {
        return super.getDim1()*super.getDim2();

    }

}
