package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BookOnlineIcon extends SVGIcon {

    public BookOnlineIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 1.25);
    }

    public BookOnlineIcon(double size) {
        super(size * 0.85, size * 1.25);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17 1H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2M7 " +
                "18V6h10v12zm9-7V9.14C16 8.51 15.55 8 15 8H9c-.55 0-1 .51-1 1.14v1.96c.55 0 1 .45 1 1s-" +
                ".45 1-1 1v1.76c0 .63.45 1.14 1 1.14h6c.55 0 1-.51 1-1.14V13c-.55 0-1-.45-1-1s.45-1 1-1" +
                "m-3.5 3.5h-1v-1h1zm0-2h-1v-1h1zm0-2h-1v-1h1z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "book-online-icon";
    }
}
