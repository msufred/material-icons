package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BrowseGalleryIcon extends SVGIcon {

    public BrowseGalleryIcon() {
        super(DEFAULT_SIZE * 1.2, DEFAULT_SIZE * 0.85);
    }

    public BrowseGalleryIcon(double size) {
        super(size * 1.2, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M9 3a9 9 0 1 0 .001 18.001A9 9 0 0 0 9 3m2.79 13.21L8 12.41V7h2v4.59l3.21 3.21z");
        SVGPath p2 = new SVGPath();
        p2.setContent("M17.99 3.52v2.16A6.99 6.99 0 0 1 22 12c0 2.79-1.64 5.2-4.01 6.32v2.16C21.48 19.24 " +
                "24 15.91 24 12s-2.52-7.24-6.01-8.48");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "browse-gallery-icon";
    }
}
