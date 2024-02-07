package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LockResetIcon extends SVGIcon {

    public LockResetIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public LockResetIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13 3a9 9 0 0 0-9 9H1l4 4l4-4H6c0-3.86 3.14-7 7-7s7 3.14 " +
                "7 7s-3.14 7-7 7c-1.9 0-3.62-.76-4.88-1.99L6.7 18.42A8.982 8.982 0" +
                " 0 0 13 21a9 9 0 0 0 0-18m2 8v-1c0-1.1-.9-2-2-2s-2 .9-2 2v1c-.55 " +
                "0-1 .45-1 1v3c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1" +
                "m-1 0h-2v-1c0-.55.45-1 1-1s1 .45 1 1z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "lock-reset-icon";
    }
}
