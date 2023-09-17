package behavioral.strategy;

public class UpperCaseFormatter implements FormatterStrategy{
    @Override
    public String apply(String text) {
        return text.toUpperCase();
    }
}
