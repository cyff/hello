package mapcache;

import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap   extends  hashmap   implements Serializable
public class FIFOCache<K,V> extends LinkedHashMap<K,V> {


    private static final long serialVersionUID = -690403385228515860L;
    private int SIZE;

    public FIFOCache(int size){
        super();
        this.SIZE = size;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {

        return  size() > SIZE;   //size() 返回map中元素的量

    }


}
