package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CheckCircleIcon extends SVGIcon {

    public CheckCircleIcon() {
        super();
    }

    public CheckCircleIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m-2 " +
                "15l-5-5l1.41-1.41L10 14.17l7.59-7.59L19 8z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "check-circle-icon";
    }
}
