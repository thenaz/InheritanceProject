package stuff.model;

public class ThirdThing extends SubThing implements UnDoAble
{
	
	public void removesThingsFromNumberedSlots(int [] stuff)
	{
		
	}
	
	public void undoesThat()
	{
		
	}
	
	public int undoesOtherThings()
	{
		return Integer.MIN_VALUE;
	}
	
	public int doesOtherThings(int times)
	{
		return Integer.MIN_VALUE;
	}
	
	public int [] shovesThingsIntoNumberedSlots()
	{
		int [] temp = new int[5];
		
		return temp;
	}
	
	public void doesThat()
	{
		System.out.println("sub class version");
		super.doesThat();
	}

}
