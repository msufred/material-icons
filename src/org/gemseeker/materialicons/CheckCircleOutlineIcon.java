package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CheckCircleOutlineIcon extends SVGIcon {

    public CheckCircleOutlineIcon() {
        super();
    }

    public CheckCircleOutlineIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M16.59 7.58L10 14.17l-3.59-3.58L5 12l5 5l8-8zM12 2C6.48 2 2 6.48 2 12s4.48 10 10 " +
                "10s10-4.48 10-10S17.52 2 12 2m0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8s8 3.58 8 8s-3.58 8-8 8");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "check-circle-outline-icon";
    }
}
