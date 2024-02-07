package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LabelIcon extends SVGIcon {

    public LabelIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.7);
    }

    public LabelIcon(double size) {
        super(size, size * 0.7);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17.63 5.84C17.27 5.33 16.67 5 16 5L5 5.01C3.9 5.01 3 5.9 3 7v10c0 1.1.9 1.99 " +
                "2 1.99L16 19c.67 0 1.27-.33 1.63-.84L22 12z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "label-icon";
    }
}
