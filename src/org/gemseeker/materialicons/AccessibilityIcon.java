package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AccessibilityIcon extends SVGIcon {

    public AccessibilityIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public AccessibilityIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2c1.1 0 2 .9 2 2s-.9 2-2 2s-2-.9-2-2s.9-2 2-2m9 7h-6v13h-2v-6h-2v6H9V9H3V7h18z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "accessibility-icon";
    }
}
