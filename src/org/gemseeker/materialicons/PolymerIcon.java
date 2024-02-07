package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PolymerIcon extends SVGIcon {

    public PolymerIcon() {
        super(DEFAULT_SIZE * 1.2, DEFAULT_SIZE * 0.8);
    }

    public PolymerIcon(double size) {
        super(size * 1.2, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 4h-4L7.11 16.63L4.5 12L9 4H5L.5 12L5 20h4l7.89-12.63L19.5 12L15 20h4l4.5-8z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "polymer-icon";
    }
}
