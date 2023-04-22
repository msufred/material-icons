package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RefreshIcon extends SVGIcon {

    public RefreshIcon() {
        super();
    }

    public RefreshIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 896q-133 0-226.5-93.5T160 576q0-133 93.5-226.5T480 256q85 0 149 34.5T740 " +
                "385V256h60v254H546v-60h168q-38-60-97-97t-137-37q-109 0-184.5 75.5T220 576q0 109 75.5 184.5T480 " +
                "836q83 0 152-47.5T728 663h62q-29 105-115 169t-195 64Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "refresh-icon";
    }
}
