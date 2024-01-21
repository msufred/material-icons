package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ClockLoader80Icon extends SVGIcon {

    public ClockLoader80Icon() {
        super();
    }

    public ClockLoader80Icon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-83 0-156-31.5T197 859q-54-54-85.5-127T80 576q0-83 31.5-156T197 293q54-54 127-85.5T480 " +
                "176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 83-31.5 156T763 859q-54 54-127 85.5T480 976ZM140 " +
                "576h340V236q-142 0-241 98.812Q140 433.625 140 576Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "clock-loader-80-icon";
    }
}
