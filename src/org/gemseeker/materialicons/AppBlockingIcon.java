package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AppBlockingIcon extends SVGIcon {

    public AppBlockingIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public AppBlockingIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M18 8c-2.21 0-4 1.79-4 4s1.79 4 4 4s4-1.79 4-4s-1.79-4-4-4m-2.5 4A2.5 2.5 " +
                "0 0 1 18 9.5c.42 0 .8.11 1.15.29l-3.36 3.36c-.18-.35-.29-.73-.29-1.15m2.5 2.5c-.42" +
                " 0-.8-.11-1.15-.29l3.36-3.36c.18.35.29.73.29 1.15a2.5 2.5 0 0 1-2.5 2.5M17 18H7V6h" +
                "10v1h2V3c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2v-4h-2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "app-blocking-icon";
    }
}
