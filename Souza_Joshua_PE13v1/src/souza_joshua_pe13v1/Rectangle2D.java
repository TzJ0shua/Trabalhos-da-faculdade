
package souza_joshua_pe13v1;

public class Rectangle2D extends GeometricObject {
  
    public double width;
    public double height; 
    
   public Rectangle2D(){
       
   }
   
   public Rectangle2D(double width, double height){
       this.width = width; 
       this.height = height; 
   }
   
   public double getWidth(){
       return width; 
   }
   
   public void setWidth(double width) {
       this.width = width;
   }
   
   public double getHeight(){
       return height; 
   }
   
   public void setHeight(double height){
       this.height = height;
   }
   
   @Override
   public double getArea(){
       return width * height;
   }
   
   @Override
   public double getPerimeter(){
       return 2 * (width + height);
   }
}
