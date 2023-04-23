package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ClockLoader20Icon extends SVGIcon {

    public ClockLoader20Icon() {
        super();
    }

    public ClockLoader20Icon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-83 0-156-31.5T197 859q-54-54-85.5-127T80 576q0-83 31.5-156T197 293q54-54 " +
                "127-85.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 83-31.5 156T763 859q-54 54-127 " +
                "85.5T480 976Zm0-60q142.375 0 241.188-98.812Q820 718.375 820 576H480.264V236Q338 236 239 334.812 " +
                "140 433.625 140 576t98.812 241.188Q337.625 916 480 916Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "clock-loader-20-icon";
    }
}
