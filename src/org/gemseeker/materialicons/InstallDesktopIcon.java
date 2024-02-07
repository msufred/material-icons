package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class InstallDesktopIcon extends SVGIcon {

    public InstallDesktopIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.875);
    }

    public InstallDesktopIcon(double size) {
        super(size, size * 0.875);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M20 17H4V5h8V3H4c-1.11 0-2 .89-2 2v12a2 2 0 0 0 2 2h4v2h8v-2h4c1.1 0 2-.9 2-2v-3h-2z");
        SVGPath p2 = new SVGPath();
        p2.setContent("m17 14l5-5l-1.41-1.41L18 10.17V3h-2v7.17l-2.59-2.58L12 9z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "install-desktop-icon";
    }
}
