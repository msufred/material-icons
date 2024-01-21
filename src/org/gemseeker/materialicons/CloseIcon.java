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
        path.setContent("m256-200-56-56 224-224-224-224 56-56 224 224 224-224 56 56-224 224 224 224-56 56-224-224-224 224Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "close-icon";
    }
}
