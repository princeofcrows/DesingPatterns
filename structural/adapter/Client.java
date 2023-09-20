package structural.adapter;

import structural.adapter.backgroundEffects.BackgroundEffect;

public class Client {
    private final Canvas canvas;

    public Client(Canvas canvas) {
        this.canvas = canvas;
    }

    public void apply(BackgroundEffect backgroundEffect) {
        backgroundEffect.apply(canvas);
    }
}
