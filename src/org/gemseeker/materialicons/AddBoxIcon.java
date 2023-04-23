package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AddBoxIcon extends SVGIcon {

    public AddBoxIcon() {
        super();
    }

    public AddBoxIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M450 776h60V606h170v-60H510V376h-60v170H280v60h170v170ZM180 936q-24 0-42-18t-18-42V276q0-24 " +
                "18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-box-icon";
    }
}
