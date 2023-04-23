package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DoNotDisturbOffIcon extends SVGIcon {

    public DoNotDisturbOffIcon() {
        super();
    }

    public DoNotDisturbOffIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m813 995-95-95q-50 36-110 56t-128 20q-85 0-158-30.5T195 861q-54-54-84.5-127T80 " +
                "576q0-68 20-128t56-110l-95-95 43-43 752 752-43 43ZM280 603h141l-60-60h-81v60Zm524 211L593 " +
                "603h87v-60H533L242 252q50-36 110-56t128-20q84 0 157 31t127 85q54 54 85 127t31 157q0 68-20 " +
                "128t-56 110Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "do-not-disturb-off-icon";
    }
}
