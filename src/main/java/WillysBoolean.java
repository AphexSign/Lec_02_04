import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class WillysBoolean {
    private boolean value;
    private WillysBoolean(boolean value) {
        this.value = value;
    }


    private static Map<WillysBoolean, WillysBoolean> cache =
            new HashMap<WillysBoolean, WillysBoolean>();
    public static WillysBoolean valueOf(boolean value) {
        WillysBoolean tmp = new WillysBoolean(value);
        if (cache.containsKey(tmp))
            return cache.get(tmp);
        else {
            cache.put(tmp,tmp);
            return tmp;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WillysBoolean that = (WillysBoolean) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }









}