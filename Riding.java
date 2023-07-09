import java.util.*;
public class Riding {
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Customer Ride Distance:");
		double TotalDistance=sc.nextDouble();
		String ex=sc.nextLine();
		System.out.println("Please Enter the carModel:");
		String carModel=sc.nextLine();
		System.out.println("List Of Drivers with Details:");
		System.out.println("Driver"+"\t"+"Car Model"+"\t"+"Rating"+"\t"+"DistanceFromCustomer");
		Driver A=new Driver("sedan",4,500);
		Driver B=new Driver("HatchBack",4.3f,1000);
		Driver C=new Driver("5 seater",4.8f,200);
		Driver D=new Driver("sedan",4.1f,700);
		Driver E=new Driver("Hatch Back",4.7f,430);
		char[] drivers=new char[] {'A','B','C','D','E'};
		String carmodels[]= {A.getmodel(),B.getmodel(),C.getmodel(),D.getmodel(),E.getmodel()};
		int[] distances=new int[]{A.getDistance(),B.getDistance(),C.getDistance(),D.getDistance(),E.getDistance()};
		float[] ratings=new float[]{A.getRating(),B.getRating(),C.getRating(),D.getRating(),E.getRating()};
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<carmodels.length;i++)
		{
			if(carmodels[i].equalsIgnoreCase(carModel))
				l.add(i);
		}
		List<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<l.size();i++)
		{
			l1.add(distances[l.get(i)]);
		}
		Collections.sort(l1);
		char driver1=' ';
		for(int i=0;i<l.size();i++)
		{
			if(ratings[l.get(i)]>=4) {
				driver1=drivers[i];
				break;
			}
		}
		if(driver1==' ') {
			System.out.println("No driver available");
		}
		else {
		System.out.println("Driver "+driver1+" will get you to the destination");
		System.out.println("Your charge will be Rs"+TotalDistance*8);
		}
		
	}

}
