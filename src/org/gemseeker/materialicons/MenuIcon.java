package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MenuIcon extends SVGIcon {

    public MenuIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.65);
    }

    public MenuIcon(double size) {
        super(size, size * 0.65);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120-240v-80h720v80H120Zm0-200v-80h720v80H120Zm0-200v-80h720v80H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "menu-icon";
    }
}
