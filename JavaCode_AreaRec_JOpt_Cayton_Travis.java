/*
Travis Cayton
Date created: 9/18/2025
--------------- Psuedocode------------------
Ask the user for either a rectangle or a circle
Ask user to input value
Calculate the area of the given shape
Display area
*/
import javax.swing.JOptionPane;
public class JavaCode_AreaRec_JOpt_Cayton_Travis {
    public static double length;
    public static double width;
    public static double radius;
    public static double area;

    public static void main(String[] args){
        String[] options = {"Rectangle", "Circle"};
        int choice = JOptionPane.showOptionDialog(
                null, 
                "Select an option to calculate the area:", 
                "Area Calculator", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, 
                options[0]
        );
    if (choice == 0) {
        getLength();
        getWidth();
        displayRectangleArea();
    }
    else if (choice == 1) {
        getRadius();
        displayCircleArea();
    }
}
    
    public static void getLength(){
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle:"));
    }

    public static void getWidth(){
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the rectangle:"));
    }

    public static void getRadius(){
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle:"));
    }

    public static void displayRectangleArea(){
        area = length * width;
        JOptionPane.showMessageDialog(null,"Area of rectangle is " + area);
    }

    public static void displayCircleArea(){
        area = Math.PI * radius * radius;
        JOptionPane.showMessageDialog(null,"Area of circle is " + area);
    }
}
