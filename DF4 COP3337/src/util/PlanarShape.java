package util;

public abstract class PlanarShape{

    private String name;

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString(){return name;}//overriding Object.toString(), don't change it in Circle, Rectangle or Square

    public PlanarShape(String name){this.name = name;}//constructor

}