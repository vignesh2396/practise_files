//activity 10

package module;

import java.util.*;
public class calender {
    public static void main(String[] args){

        Calendar cal = Calendar.getInstance();
        System.out.println("\n current date and time : " + cal.getTime());  // to get detail data and time

        int actualMinYear = cal.getActualMinimum(Calendar.YEAR);
        int actualMinMonth = cal.getActualMinimum(Calendar.MONTH);
        int actualMinWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int actualMinDate = cal.getActualMinimum(Calendar.DATE);

        System.out.println("acutalMinYear = " + actualMinYear);
        System.out.println("actualMinMonth = " + actualMinMonth);
        System.out.println("actualMinWeek = " + actualMinWeek);
        System.out.println("actualMinDate = " + actualMinDate);

        int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDate = cal.getActualMaximum(Calendar.DATE);

        System.out.println("acutalMaxYear = " + actualMaxYear);
        System.out.println("actualMaxMonth = " + actualMaxMonth);
        System.out.println("actualMaxWeek = " + actualMaxWeek);
        System.out.println("actualMaxDate = " + actualMaxDate);

    }
}
