package prob_001;

public class Point {
	
	public int x;
	public int y;
	
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x){
		
		this.x=x;
	}
    public void setY(int y){
		
		this.y=y;
	}
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
	
	public double distance(Point p){
		return Math.sqrt(Math.pow((x-p.getX()),2)+Math.pow((y-p.getY()),2));

	}

}
