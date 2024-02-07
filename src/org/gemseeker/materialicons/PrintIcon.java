package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PrintIcon extends SVGIcon {

    public PrintIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public PrintIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 8H5c-1.66 0-3 1.34-3 3v6h4v4h12v-4h4v-6c0-1.66-1.34-3-3-3m-3 " +
                "11H8v-5h8zm3-7c-.55 0-1-.45-1-1s.45-1 1-1s1 .45 1 1s-.45 1-1 1m-1-9H6v4h12z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "print-icon";
    }
}
