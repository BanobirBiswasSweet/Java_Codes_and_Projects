package codes;

public class Cylinder extends Circle{
	
	private double height;
	
	public Cylinder(double radius,double height){
			
		super(radius);
		
		this.height = Math.abs(height);
		
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		
		this.height = Math.abs(height);
	}
	
	
	public double volume(){
		
		return super.area() * height;
	}
	
	public double area(){
		
		return super.circumference() * height + super.area() * 2;
	}
	
	
	
}
