package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class JoinFullIcon extends SVGIcon {

    public JoinFullIcon() {
        super(DEFAULT_SIZE * 1.15, DEFAULT_SIZE * 0.7);
    }

    public JoinFullIcon(double size) {
        super(size * 1.15, size * 0.7);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M9,12a3,5.74 0 1,0 6,0a3,5.74 0 1,0 -6,0");
        SVGPath p2 = new SVGPath();
        p2.setContent("M7.5 12c0-.97.23-4.16 3.03-6.5C9.75 5.19 8.9 5 8 5c-3.86 0-7 3.14-7 " +
                "7s3.14 7 7 7c.9 0 1.75-.19 2.53-.5c-2.8-2.34-3.03-5.53-3.03-6.5M16 5c-.9 0" +
                "-1.75.19-2.53.5c2.8 2.34 3.03 5.53 3.03 6.5c0 .97-.23 4.16-3.03 6.5c.78.31" +
                " 1.63.5 2.53.5c3.86 0 7-3.14 7-7s-3.14-7-7-7");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "join-full-icon";
    }
}
