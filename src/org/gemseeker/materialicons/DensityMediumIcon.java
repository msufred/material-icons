package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DensityMediumIcon extends SVGIcon {

    public DensityMediumIcon() {
        super(DEFAULT_SIZE);
    }

    public DensityMediumIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 936v-60h720v60H120Zm0-330v-60h720v60H120Zm0-330v-60h720v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "density-medium-icon";
    }
}
