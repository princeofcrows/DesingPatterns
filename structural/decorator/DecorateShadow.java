package structural.decorator;

public class DecorateShadow implements Material {
    private final Material material;

    public DecorateShadow(Material material) {
        this.material = material;
    }

    @Override
    public void render() {
        material.render();
        System.out.println("Adding shadow...");
    }
}
