package behavioral.iterator;


public class StaticDataRepository implements Container {
    public static final int LIMIT = 10;
    private String[] dataCollection = new String[LIMIT];
    private int currentIndex = 0;

    @Override
    public void add(String data) {
        if(currentIndex >= LIMIT) throw new Error("Data limit crossed");

        dataCollection[currentIndex++] = data;
    }

    @Override
    public String remove()  {
        if(currentIndex == 0) throw new Error("Data collection empty");

        return dataCollection[--currentIndex];
    }
    @Override
    public Iterator getIterator() {
        return new StaticDataIterator(this);
    }


    public class StaticDataIterator implements Iterator {
        private int index = 0;
        private StaticDataRepository dataRepository;

        public StaticDataIterator(StaticDataRepository dataRepository) {
            this.dataRepository = dataRepository;
        }

        @Override
        public boolean hasNext() {
            return index < dataRepository.currentIndex;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Object current() {
            return dataRepository.dataCollection[index];
        }

        @Override
        public void root() {
            index = 0;
        }
    }

}
