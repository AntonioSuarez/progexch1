
public class Main {

	public static void main(String[] args){
		House house = new House();
		Window window = new Window();
		house.CreateHouse(2);
		window.CreateWindow(2);
		window.DisPlayWindow("Is this what it's supposed to look like?");
	}
}

