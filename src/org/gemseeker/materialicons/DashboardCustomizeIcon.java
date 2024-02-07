package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DashboardCustomizeIcon extends SVGIcon {

    public DashboardCustomizeIcon() {
        super();
    }

    public DashboardCustomizeIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 3h8v8H3zm10 0h8v8h-8zM3 13h8v8H3zm15 0h-2v3h-3v2h3v3h2v-3h3v-2h-3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "dashboard-customize-icon";
    }
}
