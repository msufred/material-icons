package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class IndeterminateCheckBoxIcon extends SVGIcon {

    public IndeterminateCheckBoxIcon() {
        super();
    }

    public IndeterminateCheckBoxIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M250 604h461v-60H250v60Zm-70 332q-24 0-42-18t-18-42V276q0-24 18-42t42-18h600q24 0 " +
                "42 18t18 42v600q0 24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "indeterminate-check-box-icon";
    }
}
