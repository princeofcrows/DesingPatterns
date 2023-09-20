package structural.adapter.backgroundEffects;

import structural.adapter.Canvas;

public class BackgroundColor implements BackgroundEffect {

    @Override
    public void apply(Canvas canvas) {
        System.out.println("Custom Adding Color...");
    }
}
