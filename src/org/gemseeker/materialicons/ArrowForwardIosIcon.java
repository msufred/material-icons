package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowForwardIosIcon extends SVGIcon {

    public ArrowForwardIosIcon() {
        super(DEFAULT_SIZE * 0.55, DEFAULT_SIZE);
    }

    public ArrowForwardIosIcon(double size) {
        super(size * 0.55, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m304 974-56-57 343-343-343-343 56-57 400 400-400 400Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-forward-ios-icon";
    }

}
