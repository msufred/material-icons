package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ChevronLeftIcon extends SVGIcon {

    public ChevronLeftIcon() {
        super(DEFAULT_SIZE * 0.5, DEFAULT_SIZE * 0.85);
    }

    public ChevronLeftIcon(double size) {
        super(size * 0.5, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M561 816 320 575l241-241 43 43-198 198 198 198-43 43Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "chevron-left-icon";
    }

}
