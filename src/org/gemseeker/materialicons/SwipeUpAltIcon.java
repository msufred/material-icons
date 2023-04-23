package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwipeUpAltIcon extends SVGIcon {

    public SwipeUpAltIcon() {
        super(DEFAULT_SIZE * 0.55, DEFAULT_SIZE);
    }

    public SwipeUpAltIcon(double size) {
        super(size * 0.55 , size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 896q-82 0-141-59t-59-141q0-82 50.5-133.5T450 497V290l-89 89-42-42 161-161 161 161-42 " +
                "42-89-89v207q69 14 119.5 65.5T680 696q0 82-58 141t-142 59Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swipe-up-alt-icon";
    }
}
