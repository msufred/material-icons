package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FreeCancellationIcon extends SVGIcon {

    public FreeCancellationIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public FreeCancellationIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M11.21 20H5V10h14v4.38l2-2V6c0-1.1-.9-2-2-2h-1V2h-2v2H8V2H6v2H5c-1.11 0-1.99.9-1.99 " +
                "2L3 20a2 2 0 0 0 2 2h8.21zm5.33 2.5L13 18.96l1.41-1.41l2.12 2.12l4.24-4.24l1.41 1.41zM10.41 " +
                "14L12 15.59L10.59 17L9 15.41L7.41 17L6 15.59L7.59 14L6 12.41L7.41 11L9 12.59L10.59 11L12 12.41z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "free-cancellation-icon";
    }
}
