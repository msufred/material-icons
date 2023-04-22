package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowBackIcon extends SVGIcon {

    public ArrowBackIcon() {
        super();
    }

    public ArrowBackIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 896 160 576l320-320 42 42-248 248h526v60H274l248 248-42 42Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-back-icon";
    }
}
