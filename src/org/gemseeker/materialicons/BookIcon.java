package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BookIcon extends SVGIcon {

    public BookIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public BookIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M18 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2M6 4h5v8l-2.5-1.5L6 12z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "book-icon";
    }
}
