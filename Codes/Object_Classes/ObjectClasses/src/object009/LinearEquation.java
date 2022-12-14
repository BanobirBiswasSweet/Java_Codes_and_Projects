package object009;

public class LinearEquation {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f){
		
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	public double getA(){
		
		return a;
	}
	
    public double getB(){
		
		return b;
	}

    public double getC(){
	
	return c;
    }


    public double getD(){
	
	return d;
    }

    public double getE(){
	
	return e;
    }

    public double getF(){
	
	return f;
    }
    
    public boolean isSolvable(){
    	
    	if((a*d-b*c)!=0)
    		return true;
    	else
    		return false;
    }
    
    public double getX(){
    	
    	boolean bool=isSolvable();
    	
    	if(bool==true)
    	return (e*d-b*f)/(a*d-b*c);
    	else
    		return 0;
    }
    
 public double getY(){
    	
    	boolean bool=isSolvable();
    	
    	if(bool==true)
    	return (a*f-e*c)/(a*d-b*c);
    	else
    		return 0;
    }

}
