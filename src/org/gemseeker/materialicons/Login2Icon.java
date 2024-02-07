package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class Login2Icon extends SVGIcon {

    public Login2Icon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public Login2Icon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M9 2h9c1.1 0 2 .9 2 2v16c0 1.1-.9 2-2 2H9c-1.1 0-2-.9-2-2v-2h2v2h9V4H9v2H7V4c0-1.1.9-2 2-2");
        SVGPath p2 = new SVGPath();
        p2.setContent("M10.09 15.59L11.5 17l5-5l-5-5l-1.41 1.41L12.67 11H3v2h9.67z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "login-2-icon";
    }
}
