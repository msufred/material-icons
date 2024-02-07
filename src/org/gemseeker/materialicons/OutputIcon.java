package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OutputIcon extends SVGIcon {

    public OutputIcon() {
        super();
    }

    public OutputIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("m17 17l5-5l-5-5l-1.41 1.41L18.17 11H9v2h9.17l-2.58 2.59z");
        SVGPath p2 = new SVGPath();
        p2.setContent("M19 19H5V5h14v2h2V5a2 2 0 0 0-2-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14a2 2 0 0 0 2-2v-2h-2z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "output-icon";
    }
}
