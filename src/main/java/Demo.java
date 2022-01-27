import stream.RoleType;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;

/**
 * @author fwx
 * @date 2022/1/19
 */
public class Demo {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int year = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int month = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        int day = scanner3.nextInt();
        LocalDate of = LocalDate.of(year, month, day);
        int value = of.getDayOfWeek().getValue();
        int dayOfMonth = of.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        int aa = dayOfMonth%7;
        HashMap<Object, Object> map = new HashMap<>();
        for (int i =0;i<7;i++){
            if (value==0){
                value=7;
            }
            if (i<aa){
                map.put(value,5);
            }else {
                map.put(value,4);
            }
            System.out.println(value);
            value = (value-1)%7;
            }
        System.out.println(map.toString());
    }

    private static void test() {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        String result = getResult(code);
        System.out.println(result);
        if ("none".equals(result)){
            return;
        }
        test();
    }

    public static String getResult(Integer code){
        Function<Integer, String> result = new RoleType().getMap().get(code);
        if (result!=null){
            return result.apply(code);
        }
        return "none";
    }
}
