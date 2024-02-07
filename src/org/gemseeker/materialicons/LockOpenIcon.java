package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LockOpenIcon extends SVGIcon {

    public LockOpenIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public LockOpenIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 17c1.1 0 2-.9 2-2s-.9-2-2-2s-2 .9-2 2s.9 2 2 2m6-9h-" +
                "1V6c0-2.76-2.24-5-5-5S7 3.24 7 6h1.9c0-1.71 1.39-3.1 3.1-3.1c1.7" +
                "1 0 3.1 1.39 3.1 3.1v2H6c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h12c1.1" +
                " 0 2-.9 2-2V10c0-1.1-.9-2-2-2m0 12H6V10h12z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "lock-open-icon";
    }
}
