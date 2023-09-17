package behavioral.strategy;

public class Trimmer implements FormatterStrategy{
    @Override
    public String apply(String text) {
        return text.trim();
    }
}
