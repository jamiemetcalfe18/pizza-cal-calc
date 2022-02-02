import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PizzaLove2 extends Applet implements ActionListener
{

	Image cartoonpizza2;
	int pizza, gbread, hwings, soda, cbread, pizza1, gbread1, hwings1, soda1, cbread1, ans;


	Label companyLabel = new Label("Calorie count for item per serving");
	Label pizzaLabel = new Label ("Enter pizza servings per slice");
		TextField pizzaField = new TextField(10);
	Label gbreadLabel = new Label("Enter garlic bread servings per slice");
		TextField gbreadField = new TextField(10);
	Label hwingsLabel = new Label("Enter hot wings servings per wing");
		TextField hwingsField = new TextField(10);
	Label sodaLabel = new Label("Enter soda servings per ounce");
		TextField sodaField = new TextField(10);
	Label cbreadLabel = new Label("Enter cheesy bread servings per slice");
		TextField cbreadField = new TextField(10);
	Button calcButton = new Button("Calculate");
	Label outputLabel = new Label("Click the Calculate button to calculate total calories consumed.");


public void init()
	{
		setBackground(Color.red);
		setForeground(Color.black);
		add(companyLabel);
		add(pizzaLabel);
		add(pizzaField);
		add(gbreadLabel);
		add(gbreadField);
		add(hwingsLabel);
		add(hwingsField);
		add(sodaLabel);
		add(sodaField);
		add(cbreadLabel);
		add(cbreadField);
		add(calcButton);
		calcButton.addActionListener(this);
		add(outputLabel);
		cartoonpizza2 = getImage(getDocumentBase(), "cartoon-pizza2.png");
}

	 public  void actionPerformed(ActionEvent e)
	          {

	                 pizza = Integer.parseInt(pizzaField.getText());
	                 gbread = Integer.parseInt(gbreadField.getText());
	                 hwings = Integer.parseInt(hwingsField.getText());
	                 soda = Integer.parseInt(sodaField.getText());
	                 cbread = Integer.parseInt(cbreadField.getText());
	                 pizza1 =  pizza * 300;
	                 gbread1 = gbread * 200;
	                 hwings1 = hwings * 300;
	                 soda1 = soda * 15;
	                 cbread1 = cbread * 400;

	                 ans = pizza1 + gbread1 + hwings1 + soda1 + cbread;
	                 outputLabel.setText("Your total calorie count is " + ans + ".");
           }
        public void paint(Graphics g)
	              {
	                    g.drawImage(cartoonpizza2,125,160,this);
           }
	   }