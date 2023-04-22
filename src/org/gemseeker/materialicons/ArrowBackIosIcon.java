package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowBackIosIcon extends SVGIcon {

    public ArrowBackIosIcon() {
        super(DEFAULT_SIZE * 0.55, DEFAULT_SIZE);
    }

    public ArrowBackIosIcon(double size) {
        super(size * 0.55, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M400 976 0 576l400-400 56 57-343 343 343 343-56 57Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-back-ios-icon";
    }

}
