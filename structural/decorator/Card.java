package structural.decorator;

public class Card implements Material{
    @Override
    public void render() {
        System.out.println("Rendering a Card");
    }
}
