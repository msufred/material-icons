package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CheckBoxIcon extends SVGIcon {

    public CheckBoxIcon() {
        super();
    }

    public CheckBoxIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m419 735 289-290-43-43-246 247-119-119-43 43 162 162ZM180 936q-24 0-42-18t-18-42V276q0-24 " +
                "18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "check-box-icon";
    }
}
