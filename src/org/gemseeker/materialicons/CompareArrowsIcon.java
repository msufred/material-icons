package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CompareArrowsIcon extends SVGIcon {

    public CompareArrowsIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public CompareArrowsIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9.01 14H2v2h7.01v3L13 15l-3.99-4zm5.98-1v-3H22V8h-7.01V5L11 9z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "compare-arrows-icon";
    }
}
