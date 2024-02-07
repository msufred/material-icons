package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BookmarkBorderIcon extends SVGIcon {

    public BookmarkBorderIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public BookmarkBorderIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17 3H7c-1.1 0-1.99.9-1.99 2L5 21l7-3l7 3V5c0-1.1-.9-2-2-2m0 15l-5-2.18L7 18V5h10z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "bookmark-border-icon";
    }
}
