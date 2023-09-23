package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private final List<String> pages = new ArrayList<>();

    public void addWordPage(String page) {
        pages.add(page);
    }

    public void export(Builder builder) {
        for(var page: pages)
            builder.buildPart(page);
    }
}
