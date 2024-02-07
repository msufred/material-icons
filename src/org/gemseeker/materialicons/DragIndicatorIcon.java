package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DragIndicatorIcon extends SVGIcon {

    public DragIndicatorIcon() {
        super(DEFAULT_SIZE * 0.65, DEFAULT_SIZE);
    }

    public DragIndicatorIcon(double size) {
        super(size * 0.65, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M11 18c0 1.1-.9 2-2 2s-2-.9-2-2s.9-2 2-2s2 .9 2 2m-2-8c-1.1 0-2 .9-2 2s.9 2 2 2s2-.9 " +
                "2-2s-.9-2-2-2m0-6c-1.1 0-2 .9-2 2s.9 2 2 2s2-.9 2-2s-.9-2-2-2m6 4c1.1 0 2-.9 2-2s-.9-2-2-2s-2" +
                " .9-2 2s.9 2 2 2m0 2c-1.1 0-2 .9-2 2s.9 2 2 2s2-.9 2-2s-.9-2-2-2m0 6c-1.1 0-2 .9-2 2s.9 2 2 2" +
                "s2-.9 2-2s-.9-2-2-2");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "drag-indicator-icon";
    }
}
