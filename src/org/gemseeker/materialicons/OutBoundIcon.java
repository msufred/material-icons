package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OutBoundIcon extends SVGIcon {

    public OutBoundIcon() {
        super();
    }

    public OutBoundIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m1.88 9.54L8.92 " +
                "16.5l-1.41-1.41l4.96-4.96L10.34 8l5.65.01l.01 5.65z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "out-bound-icon";
    }
}
