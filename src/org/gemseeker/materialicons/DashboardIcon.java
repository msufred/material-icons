package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DashboardIcon extends SVGIcon {

    public DashboardIcon() {
        super();
    }

    public DashboardIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 13h8V3H3zm0 8h8v-6H3zm10 0h8V11h-8zm0-18v6h8V3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "dashboard-icon";
    }
}
