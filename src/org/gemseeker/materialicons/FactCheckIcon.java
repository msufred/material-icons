package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FactCheckIcon extends SVGIcon {

    public FactCheckIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public FactCheckIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 3H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2M10 " +
                "17H5v-2h5zm0-4H5v-2h5zm0-4H5V7h5zm4.82 6L12 12.16l1.41-1.41l1.41 1.42L17.99 9l1.42 1.42z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "fact-check-icon";
    }
}
