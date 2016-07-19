
public class House {
	public final static int BATCHNUM = 3265;
	
	public void CreateHouse(int numHouses){
		for(int i = 0; i < numHouses; i++){
			System.out.println("      /\\");
			System.out.println("     /  \\");
			System.out.println("    /    \\");
			System.out.println("   /      \\");
			System.out.println("  /        \\");
			System.out.println(" /          \\");
			System.out.println("|            |");
			System.out.println("|            |");
			System.out.println("|            |");
			System.out.println("|            |");
			System.out.println("--------------   " + BATCHNUM);
			System.out.println("Number of Houses printed: " + numHouses);
		}
	}
}

class Window{
	
	public void CreateWindow(int numWindows){
		for(int i = 0; i < numWindows; i++){
			System.out.println("----");
			System.out.println("|  |");
			System.out.println("----");
			System.out.println("Number of Windows printed: " + numWindows);
		}
	}
	
	public void DisPlayWindow(String windowstring) {
		System.out.println(windowstring);
	}
	
}
