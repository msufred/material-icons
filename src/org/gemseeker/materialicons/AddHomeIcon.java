package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AddHomeIcon extends SVGIcon {

    public AddHomeIcon() {
        super();
    }

    public AddHomeIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M18 11c.7 0 1.37.1 2 .29V9l-8-6l-8 6v12h7.68A6.995 6.995 0 0 1 18 11");
        SVGPath p2 = new SVGPath();
        p2.setContent("M18 13c-2.76 0-5 2.24-5 5s2.24 5 5 5s5-2.24 5-5s-2.24-5-5-5m3 5.5h-2.5V21h-1v-2.5H15v-1h2.5V15h1v2.5H21z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "add-home-icon";
    }
}
