
public class Bicycle 

{
     public int Gear;
     public int Speed;
     
     
	public int getGear() 
	{
		return Gear;
	}
	
	public void setGear(int gear)
    {
		Gear = gear;
	}
	
	public int getSpeed() 
	{
		return Speed;
	}
	
	public void setSpeed(int speed)
    {
		Speed = speed;
	}
       
	
	public Bicycle() 
	{
		
	}
	
	
	public Bicycle(int gear, int speed) 
	{
		
		Gear = gear;
		Speed = speed;
	}
	
	public void Apply_Break( int s)
	{
		
		if (s<=Speed)
		{    
			Speed--;
			
			System.out.println(" ****** Speed is decreased  ***** ");
			System.out.println("  After Break The Speed is : "+ Speed);
			
		}
		else
			
		System.out.println("*** It will go to The speed method ***");
		
	}
	
	public void speed (int b)
	{
		
		if(b>=Speed)
		{
			Speed++;
			
			System.out.println(" ******* Speed is increased ****** ");
			System.out.println("  Now Speed is : "+ Speed);
			
		}
		
		else
			
			System.out.println(" You need to slow down your Speed " );
	}
	
	public void Show()
	{
		System.out.println("  Input Gear is : "+ Gear);
		System.out.println("  Input Speed is : "+ Speed);
		
	}
	
}
