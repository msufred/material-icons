package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FindInPageIcon extends SVGIcon {

    public FindInPageIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public FindInPageIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 19.59V8l-6-6H6c-1.1 0-1.99.9-1.99 2L4 20c0 1.1.89 2 1.99 2H18c.45 0 .85-.15 " +
                "1.19-.4l-4.43-4.43c-.8.52-1.74.83-2.76.83c-2.76 0-5-2.24-5-5s2.24-5 5-5s5 2.24 5 5c0 1.0" +
                "2-.31 1.96-.83 2.75zM9 13c0 1.66 1.34 3 3 3s3-1.34 3-3s-1.34-3-3-3s-3 1.34-3 3");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "find-in-page-icon";
    }
}
