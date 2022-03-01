import java.util.Date;

public class GeometricObject {
    

    private String color;
    private boolean filled;
    private java.util.Date dateCreated;


    public GeometricObject() {

    }


    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        
        this.dateCreated= new Date();
        return this.dateCreated;
    }

    public String toString() {
        
        String is = "created on " + this.getDateCreated() + "\n" + "color: "+ this.color + " and " + "filled: " + this.filled;
        return is;
    }

    

    
}

