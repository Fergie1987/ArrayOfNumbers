/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofnumbers;

/**
 *
 * @author fergi
 */
public class ArrayOfNumbersApplication {

    public static void main(String[] args) {
        //ArrayOfNumbers a = new ArrayOfNumbers();
        // a.setItem();

        int[] newArray = {2, 3, 4, 5, 6};

        ArrayOfNumbers b = new ArrayOfNumbers(newArray);
        b.addConstant();

    }
}
