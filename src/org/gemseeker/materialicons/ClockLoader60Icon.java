package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ClockLoader60Icon extends SVGIcon {

    public ClockLoader60Icon() {
        super();
    }

    public ClockLoader60Icon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-83 0-156-31.5T197 859q-54-54-85.5-127T80 576q0-83 31.5-156T197 293q54-54 " +
                "127-85.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 83-31.5 156T763 859q-54 54-127 " +
                "85.5T480 976ZM240 816l240-240V236q-142 0-241 98.812Q140 433.625 140 576q0 68 26 130t74 110Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "clock-loader-60-icon";
    }
}
