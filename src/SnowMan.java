import wheels.users.*;
public class SnowMan 
{
	private Ellipse head, body, leftEye, rightEye;
	private int x, y;

	public SnowMan()
	{
		body = new Ellipse(java.awt.Color.WHITE);
		body.setSize(100, 100);
		
		head = new Ellipse(java.awt.Color.WHITE);
		head.setSize(80, 80);

		leftEye = new Ellipse(java.awt.Color.DARK_GRAY);
		leftEye.setSize(15, 15);

		rightEye = new Ellipse(java.awt.Color.DARK_GRAY);
		rightEye.setSize(15, 15);
		x = 0;
		y = 0;
//		body.setLocation(10, 300);
//		head.setLocation(20, 240);
//		leftEye.setLocation(35, 265);
//		rightEye.setLocation(75, 265);
		this.setOutline(java.awt.Color.BLACK, 2);
	}
	public SnowMan(int x, int y)
	{
		body = new Ellipse(java.awt.Color.WHITE);
		body.setSize(100, 100);
		
		head = new Ellipse(java.awt.Color.WHITE);
		head.setSize(80, 80);

		leftEye = new Ellipse(java.awt.Color.DARK_GRAY);
		leftEye.setSize(15, 15);

		rightEye = new Ellipse(java.awt.Color.DARK_GRAY);
		rightEye.setSize(15, 15);
		this.x = x;
		this.y = y;
		setLocation();
		
//		body.setLocation(10, 300);
//		head.setLocation(20, 240);
//		leftEye.setLocation(35, 265);
//		rightEye.setLocation(75, 265);
		this.setOutline(java.awt.Color.BLACK, 2);
	}
	public void setOutline(java.awt.Color color, int thickness)
	{
		body.setFrameColor(color);
		body.setFrameThickness(thickness);
		head.setFrameColor(color);
		head.setFrameThickness(thickness);
	}
	public void setLocation()
	{
		body.setLocation(x, 60 + y);
		head.setLocation(10 + x, y);
		leftEye.setLocation(25 + x, 25 + y);
		rightEye.setLocation(55 + x, 25 + y);
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void setX(int x)
	{
		this.x = x;
		setLocation();
	}
	public void setY(int y)
	{
		this.y = y;
		setLocation();
	}
}
