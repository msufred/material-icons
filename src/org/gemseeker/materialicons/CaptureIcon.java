package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CaptureIcon extends SVGIcon {

    public CaptureIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public CaptureIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M80 896V256h800v640H80Zm140-140h520V396H220v360Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "capture-icon";
    }
}
