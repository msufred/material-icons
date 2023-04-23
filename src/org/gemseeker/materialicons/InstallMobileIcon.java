package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class InstallMobileIcon extends SVGIcon {

    public InstallMobileIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.25);
    }

    public InstallMobileIcon(double size) {
        super(size, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M260 1016q-24 0-42-18t-18-42V196q0-24 18-42t42-18h320v150H260v580h440V736h60v220q0 24-18 " +
                "42t-42 18H260Zm474-374L548 456l42-42 114 113V226h60v301l114-113 42 42-186 186Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "install-mobile-icon";
    }
}
