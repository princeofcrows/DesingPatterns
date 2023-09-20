package structural.adapter;

import structural.adapter.backgroundEffects.BackgroundAnimationAdapter;
import structural.adapter.backgroundEffects.BackgroundColor;

public class Test {
    public static void main(String[] args) {
        var client = new Client(new Canvas());

        client.apply(new BackgroundColor());
        client.apply(new BackgroundAnimationAdapter());
    }
}