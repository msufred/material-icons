package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DoneAllIcon extends SVGIcon {

    public DoneAllIcon() {
        super(DEFAULT_SIZE * 1.45, DEFAULT_SIZE * 0.85);
    }

    public DoneAllIcon(double size) {
        super(size * 1.45, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M294 814 70 590l43-43 181 181 43 43-43 43Zm170 0L240 590l43-43 181 181 384-384 43 43-427 " +
                "427Zm0-170-43-43 257-257 43 43-257 257Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "done-all-icon";
    }
}
