/************************************************************************
* Name: Daoud Shafique                                          CSC 156
* Date: 04/10/2016                                              Lab 5   
*************************************************************************
* Statement: Access content pane to create a visible window
* Specifications:JFrame prameters to determine window
* Input  - none
* 
* Output - displayed window with 300x400 pixels
* output - JLabels to identfy JTextField I/O opportunities                       
************************************************************************/
// demonstrates use of swing class methods to access content pane
// declare swing class
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JApplet;

public class PropertyTax6 extends JApplet
{
    // set parameters to define extent of the window
    private static final int WIDTH = 500, HEIGHT = 300;
 
        JLabel  assessL = new JLabel ("Assesssment Home Value", SwingConstants.RIGHT);
        JLabel SchoolTaxRate= new JLabel ( "Decimal Value of School Tax Rate", SwingConstants.RIGHT);
        JLabel CountyTaxRate = new JLabel ( " Decimal Value of County Tax Rate", SwingConstants.RIGHT);
        JLabel SchoolTaxes = new JLabel ("School Taxes", SwingConstants.RIGHT);
        JLabel CountyTaxes = new JLabel ("County Taxes", SwingConstants.RIGHT);
        JLabel TotalTaxes = new JLabel ("Total Taxes", SwingConstants.RIGHT);

        JTextField assessTF = new JTextField(10);
	JTextField SchoolTaxRateTF = new JTextField(10); 
        JTextField CountyTaxRateTF = new JTextField(10);
        JTextField SchoolTaxesTF = new JTextField(10);
        JTextField CountyTaxesTF = new JTextField(10);
        JTextField TotalTaxesTF = new JTextField(10);

    JButton exit = new JButton("Exit");
    JButton calculate = new JButton("Calculate");  


    public PropertyTax6()
    {

 Container pane = getContentPane();
    pane.setLayout(new GridLayout(7,2));


	ExitHandler ebHandler = new ExitHandler();

	calculateHandler cbHandler = new  calculateHandler();

	pane.add(assessL);
        pane.add(assessTF);
        pane.add(SchoolTaxRate);
        pane.add(SchoolTaxRateTF);
        pane.add(CountyTaxRate);
        pane.add(CountyTaxRateTF);
        pane.add(SchoolTaxes);
        pane.add(SchoolTaxesTF);
        pane.add(CountyTaxes);
        pane.add(CountyTaxesTF);
        pane.add(TotalTaxes);
        pane.add(TotalTaxesTF);
        pane.add(calculate);
        pane.add(exit);

	// set title, size and visibility aspects of window
	

	exit.addActionListener(ebHandler);
        calculate.addActionListener(cbHandler);
    }

    public class ExitHandler implements ActionListener
    {
	public void actionPerformed(ActionEvent e)
	{
	    System.exit(0);
	}
    }
public class calculateHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
	Double SchoolTaxes = Double.parseDouble (SchoolTaxRateTF.getText());
	Double CountyTaxes = Double.parseDouble (CountyTaxRateTF.getText());
	Double TotalTaxes = Double.parseDouble (assessTF.getText());
	Double SchoolTaxesF = (SchoolTaxes/100)*(TotalTaxes);
	Double CountyTaxesF = (CountyTaxes/100)*(TotalTaxes);
	Double TotalTaxesF = (SchoolTaxesF+CountyTaxesF);

	SchoolTaxesTF.setText(""+ String.format("%.2f", SchoolTaxesF ));
	CountyTaxesTF.setText(""+ String.format("%.2f", CountyTaxesF));
	TotalTaxesTF.setText(""+ String.format("%.2f", TotalTaxesF));
    }
}

    public static void init(String[] args)
    {
	// main program to invoke constructor
	PropertyTax6 proptax = new PropertyTax6();

    }

}
