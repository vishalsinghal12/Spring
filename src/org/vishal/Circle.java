package org.vishal;

public class Circle {

	
private int i;
private Point center;

public Point getCenter() {
	return center;
}

public void setCenter(Point center) {
	this.center = center;
}

public void  draw()

{
System.out.println(center.getX()+":"+center.getY());	
}

}
