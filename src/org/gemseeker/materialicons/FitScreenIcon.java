package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FitScreenIcon extends SVGIcon {

    public FitScreenIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public FitScreenIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17 4h3c1.1 0 2 .9 2 2v2h-2V6h-3zM4 8V6h3V4H4c-1.1 0-2 .9-2 2v2zm16 " +
                "8v2h-3v2h3c1.1 0 2-.9 2-2v-2zM7 18H4v-2H2v2c0 1.1.9 2 2 2h3zM18 8H6v8h12z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "fit-screen-icon";
    }
}
