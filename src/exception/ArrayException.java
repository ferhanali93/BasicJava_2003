package exception;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class ArrayException {
    public static void main(String[] args) {

        try {
            int[] myIntArray = {1, 2, 3, 4};
            System.out.println(myIntArray[10]); // I want to print an element at index 10, do we have 10th index?
        }
        catch (ArrayIndexOutOfBoundsException arrayException){
            System.out.println("Opps! Something went wrong: " + arrayException + " index");
        }
        finally {
            System.out.println("we don't have index 10, i.e. index[0]=1, index[1]=1, index[2]=3, index[3]=4");
        }

    }
}