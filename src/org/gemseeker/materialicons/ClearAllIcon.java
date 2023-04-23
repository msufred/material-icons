package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ClearAllIcon extends SVGIcon {

    public ClearAllIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.5);
    }

    public ClearAllIcon(double size) {
        super(size, size * 0.5);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 776v-60h560v60H120Zm80-170v-60h560v60H200Zm80-170v-60h560v60H280Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "clear-all-icon";
    }
}
