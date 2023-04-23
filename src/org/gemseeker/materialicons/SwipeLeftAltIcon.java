package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwipeLeftAltIcon extends SVGIcon {

    public SwipeLeftAltIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.55);
    }

    public SwipeLeftAltIcon(double size) {
        super(size , size * 0.55);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M600 776q-82 0-133.5-50.5T401 606H194l89 89-42 42L80 576l161-161 42 42-89 89h207q14-69 " +
                "65.5-119.5T600 376q83 0 141.5 58T800 576q0 82-58.5 141T600 776Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swipe-left-alt-icon";
    }
}
