
public class TemplatePatternDemo {
	public static void main(String[] args){
		Game game = new Cricket();
		game.play(); //알고리즘은 자동실
		System.out.println();
		game = new Football();
		game.play();
		
	}
}
