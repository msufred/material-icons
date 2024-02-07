package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OpacityIcon extends SVGIcon {

    public OpacityIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public OpacityIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17.66 8L12 2.35L6.34 8A8.02 8.02 0 0 0 4 13.64c0 2 .78 4.11 2.34 5.67a7.99 " +
                "7.99 0 0 0 11.32 0c1.56-1.56 2.34-3.67 2.34-5.67S19.22 9.56 17.66 8M6 14c.01-2 .62-3" +
                ".27 1.76-4.4L12 5.27l4.24 4.38C17.38 10.77 17.99 12 18 14z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "opacity-icon";
    }
}
