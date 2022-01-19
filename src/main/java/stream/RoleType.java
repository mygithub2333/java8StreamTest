package stream;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * @author fwx
 * @date 2022/1/19
 */
public class RoleType {
    private Map<Integer, Function<Integer,String>> map = new ConcurrentHashMap<>();

    public Map<Integer, Function<Integer, String>> getMap() {
        return map;
    }

    {
        map.put(0, this::ganYu);
        map.put(1, this::keQing);
        map.put(2, this::youLa);
        map.put(3, this::ningGuang);
        map.put(4, this::leiSheng);
        map.put(5, this::luoShaLiYa);
    }
    public String ganYu(Integer code){
        return "获得甘雨";
    }

    public String keQing(Integer code){
        return "获得刻晴";
    }

    public String youLa(Integer code){
        return "获得尤拉";
    }

    public String ningGuang(Integer code){
        return "获得凝光";
    }

    public String leiSheng(Integer code){
        return "获得雷神";
    }

    public String luoShaLiYa(Integer code){
        return "获得罗莎莉亚";
    }
}
