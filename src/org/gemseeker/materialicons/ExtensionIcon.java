package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ExtensionIcon extends SVGIcon {

    public ExtensionIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE);
    }

    public ExtensionIcon(double size) {
        super(size, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20.5 11H19V7c0-1.1-.9-2-2-2h-4V3.5a2.5 2.5 0 0 0-5 0V5H4c-1.1 " +
                "0-1.99.9-1.99 2v3.8H3.5c1.49 0 2.7 1.21 2.7 2.7s-1.21 2.7-2.7 2.7H2V20c0 " +
                "1.1.9 2 2 2h3.8v-1.5c0-1.49 1.21-2.7 2.7-2.7c1.49 0 2.7 1.21 2.7 2.7V22H1" +
                "7c1.1 0 2-.9 2-2v-4h1.5a2.5 2.5 0 0 0 0-5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "extension-icon";
    }
}
