package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class EmptyDashboardIcon extends SVGIcon {

    public EmptyDashboardIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public EmptyDashboardIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M220 836h240V656H220v180Zm0-220h240V316H220v300Zm280 220h240V536H500v300Zm0-340h240V316H500v180ZM180 " +
                "936q-24 0-42-18t-18-42V276q0-24 18-42t42-18h600q24 0 42 18t18 42v60h60v60h-60v150h60v60h-60v150h60v60h-60v60q0 " +
                "24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "empty-dashboard-icon";
    }
}
