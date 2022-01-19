import stream.RoleType;

import java.util.Scanner;
import java.util.function.Function;

/**
 * @author fwx
 * @date 2022/1/19
 */
public class Demo {

    public static void main(String[] args) {
          test();
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
