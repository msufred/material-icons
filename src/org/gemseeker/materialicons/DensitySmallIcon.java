package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DensitySmallIcon extends SVGIcon {

    public DensitySmallIcon() {
        super(DEFAULT_SIZE);
    }

    public DensitySmallIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 976v-60h720v60H120Zm0-247v-60h720v60H120Zm0-246v-60h720v60H120Zm0-247v-60h720v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "density-small-icon";
    }
}
