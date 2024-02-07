package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BookmarkRemoveIcon extends SVGIcon {

    public BookmarkRemoveIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public BookmarkRemoveIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21 7h-6V5h6zm-2 3.9A5.002 5.002 0 0 1 14 3H7c-1.1 0-2 .9-2 2v16l7-3l7 3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "bookmark-remove-icon";
    }
}
