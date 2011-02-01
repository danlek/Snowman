import wheels.users.*;
public class Hat 
{
	private Rectangle hatBrim, hatUpper;
	
	
	public Hat(SnowMan snow, Ellipse sun)
	{
		
		hatBrim = new Rectangle(java.awt.Color.BLACK);
		hatBrim.setSize(80, 20);
		hatUpper = new Rectangle(java.awt.Color.BLACK);
		hatUpper.setSize(60, 60);
		
		setLocation(sun.getXLocation() - 5, sun.getYLocation() + 60);
		snow.setX(hatBrim.getXLocation() - 10);
		snow.setY(hatBrim.getYLocation());
		
		
	}
	
	public void setLocation(int x, int y)
	{
		hatBrim.setLocation(x - 10, y + 60);
		hatUpper.setLocation(x, y);
	}
}
