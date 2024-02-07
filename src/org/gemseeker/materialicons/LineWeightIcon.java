package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LineWeightIcon extends SVGIcon {

    public LineWeightIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public LineWeightIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 17h18v-2H3zm0 3h18v-1H3zm0-7h18v-3H3zm0-9v4h18V4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "line-weight-icon";
    }
}
