package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ChevronRightIcon extends SVGIcon {

    public ChevronRightIcon() {
        super(DEFAULT_SIZE * 0.5, DEFAULT_SIZE * 0.85);
    }

    public ChevronRightIcon(double size) {
        super(size * 0.5, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m375 816-43-43 198-198-198-198 43-43 241 241-241 241Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "chevron-right-icon";
    }

}
