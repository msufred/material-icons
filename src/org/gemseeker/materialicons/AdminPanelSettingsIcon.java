package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AdminPanelSettingsIcon extends SVGIcon {

    public AdminPanelSettingsIcon() {
        super();
    }

    public AdminPanelSettingsIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M17 11c.34 0 .67.04 1 .09V6.27L10.5 3L3 6.27v4.91c0 4.54 3.2 8.79 7.5 9.82c.55-.13 " +
                "1.08-.32 1.6-.55c-.69-.98-1.1-2.17-1.1-3.45c0-3.31 2.69-6 6-6");
        SVGPath p2 = new SVGPath();
        p2.setContent("M17 13c-2.21 0-4 1.79-4 4s1.79 4 4 4s4-1.79 4-4s-1.79-4-4-4m0 1.38c.62 0 1.12.51 1" +
                ".12 1.12s-.51 1.12-1.12 1.12s-1.12-.51-1.12-1.12s.5-1.12 1.12-1.12m0 5.37c-.93 0-1.74-.4" +
                "6-2.24-1.17c.05-.72 1.51-1.08 2.24-1.08s2.19.36 2.24 1.08c-.5.71-1.31 1.17-2.24 1.17");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "admin-panel-settings-icon";
    }
}
