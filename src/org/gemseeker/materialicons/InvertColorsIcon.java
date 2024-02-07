package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class InvertColorsIcon extends SVGIcon {

    public InvertColorsIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public InvertColorsIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 4.81V19c-3.31 0-6-2.63-6-5.87c0-1.56.62-3.03 1.75-4.14zM6.35 7.56C4.9 8.99 4 " +
                "10.96 4 13.13C4 17.48 7.58 21 12 21s8-3.52 8-7.87c0-2.17-.9-4.14-2.35-5.57L12 2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "invert-colors-icon";
    }
}
