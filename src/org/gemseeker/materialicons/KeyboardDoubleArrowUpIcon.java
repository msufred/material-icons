package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyboardDoubleArrowUpIcon extends SVGIcon {

    public KeyboardDoubleArrowUpIcon() {
        super(DEFAULT_SIZE * 0.9);
    }

    public KeyboardDoubleArrowUpIcon(double size) {
        super(size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m282 831-42-42 240-240 240 240-42 42-198-198-198 198Zm0-253-42-42 240-240 240 240-42 42-198-198-198 198Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "keyboard-double-arrow-up-icon";
    }
}
