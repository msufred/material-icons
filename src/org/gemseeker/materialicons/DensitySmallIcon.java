package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DensitySmallIcon extends SVGIcon {

    public DensitySmallIcon() {
        super(DEFAULT_SIZE);
    }

    public DensitySmallIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 2h18v2H3zm0 18h18v2H3zm0-6h18v2H3zm0-6h18v2H3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "density-small-icon";
    }
}
