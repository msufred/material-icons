package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BookmarkAddedIcon extends SVGIcon {

    public BookmarkAddedIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public BookmarkAddedIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m19 21l-7-3l-7 3V5c0-1.1.9-2 2-2h7a5.002 5.002 0 0 0 5 7.9zM17.83 9L15 " +
                "6.17l1.41-1.41l1.41 1.41l3.54-3.54l1.41 1.41z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "bookmark-added-icon";
    }
}
