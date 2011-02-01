import wheels.users.*;
public class SnowCartoon extends Frame
{
	private SnowMan snowMan;
	private Hat hat;
	private Ellipse sun;
	private ConversationBubble bubble;
	public SnowCartoon()
	{
		snowMan = new SnowMan(0, 60);
		sun = new Ellipse(java.awt.Color.MAGENTA);
		sun.setLocation(360, 99);
		hat = new Hat(snowMan, sun);
		//hat.setLocation(20, 180);
		bubble = new ConversationBubble("Welcome to nuclear winter!", ConversationBubble.TAIL_DIR_LEFT);
		bubble.setLocation(110, 110);
		
	}
	
	public static void main(String[] args) 
	{
		SnowCartoon snowCartoon = new SnowCartoon();

	}

}
