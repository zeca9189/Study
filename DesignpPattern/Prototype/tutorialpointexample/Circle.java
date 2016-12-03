
public class Circle extends Shape { //ConcretePrototype

	public Circle(){
		type = "Circle";
	}
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
	
}
