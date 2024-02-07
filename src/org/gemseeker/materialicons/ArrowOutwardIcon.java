package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ArrowOutwardIcon extends SVGIcon {

    public ArrowOutwardIcon() {
        super();
    }

    public ArrowOutwardIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M6 6v2h8.59L5 17.59L6.41 19L16 9.41V18h2V6z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-outward-icon";
    }
}
