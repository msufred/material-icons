package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BookmarkAddIcon extends SVGIcon {

    public BookmarkAddIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public BookmarkAddIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21 7h-2v2h-2V7h-2V5h2V3h2v2h2zm-2 14l-7-3l-7 3V5c0-1.1.9-2 2-2h7a5.002 5.002 0 0 0 5 7.9z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "bookmark-add-icon";
    }
}
