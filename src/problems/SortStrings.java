package problems;
import java.util.Arrays;
public class SortStrings {
    public static void main(String[] args) {
        String[] array = {"Jan", "Mar", "Feb", "apr", "May", "June", "July"};
        showList(array, "Array to be sorted");

        Arrays.sort(array);
        showList(array, "sort()");

        Arrays.sort(array, 0,2);
        showList(array, "Sort a range of indexes");

        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
        showList(array, "Sort in case insensitive order");

    }

    public static void showList(String[] array, String methodDescription){
        System.out.println("Sorted using "+methodDescription );
        for(String str : array){
            System.out.println(str);
        }
    }
}
