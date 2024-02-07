package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class Logout2Icon extends SVGIcon {

    public Logout2Icon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public Logout2Icon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M6 2h9a2 2 0 0 1 2 2v2h-2V4H6v16h9v-2h2v2a2 2 0 0 1-2 2H6a2 2 0 0 1-2-2V4a2 2 0 0 1 2-2");
        SVGPath p2 = new SVGPath();
        p2.setContent("M16.09 15.59L17.5 17l5-5l-5-5l-1.41 1.41L18.67 11H9v2h9.67z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "logout-2-icon";
    }
}
