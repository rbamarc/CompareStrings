
package netbeans.comparestrings;

/**
 *
 * @author halfrikan
 */
public class CompareStrings {

    public static void main(String[] args) {
        
        //defining variables to be used in the problem
        String stringOne = "apples";
        String stringTwo = "bananas";
        String stringThree = "grapes";
        
        int result = 0;
        
        //using the .compareTo() method to compare strings and show results
        result = stringOne.compareTo(stringTwo);
        
        if (result == 0) {
            System.out.println(stringOne + " equals " + stringTwo);
        }  else if (result < 0){
            System.out.println(stringOne + " is less than (before) " + stringTwo);
        } else {
            System.out.println(stringOne + " is greater than (after) " + stringTwo);
        }
        
        result = stringThree.compareTo(stringTwo);
        if (result == 0) {
            System.out.println(stringThree + " equals " + stringTwo);
        } else if (result < 0) {
            System.out.println(stringThree + " is less than (before) " + stringTwo);
        } else {
            System.out.println(stringThree + " is greater than (after) " + stringTwo);
        }
        
        /*
        its worth noting what greater than and less than mean. strings are sorted 
        by their charaters. Numbers come first, followed by upper case then lower
        case letters. This means "a" is less than "b" and that 1 is less than
        "z". Also means that string "Abc" comes before (less than) "abc"
        
        */
    }
}
