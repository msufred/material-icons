package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class JoinRightIcon extends SVGIcon {

    public JoinRightIcon() {
        super(DEFAULT_SIZE * 1.15, DEFAULT_SIZE * 0.7);
    }

    public JoinRightIcon(double size) {
        super(size * 1.15, size * 0.7);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M9,12a3,5.74 0 1,0 6,0a3,5.74 0 1,0 -6,0");
        SVGPath p2 = new SVGPath();
        p2.setContent("M16.5 12c0 .97-.23 4.16-3.03 6.5c.78.31 1.63.5 2.53.5c3.86 0 7-3.14 " +
                "7-7s-3.14-7-7-7c-.9 0-1.75.19-2.53.5c2.8 2.34 3.03 5.53 3.03 6.5M8 19c.9 0" +
                " 1.75-.19 2.53-.5c-.61-.51-1.1-1.07-1.49-1.63c-.33.08-.68.13-1.04.13c-2.76" +
                " 0-5-2.24-5-5s2.24-5 5-5c.36 0 .71.05 1.04.13c.39-.56.88-1.12 1.49-1.63C9." +
                "75 5.19 8.9 5 8 5c-3.86 0-7 3.14-7 7s3.14 7 7 7");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "join-right-icon";
    }
}
