
public class PrototypePatternDemo { //Client
	public static void main(String[] args){
		ShapeCache.loadCache();
		
		Shape cloneShape = (Shape) ShapeCache.getShpae("1");
		System.out.println("Shape : " + cloneShape.getType());
		
		Shape cloneShape2 = (Shape) ShapeCache.getShpae("2");
		System.out.println("Shape : " + cloneShape2.getType());
		
		Shape cloneShape3 = (Shape) ShapeCache.getShpae("3");
		System.out.println("Shape : " + cloneShape3.getType());
	}
}
