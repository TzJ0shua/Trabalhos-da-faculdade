
package souza_joshua_pe13v1;


public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value
     * @param color
     * @param filled */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color
     * @return  */
    public String getColor() {
        return color;
    }

    /** Set a new color
     * @param color */
    public void setColor(String color) {
        this.color = color;
    }

    /** *  Return filled.Since filled is boolean,
  the get method is named isFilled
     * @return  */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled
     * @param filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated
     * @return  */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject o : a) {
            sum += o.getArea();
        }
        return sum;
    }
    /** Abstract method getArea
     * @return  */
    public abstract double getArea();

    /** Abstract method getPerimeter
     * @return  */
    public abstract double getPerimeter();
    
}
