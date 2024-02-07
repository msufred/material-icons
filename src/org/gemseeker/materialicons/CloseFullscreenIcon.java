package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CloseFullscreenIcon extends SVGIcon {

    public CloseFullscreenIcon() {
        super();
    }

    public CloseFullscreenIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M22 3.41L16.71 8.7L20 12h-8V4l3.29 3.29L20.59 2zM3.41 22l5.29-5.29L12 20v-8H4l3.29 3.29L2 20.59z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "close-fullscreen-icon";
    }
}
