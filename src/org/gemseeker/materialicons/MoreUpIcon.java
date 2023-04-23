package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MoreUpIcon extends SVGIcon {

    public MoreUpIcon() {
        super();
    }

    public MoreUpIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M700 736V356H320v-60h440v440h-60ZM500 936V556H120v-60h440v440h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "more-up-icon";
    }
}
