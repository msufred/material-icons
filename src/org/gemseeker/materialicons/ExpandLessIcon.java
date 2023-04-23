package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ExpandLessIcon extends SVGIcon {

    public ExpandLessIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 0.5);
    }

    public ExpandLessIcon(double size) {
        super(size * 0.85, size * 0.5);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m283 711-43-43 240-240 240 239-43 43-197-197-197 198Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "expand-less-icon";
    }

}
