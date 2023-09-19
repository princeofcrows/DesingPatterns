package creational.abstractFactory.factory;

public class Client {
    public void render(DrawerFactory browser) {
        browser.createRectangleDrawer(6, 3).render();
        browser.createEllipsoidDrawer(7, 7).render();

        browser.createRectangleDrawer(6, 3).resize(2, 4);
        browser.createEllipsoidDrawer(7, 7).render();
    }
}
