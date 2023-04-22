package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CloseIcon extends SVGIcon {

    public CloseIcon() {
        super();
    }

    public CloseIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m249 849-42-42 231-231-231-231 42-42 231 231 231-231 42 42-231 231 231 231-42 42-231-231-231 231Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "close-icon";
    }
}
