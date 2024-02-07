package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AccessibleForwardIcon extends SVGIcon {

    public AccessibleForwardIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public AccessibleForwardIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M14 17h-2c0 1.65-1.35 3-3 3s-3-1.35-3-3s1.35-3 3-3v-2c-2.76 0-5 2.24-5 5s2.24 5 5 5s5-2.24 " +
                "5-5m3-3.5h-1.86l1.67-3.67C17.42 8.5 16.44 7 14.96 7h-5.2c-.81 0-1.54.47-1.87 1.2L7.22 10l1.92.53L" +
                "9.79 9H12l-1.83 4.1c-.6 1.33.39 2.9 1.85 2.9H17v5h2v-5.5c0-1.1-.9-2-2-2");
        SVGPath p2 = new SVGPath();
        // circle: cx="17" cy="4.54" r="2"
        // path formula: M cx cy m r, 0 a r, r 0 1, 0 -(r*2), 0 a r, r 0 1, 0 (r*2), 0
        p2.setContent("M 17 4.54 m 2, 0 a 2, 2 0 1, 0 -4, 0 a 2, 2 0 1, 0 4, 0");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "accessible-forward-icon";
    }
}
