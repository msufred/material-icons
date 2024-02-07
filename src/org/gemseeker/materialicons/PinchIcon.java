package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PinchIcon extends SVGIcon {

    public PinchIcon() {
        super(DEFAULT_SIZE * 1.125);
    }

    public PinchIcon(double size) {
        super(size * 1.125);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M6 2.5V1h5v5H9.5V3.56L3.56 9.5H6V11H1V6h1.5v2.44L8.44 " +
                "2.5zm16.98 14.32l-.63 4.46c-.14.99-.99 1.72-1.98 1.72h-6.16c-." +
                "53 0-1.29-.21-1.66-.59L8 17.62l.83-.84c.24-.24.58-.35.92-.28l3" +
                ".25.74V6.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v6h.91c.31 0 .62" +
                ".07.89.21l4.09 2.04c.77.39 1.21 1.22 1.09 2.07");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "pinch-icon";
    }
}
