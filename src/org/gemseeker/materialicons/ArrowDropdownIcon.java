package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowDropDownIcon extends SVGIcon {

    public ArrowDropDownIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 0.45);
    }

    public ArrowDropDownIcon(double size) {
        super(size * 0.85, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 696 280 497h400L480 696Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-drop-down-icon";
    }
}
