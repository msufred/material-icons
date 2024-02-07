package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AccessibleIcon extends SVGIcon {

    public AccessibleIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public AccessibleIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M19 13v-2c-1.54.02-3.09-.75-4.07-1.83l-1.29-1.43c-.17-.19-.38-.34-.61-.45c-.01 0-.01-.01-." +
                "02-.01H13c-.35-.2-.75-.3-1.19-.26C10.76 7.11 10 8.04 10 9.09V15c0 1.1.9 2 2 2h5v5h2v-5.5c0-1.1-.9-" +
                "2-2-2h-3v-3.45c1.29 1.07 3.25 1.94 5 1.95m-6.17 5c-.41 1.16-1.52 2-2.83 2c-1.66 0-3-1.34-3-3c0-1.3" +
                "1.84-2.41 2-2.83V12.1a5 5 0 1 0 5.9 5.9z");
        SVGPath p2 = new SVGPath();
        // circle: cx="12" cy="4" r="2"
        // path formula: M cx cy m r, 0 a r, r 0 1, 0 -(r*2), 0 a r, r 0 1, 0 (r*2), 0
        p2.setContent("M 12 4 m 2, 0 a 2, 2 0 1, 0 -4, 0 a 2, 2 0 1, 0 4, 0");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "accessible-icon";
    }
}
