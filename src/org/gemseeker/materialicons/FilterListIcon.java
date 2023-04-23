package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FilterListIcon extends SVGIcon {

    public FilterListIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.85);
    }

    public FilterListIcon(double size) {
        super(size * 1.25, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M400 816v-60h160v60H400ZM240 606v-60h480v60H240ZM120 396v-60h720v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "filter-list-icon";
    }
}
