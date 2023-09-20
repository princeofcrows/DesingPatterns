package structural.adapter.backgroundEffects;

import structural.adapter.Canvas;
import structural.adapter.animation.Animation;

public class BackgroundAnimationAdapter implements BackgroundEffect {
    private final Animation animation = new Animation();

    @Override
    public void apply(Canvas canvas) {
        animation.init();
        animation.render(canvas);
    }
}
