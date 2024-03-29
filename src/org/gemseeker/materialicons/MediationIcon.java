package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class MediationIcon extends SVGIcon {

    public MediationIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public MediationIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m22 12l-4 4l-1.41-1.41L18.17 13h-5.23A8.974 8.974 0 0 1 8 20.05A3.005 " +
                "3.005 0 0 1 5 23c-1.66 0-3-1.34-3-3s1.34-3 3-3c.95 0 1.78.45 2.33 1.14A6.969 6" +
                ".969 0 0 0 10.91 13h-3.1C7.4 14.16 6.3 15 5 15c-1.66 0-3-1.34-3-3s1.34-3 3-3c1" +
                ".3 0 2.4.84 2.82 2h3.1c-.32-2.23-1.69-4.1-3.59-5.14C6.78 6.55 5.95 7 5 7C3.34 " +
                "7 2 5.66 2 4s1.34-3 3-3a2.99 2.99 0 0 1 2.99 2.95A8.974 8.974 0 0 1 12.93 11h5" +
                ".23l-1.58-1.59L18 8z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "mediation-icon";
    }
}
