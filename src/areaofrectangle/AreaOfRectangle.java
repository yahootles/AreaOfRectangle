/*
 * Andrew Thompson
 * September 18, 2018
 * This program calculatesthe area of a rectangle
 */

package areaofrectangle;

/**
 *
 * @author antho6229
 */
public class AreaOfRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 5.7;
        double width = 4.8;
        //calculate area
        double area = length*width;
        System.out.println("The length is " + length +" units.\nThe width is " + width + " units.\nThe area is " + area + " units squared.");
    }
    
}
