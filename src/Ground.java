//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Ground 
{
	private ArrayList<Image> tiles;
	
	public Ground() throws IOException
	{
		//point the tiles at new array list
		tiles = new ArrayList<>();
		//add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
		Image grass = ImageIO.read(new File("grass.gif"));
		Image gtoR = ImageIO.read(new File("gtoroad.gif"));
		Image road = ImageIO.read(new File("road.gif"));
		Image rtoG = ImageIO.read(new File("rtograss.gif"));
		//tiles.add( ImageIO.read(new File("grass.gif")) );
	
	}
	
	public void drawGround(Graphics2D g)
	{
		//draw the ground on the screen
		if(y == 0 || y == 50) {
			g.drawImage();
		}

	}	
}