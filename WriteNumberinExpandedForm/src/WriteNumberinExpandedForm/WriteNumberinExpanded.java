package WriteNumberinExpandedForm;

import java.util.LinkedList;
//wpisz liczbe
public class WriteNumberinExpanded {

    public static String expandedForm(int num) {
        LinkedList<String> expandedList = new LinkedList<>();
        int digit;
        int multiplier = 1;
        int to = 5674;
        while (num > 0) {
            digit = (num % 10) * multiplier;
            if (digit != 0) {
                expandedList.push(Integer.toString(digit));
            }
            num /= 10;
            multiplier *= 10;
        }
        System.out.println(to%10);
        System.out.println(String.join(" + ", expandedList));
        return String.join(" + ", expandedList);
    }
}

