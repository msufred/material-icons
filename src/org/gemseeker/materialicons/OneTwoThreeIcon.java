package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class OneTwoThreeIcon extends SVGIcon {

    public OneTwoThreeIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.45);
    }

    public OneTwoThreeIcon(double size) {
        super(size * 1.25, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7 15H5.5v-4.5H4V9h3zm6.5-1.5h-3v-1h2c.55 0 1-.45 1-1V10c0-.55-.45-1-1-1H9v1.5h3v1h-2c-.55 0-1 " +
                ".45-1 1V15h4.5zm6 .5v-4c0-.55-.45-1-1-1H15v1.5h3v1h-2v1h2v1h-3V15h3.5c.55 0 1-.45 1-1");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "one-two-three-icon";
    }
}
