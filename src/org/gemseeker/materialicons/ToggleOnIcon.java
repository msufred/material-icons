package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ToggleOnIcon extends SVGIcon {

    public ToggleOnIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.75);
    }

    public ToggleOnIcon(double size) {
        super(size * 1.25, size * 0.75);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M280 816q-100 0-170-70T40 576q0-100 70-170t170-70h400q100 0 170 70t70 170q0 100-70 170t-170 " +
                "70H280Zm400.941-139Q723 677 752.5 647.559t29.5-71.5Q782 534 752.559 504.5t-71.5-29.5Q639 475 609.5 " +
                "504.441t-29.5 71.5Q580 618 609.441 647.5t71.5 29.5Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "toggle-on-icon";
    }
}
