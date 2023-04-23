package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DisabledByDefaultIcon extends SVGIcon {

    public DisabledByDefaultIcon() {
        super();
    }

    public DisabledByDefaultIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m336 762 144-144 144 144 42-42-144-144 144-144-42-42-144 144-144-144-42 42 144 144-144 144 42 " +
                "42ZM180 936q-24 0-42-18t-18-42V276q0-24 18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "disabled-by-default-icon";
    }
}
