package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class UnfoldMoreDoubleIcon extends SVGIcon {

    public UnfoldMoreDoubleIcon() {
        super(DEFAULT_SIZE * 0.5, DEFAULT_SIZE * 1.25);
    }

    public UnfoldMoreDoubleIcon(double size) {
        super(size * 0.5, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 1056 312 887l42-42 127 126 127-127 42 42-170 170Zm0-200L312 687l42-42 127 126 127-127 42 " +
                "42-170 170ZM354 508l-43-42 170-170 169 169-43 43-127-126-126 126Zm0-200-43-42L481 96l169 169-43 43-127-126-126 126Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "unfold-more-double-icon";
    }
}
