package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataRepository implements Container {
    private final List<String> dataCollection = new ArrayList<>();
    @Override
    public Iterator getIterator() {
        return new DynamicDataIterator(this);
    }

    @Override
    public void add(String data) {
        dataCollection.add(data);
    }

    @Override
    public String remove() {
        int last = dataCollection.size() - 1;
        return dataCollection.remove(last);
    }

    public static class DynamicDataIterator implements Iterator {
        private int index = 0;
        private final DynamicDataRepository dataRepository;


        public DynamicDataIterator(DynamicDataRepository dataRepository) {
            this.dataRepository = dataRepository;
        }

        @Override
        public boolean hasNext() {
            return index < dataRepository.dataCollection.size();
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return dataRepository.dataCollection.get(index);
        }

        @Override
        public void root() {
            index = 0;
        }
    }
}
