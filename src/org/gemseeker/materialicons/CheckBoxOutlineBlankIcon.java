package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CheckBoxOutlineBlankIcon extends SVGIcon {

    public CheckBoxOutlineBlankIcon() {
        super();
    }

    public CheckBoxOutlineBlankIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-24 0-42-18t-18-42V276q0-24 18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 " +
                "18H180Zm0-60h600V276H180v600Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "check-box-outline-blank-icon";
    }
}
