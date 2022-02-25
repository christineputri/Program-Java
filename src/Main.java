import java.util.*;
public class Main {
	public static Scanner get = new Scanner(System.in);
	public static ArrayList<Car> b_list = new ArrayList<Car>();
	public static ArrayList<Motorcycle> m_list = new ArrayList<Motorcycle>();

	public static void b_view() {
		System.out.println("Type");
		System.out.println("=====");
		if(b_list.size()==0) {
			System.out.println("Empty");
		}
		else {
			for(int i=0;i<b_list.size();i++) {
				System.out.println(b_list.get(i).getType()+". "+b_list.get(i).getName());
			}
		}
	}
	public static void m_view() {
		System.out.println("Name");
		System.out.println("=======");
		if(m_list.size()==0) {
			System.out.println("Empty");
		}
		else {
			for(int i=0;i<m_list.size();i++) {
				System.out.print((i+1)+". "+m_list.get(i).getType());
				m_list.get(i);
				System.out.println("");
			}
		}
	}
	public static void main(String [] args) {
		m_view();
		b_view();
		System.out.println("Input type [Car | Motorcycle]: ");
		String type = get.nextLine();
		
		String brand;
		do {
			System.out.println("Input brand [>=5]: ");
			brand= get.nextLine();
		}while( brand.length() <5);
		
		String name;
		do {
			System.out.println("Input name [>=5]: ");
			name= get.nextLine();
		}while( name.length() <5);
		
		
		String license;
		do {
			System.out.println("Input license: ");
			license= get.nextLine();
		}while( !license.matches("[A-Z] \\d\\d\\d\\d [A-Z][A-Z][A-Z]"));
		
		int topSpeed;
		do {
			System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
			topSpeed= get.nextInt();
			get.nextLine();
		}while( topSpeed<100 || topSpeed > 250);
		
		int gasCap;
		do {
			System.out.println("Input gas capacity [30 <=gasCap <=60]: ");
			gasCap= get.nextInt();
			get.nextLine();
		}while( gasCap <30 || gasCap >60);
		
		if(type.equals("Motorcycle")) {
			int wheelMotor;
			do {
				System.out.println("Input wheel [2 <= wheel <= 3]: ");
				wheelMotor = get.nextInt();
				get.nextLine();
			}while (wheelMotor <2 || wheelMotor > 3);
		} else if (type.equals("Car")) {
			int wheelCar;
			do {
				System.out.println("Input wheel [4 <= wheel <= 6]: ");
				wheelCar = get.nextInt();
				get.nextLine();
			}while (wheelCar <4 || wheelCar >6);
		}
		
		Object typeAuto = 0;
		if(type.equals("Car")) {
			Object typeSuv;
			do {
				System.out.println("Input type [SUV | Supercar | Minivan]: ");
				typeSuv = get.nextLine();
			}while (!typeSuv.equals("SUV") || !typeSuv.equals("Supercar") || !typeSuv.equals("Minivan"));
		} else if (typeAuto.equals("Motorcycle")) {
			do {
				System.out.println("Input type [Automatic | Manual]: ");
				typeAuto = get.nextLine();
			}while (!typeAuto.equals("Automatic") || !typeAuto.equals("Manual"));
		}
		
		int entertainment;
		do {
			System.out.println("Input entertainment system amount [>=1]: ");
			entertainment= get.nextInt();
			get.nextLine();
		}while( entertainment <1);
		
		int helm;
		do {
			System.out.println("Input helm amount [>=1]: ");
			helm= get.nextInt();
			get.nextLine();
		}while( helm <1);
				
		}
	}