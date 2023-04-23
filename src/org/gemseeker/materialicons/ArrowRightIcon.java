package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowRightIcon extends SVGIcon {

    public ArrowRightIcon() {
        super(DEFAULT_SIZE * 0.45, DEFAULT_SIZE * 0.85);
    }

    public ArrowRightIcon(double size) {
        super(size * 0.45, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M400 776V376l200 200-200 200Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-right-icon";
    }
}
