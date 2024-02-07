package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HourglassDisabledIcon extends SVGIcon {

    public HourglassDisabledIcon() {
        super();
    }

    public HourglassDisabledIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M8 4h8v3.5l-2.84 2.84l1.25 1.25L18 8.01L17.99 8H18V2H6v1.17l2 2zM2.1 2.1L.69 3.51l8.9 " +
                "8.9L6 16l.01.01H6V22h12v-1.17l2.49 2.49l1.41-1.41zM16 20H8v-3.5l2.84-2.84L16 18.83z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "hourglass-disabled-icon";
    }
}
