
public class Driver {
	private String carModel;
	private float Rating;
	private int distance;
	private static char ex='A';
	public Driver(String carModel,float Rating,int distance)
	{
		this.carModel=carModel;
		this.Rating=Rating;
		this.distance=distance;
		System.out.println(ex+"\t"+this.carModel+"\t"+this.Rating+"\t"+this.distance);
		ex+=1;
	}
	public String getmodel()
	{
		return this.carModel;
	}
	public int getDistance()
	{
		return this.distance;
	}
	public float getRating()
	{
		return this.Rating;
	}
}
