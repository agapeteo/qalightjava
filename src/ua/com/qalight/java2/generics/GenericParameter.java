package ua.com.qalight.java2.generics;

/**
 * Created by emix on 5/10/14.
 */
public class GenericParameter<K, V> {
    private K key;
    private V value;

    public  GenericParameter(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericParameter{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
