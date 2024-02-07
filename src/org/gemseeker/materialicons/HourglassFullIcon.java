package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HourglassFullIcon extends SVGIcon {

    public HourglassFullIcon() {
        super(DEFAULT_SIZE * 0.575, DEFAULT_SIZE);
    }

    public HourglassFullIcon(double size) {
        super(size * 0.575, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M6 2v6h.01L6 8.01L10 12l-4 4l.01.01H6V22h12v-5.99h-.01L18 16l-4-4l4-3.99l-.01-.01H18V2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "hourglass-full-icon";
    }
}
