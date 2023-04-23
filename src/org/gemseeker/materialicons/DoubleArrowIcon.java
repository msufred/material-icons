package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DoubleArrowIcon extends SVGIcon {

    public DoubleArrowIcon() {
        super(DEFAULT_SIZE * 0.875, DEFAULT_SIZE);
    }

    public DoubleArrowIcon(double size) {
        super(size * 0.875, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m242 856 210-280-210-280h74l210 280-210 280h-74Zm252 0 210-280-210-280h74l210 280-210 280h-74Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "double-arrow-icon";
    }
}
