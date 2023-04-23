package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ClockLoader90Icon extends SVGIcon {

    public ClockLoader90Icon() {
        super();
    }

    public ClockLoader90Icon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-83 0-156-31.5T197 859q-54-54-85.5-127T80 576q0-83 31.5-156T197 293q54-54 " +
                "127-85.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 83-31.5 156T763 859q-54 54-127 " +
                "85.5T480 976ZM240 335l240 241V236q-67.665 0-130.044 25.548Q287.577 287.097 240 335Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "clock-loader-90-icon";
    }
}
