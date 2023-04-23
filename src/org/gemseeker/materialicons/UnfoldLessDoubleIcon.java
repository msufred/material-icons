package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class UnfoldLessDoubleIcon extends SVGIcon {

    public UnfoldLessDoubleIcon() {
        super(DEFAULT_SIZE * 0.5, DEFAULT_SIZE * 1.25);
    }

    public UnfoldLessDoubleIcon(double size) {
        super(size * 0.5, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m354 1055-42-42 168-169 170 170-42 42-127-127-127 126Zm0-200-42-42 168-169 170 170-42 " +
                "42-127-127-127 126Zm127-347L311 338l43-42 126 126 127-126 43 43-169 169Zm0-200L311 138l43-42 126 " +
                "126L607 96l43 43-169 169Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "unfold-less-double-icon";
    }
}
