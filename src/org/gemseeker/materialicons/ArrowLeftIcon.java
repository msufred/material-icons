package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowLeftIcon extends SVGIcon {

    public ArrowLeftIcon() {
        super(DEFAULT_SIZE * 0.45, DEFAULT_SIZE * 0.85);
    }

    public ArrowLeftIcon(double size) {
        super(size * 0.45, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M560 776 360 576l200-200v400Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-left-icon";
    }
}
