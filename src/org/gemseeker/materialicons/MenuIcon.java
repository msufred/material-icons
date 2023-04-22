package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MenuIcon extends SVGIcon {

    public MenuIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public MenuIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 816v-60h720v60H120Zm0-210v-60h720v60H120Zm0-210v-60h720v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "menu-icon";
    }
}
