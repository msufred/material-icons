package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyboardDoubleArrowRightIcon extends SVGIcon {

    public KeyboardDoubleArrowRightIcon() {
        super(DEFAULT_SIZE * 0.9);
    }

    public KeyboardDoubleArrowRightIcon(double size) {
        super(size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m255 815-42-42 198-198-198-198 42-42 240 240-240 240Zm253 0-42-42 198-198-198-198 42-42 " +
                "240 240-240 240Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "keyboard-double-arrow-right-icon";
    }
}
