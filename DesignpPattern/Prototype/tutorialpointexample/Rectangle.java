
public class Rectangle extends Shape{ //ConcretePrototype
	
		public Rectangle(){
			type = "Rectangle";
		}

		@Override
		void draw() {
			System.out.println("Inside Square::draw() method.");
		}
		
}
