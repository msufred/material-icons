package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwipeRightAltIcon extends SVGIcon {

    public SwipeRightAltIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.55);
    }

    public SwipeRightAltIcon(double size) {
        super(size , size * 0.55);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M360 776q-82 0-141-58.5T160 576q0-82 59-141t141-59q82 0 133.5 50.5T559 546h207l-89-89 42-42 " +
                "161 161-161 161-42-42 89-89H559q-14 69-65.5 119.5T360 776Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swipe-right-alt-icon";
    }
}
