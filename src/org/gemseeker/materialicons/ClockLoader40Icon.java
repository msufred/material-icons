package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ClockLoader40Icon extends SVGIcon {

    public ClockLoader40Icon() {
        super();
    }

    public ClockLoader40Icon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-83 0-156-31.5T197 859q-54-54-85.5-127T80 576q0-83 31.5-156T197 293q54-54 " +
                "127-85.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 83-31.5 156T763 859q-54 54-127 " +
                "85.5T480 976Zm0-60q68 0 130.62-25.806Q673.239 864.387 721 816L480 576V236q-142 0-241 98.812Q140 " +
                "433.625 140 576t98.812 241.188Q337.625 916 480 916Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "clock-loader-40-icon";
    }
}
