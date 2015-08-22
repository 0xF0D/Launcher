package net.launcher.theme;

import java.awt.Color;

import javax.swing.border.EmptyBorder;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.ComboboxStyle;
import net.launcher.components.ComponentStyle;
import net.launcher.components.DragbuttonStyle;
import net.launcher.components.DraggerStyle;
import net.launcher.components.LinklabelStyle;
import net.launcher.components.PassfieldStyle;
import net.launcher.components.ServerbarStyle;
import net.launcher.components.TextfieldStyle;

public class LoginTheme
{
	public static int			 frameW 	 = 850; 
	public static int			 frameH		 = 520; 

	public static ButtonStyle	 toAuth		 = new ButtonStyle(430, 410, 122, 42, "font", "enter", 16F, Color.RED, true, Align.CENTER);
	public static ButtonStyle	 toLogout    = new ButtonStyle(710, 410, 129, 42, "font", "exit", 16F, Color.RED, true, Align.CENTER);
	/*public static ButtonStyle	 toGame		 = new ButtonStyle(420, 436, 140, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
	public static ButtonStyle	 toPersonal  = new ButtonStyle(570, 436, 140, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
	public static ButtonStyle	 toOptions   = new ButtonStyle(714, 436, 130, 40, "font", "enter", 16F, Color.YELLOW, true, Align.CENTER);
	public static ButtonStyle	 toRegister  = new ButtonStyle(570, 436, 140, 40, "font", "button", 16F, Color.YELLOW, true, Align.CENTER);
	*/
	
	public static ButtonStyle	 toGame		 = new ButtonStyle(245, 410, 125, 42, "font", "play", 16F, Color.GREEN, true, Align.CENTER);
    public static ButtonStyle	 toPersonal  = new ButtonStyle(570, 436, 120, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
    public static ButtonStyle	 toOptions   = new ButtonStyle(710, 470, 129, 42, "font", "settings", 16F, Color.RED, true, Align.CENTER);
    public static ButtonStyle	 toRegister  = new ButtonStyle(714, 476, 130, 40, "font", "button", 16F, Color.YELLOW, true, Align.CENTER);	
	
    
	//public static TextfieldStyle login		= new TextfieldStyle(10, 440, 195, 36, "textfield", "font", 16F, Color.WHITE, Color.DARK_GRAY, new EmptyBorder(0, 10, 0, 10));
	//public static PassfieldStyle password	= new PassfieldStyle(215, 440, 195, 36, "textfield", "font", 16F, Color.WHITE, Color.DARK_GRAY, "*", new EmptyBorder(0, 10, 0, 10));
	
	public static TextfieldStyle login		= new TextfieldStyle(40, 415, 195, 36, "", "font", 16F, Color.DARK_GRAY, Color.DARK_GRAY, new EmptyBorder(0, 10, 0, 10));
	public static PassfieldStyle password	= new PassfieldStyle(230, 415, 195, 36, "", "font", 16F, Color.DARK_GRAY, Color.DARK_GRAY, "*", new EmptyBorder(0, 10, 0, 10));
	
	public static ComponentStyle newsBrowser= new ComponentStyle(0, 30, 850, 369, "font", 16F, Color.WHITE, true);
	public static LinklabelStyle links		= new LinklabelStyle(520, 415, 0, "font", 16F, Color.WHITE, Color.LIGHT_GRAY);

	//public static DragbuttonStyle dbuttons	= new DragbuttonStyle(793, 22, 15, 20, 820, 17, 15, 15, "draggbutton", true);
	//public static DraggerStyle	  dragger	= new DraggerStyle(0, 0, 770, 30, "font", 16F, Color.WHITE, Align.LEFT);
	
	public static DragbuttonStyle dbuttons	= new DragbuttonStyle(793, 22, 15, 20, 820, 17, 15, 15, "draggbutton", true);
	public static DraggerStyle	  dragger	= new DraggerStyle(0, 0, 770, 30, "font", 16F, Color.WHITE, Align.LEFT);
	
	//public static ButtonStyle	 update_exe	= new ButtonStyle(190, 370, 70, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
	public static ButtonStyle	 update_jar	= new ButtonStyle(190, 370, 150, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
	public static ButtonStyle    update_no	= new ButtonStyle(515, 370, 150, 40, "font", "button", 16F, Color.RED, true, Align.CENTER);
	
	//public static ComboboxStyle	 servers	= new ComboboxStyle(215, 480, 195, 24, "font", "combobox", 14F, Color.WHITE, true, Align.CENTER);
	//public static ServerbarStyle serverbar	= new ServerbarStyle(420, 485, 380, 16, "font", 16F, Color.WHITE, true);
	
	public static ComboboxStyle	 servers	= new ComboboxStyle(40, 470, 195, 24, "font", "combobox", 14F, Color.DARK_GRAY, true, Align.CENTER);
	public static ServerbarStyle serverbar	= new ServerbarStyle(245, 480, 380, 16, "font", 16F, Color.DARK_GRAY, true);
	
	public static float fontbasesize		= 16F;
	public static float fonttitlesize		= 20F;
}