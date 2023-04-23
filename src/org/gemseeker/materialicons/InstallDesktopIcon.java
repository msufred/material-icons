package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class InstallDesktopIcon extends SVGIcon {

    public InstallDesktopIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public InstallDesktopIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M330 936v-80H140q-24 0-42-18t-18-42V276q0-24 18-42t42-18h360v60H140v520h680V656h60v140q0 24-18 " +
                "42t-42 18H630v80H330Zm350-294L494 456l42-42 114 114V216h60v312l114-114 42 42-186 186Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "install-desktop-icon";
    }
}
