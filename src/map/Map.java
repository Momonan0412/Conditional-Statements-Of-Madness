package map;

import java.util.ArrayList;

public class Map<K,V> {
    ArrayList<K> keyList;
    ArrayList<V> valueList;
    public Map(){
        keyList = new ArrayList<>();
        valueList = new ArrayList<>();
    }
    public void put(K key, V value){
        int index = keyList.indexOf(key);
        if (index == -1) {
            keyList.add(key);
            valueList.add(value);
        } else {
            valueList.set(index, value);
        }
    }
    public V get(K key) {
        int index = keyList.indexOf(key);
        if (index != -1) {
            return valueList.get(index);
        }
        throw new KeyNotFoundException("Key '" + key + "' not found.");
    }
    public V remove(K key) {
        int index = keyList.indexOf(key);
        if (index != -1) {
            keyList.remove(index);
            return valueList.remove(index);
        }
        throw new KeyNotFoundException("Key '" + key + "' not found for removal.");
    }
}
