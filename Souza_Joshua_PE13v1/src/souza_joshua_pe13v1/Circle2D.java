
package souza_joshua_pe13v1;


public class Circle2D extends GeometricObject{

    private double radius;

    public Circle2D(double radius){
        this.radius = radius; 
    }
    
    public double getRadius() {
        return radius; 
    }
    
    public void setRadius(double radius){
        this.radius = radius; 
    }
    
    @Override 
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double getDiameter(){
        return 2 * radius;
    }   
    
    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + "abd the radius is " + radius);
    }
}