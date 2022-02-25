import java.util.*;
public class Car {
	private String type;
	private String brand;
	private String name;
	private String license;
	private String typeSuv;
	int topSpeed;
	int gasCap;
	int wheelCar; 
	int entertainment;
	private ArrayList<Motorcycle> list;
	public Car(String type, String brand, String name, String license,
			int topSpeed, int gasCap, int wheelCar, String typeSuv, int entertainment ) {
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.wheelCar = wheelCar;
		this.typeSuv = typeSuv;
		this.entertainment = entertainment;
				
		list = new ArrayList<Motorcycle>();
	}
	public String getType() {
		return type;
	}
	public String getBrand() {
		return brand;
	}
	public String getName() {
		return name;
	}
	public String getLicense() {
		return license;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public int getGasCap() {
		return gasCap;
	}
	public int getWheelCar() {
		return wheelCar;
	}
	public String getTypeSuv() {
		return typeSuv;
	}
	public int getEntertainment() {
		return entertainment;
	}
	public ArrayList<Motorcycle> getList(){
		return list;
	}
}