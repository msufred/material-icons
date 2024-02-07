package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LockIcon extends SVGIcon {

    public LockIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public LockIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M18 8h-1V6c0-2.76-2.24-5-5-5S7 3.24 7 6v2H6c-1.1 0-2 .9-2 2v10c0 " +
                "1.1.9 2 2 2h12c1.1 0 2-.9 2-2V10c0-1.1-.9-2-2-2m-6 9c-1.1 0-2-.9-2-2s.9-2" +
                " 2-2s2 .9 2 2s-.9 2-2 2m3.1-9H8.9V6c0-1.71 1.39-3.1 3.1-3.1c1.71 0 3.1 1." +
                "39 3.1 3.1z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "lock-icon";
    }
}
