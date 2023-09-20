package structural.decorator;

public class Test {
    public static void main(String[] args) {
        var cardWithShadowAndTooltip = new DecorateTooltip(
                new DecorateShadow(new Card()), "Hello decorator pattern!"
        );
        cardWithShadowAndTooltip.render();

        var textBoxWithShadow = new DecorateShadow(new TextBox());
        textBoxWithShadow.render();
    }
}