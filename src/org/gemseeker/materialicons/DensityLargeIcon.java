package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DensityLargeIcon extends SVGIcon {

    public DensityLargeIcon() {
        super(DEFAULT_SIZE);
    }

    public DensityLargeIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 936v-60h720v60H120Zm0-660v-60h720v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "density-large-icon";
    }
}
