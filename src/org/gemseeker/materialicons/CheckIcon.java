package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CheckIcon extends SVGIcon {

    public CheckIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.7);
    }

    public CheckIcon(double size) {
        super(size, size * 0.7);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M382-240 154-468l57-57 171 171 367-367 57 57-424 424Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "check-icon";
    }

}
