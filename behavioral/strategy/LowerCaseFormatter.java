package behavioral.strategy;

public class LowerCaseFormatter implements FormatterStrategy {

    @Override
    public String apply(String text) {
        return text.toLowerCase();
    }
}
