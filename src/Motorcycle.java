public class Motorcycle {
	private String type;
	private int wheelMotor;
	private String typeAuto;
	private int helm;
	public Motorcycle(String type, int wheelMotor, String typeAuto, int helm) {
		this.type = type;
		this.wheelMotor = wheelMotor;
		this.typeAuto =typeAuto;
		this.helm = helm;
	}
	public String getType(){
		return type;
	}
	public int getWheelMotor(){
		return wheelMotor;
	}
	public String getTypeAuto() {
		return typeAuto;
	}
	public int helm(){
		return helm;
	}
}