package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PageViewIcon extends SVGIcon {

    public PageViewIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public PageViewIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M11.5 9a2.5 2.5 0 0 0 0 5a2.5 2.5 0 0 0 0-5M20 4H4c-1.1 0-2 .9-2 2v12c0 " +
                "1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2m-3.21 14.21l-2.91-2.91c-.69.44-1." +
                "51.7-2.39.7C9.01 16 7 13.99 7 11.5S9.01 7 11.5 7S16 9.01 16 11.5c0 .88-.26 1.69-" +
                ".7 2.39l2.91 2.9z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "page-view-icon";
    }
}
