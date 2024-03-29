package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OnDeviceTrainingIcon extends SVGIcon {

    public OnDeviceTrainingIcon() {
        super(DEFAULT_SIZE * 0.7, DEFAULT_SIZE);
    }

    public OnDeviceTrainingIcon(double size) {
        super(size * 0.7, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M11 16h2v1h-2zm1-5c-1.1 0-2 .9-2 2c0 .74.4 1.38 1 1.72v.78h2v-" +
                ".78c.6-.35 1-.98 1-1.72c0-1.1-.9-2-2-2");
        SVGPath p2 = new SVGPath();
        p2.setContent("M18 1.01L6 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-" +
                "2V3c0-1.1-.9-1.99-2-1.99M18 18H6V6h12z");
        SVGPath p3 = new SVGPath();
        p3.setContent("M16.01 15.95c.62-.83.99-1.84.99-2.95s-.37-2.12-.99-2.95l-1.07 " +
                "1.07c.35.54.56 1.19.56 1.88s-.21 1.34-.56 1.88zm-6.95-1.07c-.35-.54-" +
                ".56-1.19-.56-1.88c0-1.93 1.57-3.5 3.5-3.5v1.25l2.25-2l-2.25-2V8c-2.7" +
                "6 0-5 2.24-5 5c0 1.11.37 2.12.99 2.95z");
        return Shape.union(p1, Shape.union(p2, p3));
    }

    @Override
    protected String getIconStyleClass() {
        return "one-device-training-icon";
    }
}
