package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowRightAltIcon extends SVGIcon {

    public ArrowRightAltIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public ArrowRightAltIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m561 814-43-42 168-168H160v-60h526L517 375l43-42 241 241-240 240Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-right-alt-icon";
    }
}
