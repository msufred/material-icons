package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MagnificationSmallIcon extends SVGIcon {

    public MagnificationSmallIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public MagnificationSmallIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M194 528h161V370H194v158Zm-54 368q-24 0-42-18t-18-42V316q0-24 18-42t42-18h680q24 0 42 18t18 " +
                "42v520q0 24-18 42t-42 18H140Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "magnification-small-icon";
    }
}
