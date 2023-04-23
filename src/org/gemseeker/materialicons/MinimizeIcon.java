package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MinimizeIcon extends SVGIcon {

    public MinimizeIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.125);
    }

    public MinimizeIcon(double size) {
        super(size, size * 0.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M240 926v-60h481v60H240Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "minimize-icon";
    }
}
