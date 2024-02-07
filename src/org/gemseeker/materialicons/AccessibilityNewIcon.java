package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AccessibilityNewIcon extends SVGIcon {

    public AccessibilityNewIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public AccessibilityNewIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20.5 6c-2.61.7-5.67 1-8.5 1s-5.89-.3-8.5-1L3 8c1.86.5 4 .83 6 1v13h2v-6h2v6h2V9c2-.17 4.14-.5" +
                " 6-1zM12 6c1.1 0 2-.9 2-2s-.9-2-2-2s-2 .9-2 2s.9 2 2 2");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "accessibility-new-icon";
    }
}
