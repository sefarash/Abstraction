package ocaDay3;



public class Circle extends Shape {
	double radius;
	
	public Circle(String name) {
		super("Circle");
	}
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void CalculateArea() {
		// TODO Auto-generated method stub
		area = Math.PI*radius*radius;
		
		
	}

	
	
	

	
	
	
	

}
