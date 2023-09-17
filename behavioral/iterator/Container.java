package behavioral.iterator;

public interface Container<T> {
    Iterator getIterator();
    void add(String data) ;
    T remove() ;
}
