package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BookmarksIcon extends SVGIcon {

    public BookmarksIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public BookmarksIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m19 18l2 1V3c0-1.1-.9-2-2-2H8.99C7.89 1 7 1.9 7 3h10c1.1 0 2 .9 2 " +
                "2zM15 5H5c-1.1 0-2 .9-2 2v16l7-3l7 3V7c0-1.1-.9-2-2-2");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "bookmarks-icon";
    }
}
