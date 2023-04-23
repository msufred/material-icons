package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CheckSmallIcon extends SVGIcon {

    public CheckSmallIcon() {
        super(DEFAULT_SIZE * 0.7, DEFAULT_SIZE * 0.5);
    }

    public CheckSmallIcon(double size) {
        super(size * 0.7, size * 0.5);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M400 738 247 585l42-42 111 111 271-271 42 42-313 313Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "check-small-icon";
    }

}
