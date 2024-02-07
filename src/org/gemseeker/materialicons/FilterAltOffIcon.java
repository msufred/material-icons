package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FilterAltOffIcon extends SVGIcon {

    public FilterAltOffIcon() {
        super();
    }

    public FilterAltOffIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19.79 5.61A.998.998 0 0 0 19 4H6.83l7.97 7.97zM2.81 2.81L1.39 4.22L10 13v6c0 " +
                ".55.45 1 1 1h2c.55 0 1-.45 1-1v-2.17l5.78 5.78l1.41-1.41z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "filter-alt-off-icon";
    }
}
