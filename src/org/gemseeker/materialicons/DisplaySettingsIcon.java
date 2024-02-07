package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DisplaySettingsIcon extends SVGIcon {

    public DisplaySettingsIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.875);
    }

    public DisplaySettingsIcon(double size) {
        super(size, size * 0.875);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M20 3H4c-1.11 0-2 .89-2 2v12a2 2 0 0 0 2 2h4v2h8v-2h4c1.1 0 2-.9 2-2V5a2 2 0 0 0-2-2m0 14H4V5h16z");
        SVGPath p2 = new SVGPath();
        p2.setContent("M6 8.25h8v1.5H6zm10.5 1.5H18v-1.5h-1.5V7H15v4h1.5zm-6.5 2.5h8v1.5h-8zM7.5 15H9v-4H7.5v1.25H6v1.5h1.5z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "display-settings-icon";
    }
}