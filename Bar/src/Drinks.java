
public class Drinks extends WriteMenu{

	
	private int size;
	public Drinks(String name,int size,double preis, boolean available) {
		super(name, preis, available);
		// TODO Auto-generated constructor stub
		this.size=size;
	}

	
	
	


//used for printing drink menu
	public void printMenu() {
		if(available==true) {
		System.out.format("%s, %d ml  $%f ", name, size, preis,available);
		System.out.println();
		}
		else {
			System.out.format("%s, %d ml  $%f ", name, size, preis,available);
			System.out.println("Sorry it is not available");
		}
		
	}
	
}
