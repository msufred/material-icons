package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowDropUpIcon extends SVGIcon {

    public ArrowDropUpIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 0.45);
    }

    public ArrowDropUpIcon(double size) {
        super(size * 0.85, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m280 656 200-201 200 201H280Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-drop-up-icon";
    }
}
