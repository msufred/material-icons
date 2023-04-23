package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwipeDownAltIcon extends SVGIcon {

    public SwipeDownAltIcon() {
        super(DEFAULT_SIZE * 0.55, DEFAULT_SIZE);
    }

    public SwipeDownAltIcon(double size) {
        super(size * 0.55 , size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976 319 815l42-42 89 89V655q-69-14-119.5-65.5T280 456q0-83 58.5-141.5T480 256q83 0 " +
                "141.5 58.5T680 456q0 82-50.5 133.5T510 655v207l89-89 42 42-161 161Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swipe-down-alt-icon";
    }
}
