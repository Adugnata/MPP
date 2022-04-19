package lesson11.execr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyPair<K,V> {
    private K key;
    private  V value;
    public KeyPair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }

    public static void main(String[] args) {
        KeyPair<Integer, List<String>> kv = new KeyPair<>(1, Arrays.asList("Tesfa","Michael"));
        kv.getValue().stream().forEach(System.out::println);
        List<Number> numbers = new ArrayList<>(Arrays.asList(1,2,3.3,5,9.9,99.1));
        numbers.stream().forEach(System.out::println);
    }
}
