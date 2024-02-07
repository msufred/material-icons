package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DensityMediumIcon extends SVGIcon {

    public DensityMediumIcon() {
        super(DEFAULT_SIZE);
    }

    public DensityMediumIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 3h18v2H3zm0 16h18v2H3zm0-8h18v2H3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "density-medium-icon";
    }
}
