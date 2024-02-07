package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FlightTakeOffIcon extends SVGIcon {

    public FlightTakeOffIcon() {
        super();
    }

    public FlightTakeOffIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M2.5 19h19v2h-19zm19.57-9.36c-.21-.8-1.04-1.28-1.84-1.06L14.92 10l-6.9-6.43l-1.93.51l4.14 " +
                "7.17l-4.97 1.33l-1.97-1.54l-1.45.39l2.59 4.49s7.12-1.9 16.57-4.43c.81-.23 1.28-1.05 1.07-1.85");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "flight-take-off-icon";
    }
}
