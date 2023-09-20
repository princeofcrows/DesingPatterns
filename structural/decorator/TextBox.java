package structural.decorator;

public class TextBox implements Material {
    @Override
    public void render() {
        System.out.println("Rendering a Text Box");
    }
}
