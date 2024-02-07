package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CameraEnhanceIcon extends SVGIcon {

    public CameraEnhanceIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public CameraEnhanceIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M9 3L7.17 5H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 " +
                "2-2V7c0-1.1-.9-2-2-2h-3.17L15 3zm3 15c-2.76 0-5-2.24-5-5s2.24-5 5-5s5 " +
                "2.24 5 5s-2.24 5-5 5");
        SVGPath p2 = new SVGPath();
        p2.setContent("m12 17l1.25-2.75L16 13l-2.75-1.25L12 9l-1.25 2.75L8 13l2.75 1.25z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "camera-enhance-icon";
    }
}
