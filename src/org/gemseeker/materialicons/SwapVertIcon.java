package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwapVertIcon extends SVGIcon {

    public SwapVertIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.25);
    }

    public SwapVertIcon(double size) {
        super(size, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M322 606V290L202 410l-42-42 193-193 193 193-42 42-122-121v317h-60Zm285 369L414 781l42-41 " +
                "120 120V544h60v317l122-121 42 42-193 193Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swap-horiz-icon";
    }
}
