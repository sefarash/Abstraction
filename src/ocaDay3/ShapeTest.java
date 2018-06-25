package ocaDay3;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle("Super Circle");
		System.out.println(c1.name);
		
		
		
		Circle c2 = new Circle("Super Circle",4);
		c2.CalculateArea();
		System.out.println(c2.radius);
		System.out.println(c2.area);
		System.out.println(c2.radius);
		
		
		

	}

}
