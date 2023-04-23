package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyboardDoubleArrowLeftIcon extends SVGIcon {

    public KeyboardDoubleArrowLeftIcon() {
        super(DEFAULT_SIZE * 0.9);
    }

    public KeyboardDoubleArrowLeftIcon(double size) {
        super(size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M453 815 213 575l240-240 42 42-198 198 198 198-42 42Zm253 0L466 575l240-240 42 42-198 198 198 198-42 42Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "keyboard-double-arrow-left-icon";
    }
}
