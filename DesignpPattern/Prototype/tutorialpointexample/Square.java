
public class Square extends Shape { //ConcretePrototype
	public Square(){
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}
	
}
