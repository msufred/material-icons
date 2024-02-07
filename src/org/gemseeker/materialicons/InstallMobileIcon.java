package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class InstallMobileIcon extends SVGIcon {

    public InstallMobileIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public InstallMobileIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M17 18H7V6h7V1H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2v-5h-2z");
        SVGPath p2 = new SVGPath();
        p2.setContent("m18 14l5-5l-1.41-1.41L19 10.17V3h-2v7.17l-2.59-2.58L13 9z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "install-mobile-icon";
    }
}
