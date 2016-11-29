package stuff.model;

public abstract class Thing implements DoAble
{

	private String thingData;
	
	public String getThingData()
	{
		return thingData;
	}
	
	public void getThingData(String data)
	{
		untouchable();
		this.thingData = data;
	}
	
	private void untouchable()
	{
		
	}
	
	public void doesThat()
	{
		System.out.println("asdasasdasasdasasdas");
	}
	
	public void doesThings()
	{
		
	}
}
