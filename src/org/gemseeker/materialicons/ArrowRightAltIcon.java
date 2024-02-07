package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ArrowRightAltIcon extends SVGIcon {

    public ArrowRightAltIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.5);
    }

    public ArrowRightAltIcon(double size) {
        super(size, size * 0.5);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M16.01 11H4v2h12.01v3L20 12l-3.99-4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-right-alt-icon";
    }
}
