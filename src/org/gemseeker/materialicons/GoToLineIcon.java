package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class GoToLineIcon extends SVGIcon {

    public GoToLineIcon() {
        super(DEFAULT_SIZE * 0.15, DEFAULT_SIZE);
    }

    public GoToLineIcon(double size) {
        super(size * 0.15, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M430 356V256h100v100H430Zm0 540V796h100v100H430Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "goto-line-icon";
    }
}
