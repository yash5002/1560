package bulb;

public class lightbulb {
	int watt;

	
	
	public  lightbulb(int incap) {
		this.watt= incap;
		}
	
	
	
	public void power(int power){
		watt+=power;
		}
	
	
	
	public int getBulbwattage() {
		return watt;
	}	

}
