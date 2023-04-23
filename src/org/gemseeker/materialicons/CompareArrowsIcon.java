package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CompareArrowsIcon extends SVGIcon {

    public CompareArrowsIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public CompareArrowsIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m317 896-42-42 121-121H80v-60h316L275 552l42-42 193 193-193 193Zm326-254L450 449l193-193 42 " +
                "42-121 121h316v60H564l121 121-42 42Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "compare-arrows-icon";
    }
}
