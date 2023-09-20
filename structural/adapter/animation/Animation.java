package structural.adapter.animation;

import structural.adapter.Canvas;

public class Animation {
    public void init() {
        System.out.println("Initiating animation");
    }
    public void render(Canvas canvas) {
        canvas.draw();
        System.out.println("Pixar: Rendering animation...");
    }
}
