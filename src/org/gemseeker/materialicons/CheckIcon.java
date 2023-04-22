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
        path.setContent("M378 810 154 586l43-43 181 181 384-384 43 43-427 427Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "check-icon";
    }

}
