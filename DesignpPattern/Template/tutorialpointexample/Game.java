
public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play(){ //algorithm 
		
		initialize(); //세부 알고리즘은 상속받은 클래스에서 구
		
		startPlay();
		
		endPlay();
	}
}
