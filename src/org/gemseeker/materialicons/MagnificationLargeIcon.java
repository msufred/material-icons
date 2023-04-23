package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MagnificationLargeIcon extends SVGIcon {

    public MagnificationLargeIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public MagnificationLargeIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M194 688h481V370H194v318Zm-54 208q-24 0-42-18t-18-42V316q0-24 18-42t42-18h680q24 0 42 18t18 " +
                "42v520q0 24-18 42t-42 18H140Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "magnification-large-icon";
    }
}
