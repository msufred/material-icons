package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RemoveIcon extends SVGIcon {

    public RemoveIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.125);
    }

    public RemoveIcon(double size) {
        super(size, size * 0.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M200 606v-60h560v60H200Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "remove-icon";
    }
}
