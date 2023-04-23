package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SortIcon extends SVGIcon {

    public SortIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.85);
    }

    public SortIcon(double size) {
        super(size * 1.25, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 816v-60h240v60H120Zm0-210v-60h480v60H120Zm0-210v-60h720v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "sort-icon";
    }
}
