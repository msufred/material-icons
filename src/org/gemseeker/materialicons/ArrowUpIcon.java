package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowUpIcon extends SVGIcon {

    public ArrowUpIcon() {
        super();
    }

    public ArrowUpIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M450 896V370L202 618l-42-42 320-320 320 320-42 42-248-248v526h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-up-icon";
    }
}
