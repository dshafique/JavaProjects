/************************************************************************
* Name: Daoud Amjed Shafique                                    CSC 156
* Date: 03/08/2016                                              Lab 4   
*************************************************************************
* Statement: Access content pane to create a visible window
* Specifications:JFrame prameters to determine window
* Input  - none
* 
* Output - displayed window with 300x400 pixels
* output - JLabels to identfy JTextField I/O opportunities                       
************************************************************************/
import javax.swing.*;
import java.awt.*;

public class PropertyTax4 extends JFrame
{
    
    private static final int WIDTH = 500, HEIGHT = 300;
    public PropertyTax4()
    {

    
   
        
        JLabel assessL = new JLabel ("Assesssment Home Value", SwingConstants.RIGHT);
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

        
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(7,2));

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

	
	setTitle("Calculation of Property Taxes");
	setSize(WIDTH, HEIGHT);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
	
	PropertyTax4 proptax = new PropertyTax4();
    }

}
