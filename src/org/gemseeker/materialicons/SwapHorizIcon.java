package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwapHorizIcon extends SVGIcon {

    public SwapHorizIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public SwapHorizIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M273 896 80 703l193-193 42 42-121 121h316v60H194l121 121-42 42Zm414-254-42-42 " +
                "121-121H450v-60h316L645 298l42-42 193 193-193 193Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swap-horiz-icon";
    }
}
