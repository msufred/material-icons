package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyboardDoubleArrowDownIcon extends SVGIcon {

    public KeyboardDoubleArrowDownIcon() {
        super(DEFAULT_SIZE * 0.9);
    }

    public KeyboardDoubleArrowDownIcon(double size) {
        super(size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 856 240 616l42-42 198 198 198-198 42 42-240 240Zm0-253L240 363l42-42 198 198 198-198 42 42-240 240Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "keyboard-double-arrow-down-icon";
    }
}
