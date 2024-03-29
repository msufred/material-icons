package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AppShortcutIcon extends SVGIcon {

    public AppShortcutIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public AppShortcutIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M17 18H7V6h10v1h2V3c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 " +
                "2-.9 2-2v-4h-2zm3.38-8.38L21 11l.62-1.38L23 9l-1.38-.62L21 7l-.62 1.38L19 9z");
        SVGPath p2 = new SVGPath();
        p2.setContent("m16 8l-1.25 2.75L12 12l2.75 1.25L16 16l1.25-2.75L20 12l-2.75-1.25zm5 5l-.62 1." +
                "38L19 15l1.38.62L21 17l.62-1.38L23 15l-1.38-.62z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "app-shortcut-icon";
    }
}
