package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FilterAltIcon extends SVGIcon {

    public FilterAltIcon() {
        super();
    }

    public FilterAltIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M4.25 5.61C6.27 8.2 10 13 10 13v6c0 .55.45 1 1 1h2c.55 0 1-.45 " +
                "1-1v-6s3.72-4.8 5.74-7.39A.998.998 0 0 0 18.95 4H5.04c-.83 0-1.3.95-.79 1.61");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "filter-alt-icon";
    }
}
