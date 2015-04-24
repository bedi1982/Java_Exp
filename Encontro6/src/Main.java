
public class Main {
	public static void main(String[] args) {
		//Listas.starta();	
		Tabuada tab = new Tabuada();
		Thread x = new Thread(tab);
		x.start();
	}
}