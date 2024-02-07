package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PendingActionsIcon extends SVGIcon {

    public PendingActionsIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public PendingActionsIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17 12c-2.76 0-5 2.24-5 5s2.24 5 5 5s5-2.24 5-5s-2.24-5-5-5m1.65 " +
                "7.35L16.5 17.2V14h1v2.79l1.85 1.85zM18 3h-3.18C14.4 1.84 13.3 1 12 1s-2.4" +
                ".84-2.82 2H6c-1.1 0-2 .9-2 2v15c0 1.1.9 2 2 2h6.11a6.743 6.743 0 0 1-1.42" +
                "-2H6V5h2v3h8V5h2v5.08c.71.1 1.38.31 2 .6V5c0-1.1-.9-2-2-2m-6 2c-.55 0-1-." +
                "45-1-1s.45-1 1-1s1 .45 1 1s-.45 1-1 1");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "pending-actions-icon";
    }
}
