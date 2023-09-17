package behavioral.iterator;

public interface Container {
    Iterator getIterator();
    void add(String data) ;
    String remove() ;
}
