//WriteMenu is parent class of Drinks, Foods, Desserts
public class WriteMenu {
	
	public String name;
	public double preis;
	public int size;
	public boolean available;
	
	public WriteMenu(String name, double preis,  boolean available){
		setName(name);
		setPreis(preis);
		setAvailability(available);
		
	}
	
	public void setAvailability(boolean available2) {
		// TODO Auto-generated method stub
		available = available2;
	}

	public void setName(String newname) {
		name=newname;
	}
	
	public void setPreis(double newpreis) {
		preis=newpreis;
	}
	
	public void setSize(int newsize) {
		size=newsize;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public int getSize() {
		return size;
	}
	public boolean getAvailability() {
		return available;
	}
	

	//used for printing both Food and Dessert menu
	public void printMenu() {
		if(available==true) {
			System.out.format("%s, $%f",name,preis);
			System.out.println();
		}else if(available==false){
			System.out.format("%s, $%f ",name,preis);
			System.out.println("Sorry it is not available today");
		}
	}
	
}
