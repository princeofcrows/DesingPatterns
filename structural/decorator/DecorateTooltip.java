package structural.decorator;

public class DecorateTooltip implements Material{
    private final Material  material;
    private final String tooltip;

    public DecorateTooltip(Material material, String tooltip) {
        this.material = material;
        this.tooltip = tooltip;
    }
    @Override
    public void render() {
        material.render();
        System.out.println("Adding tooltip: -> ");
        System.out.println(tooltip);
    }
}
