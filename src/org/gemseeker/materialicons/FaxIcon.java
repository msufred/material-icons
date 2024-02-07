package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FaxIcon extends SVGIcon {

    public FaxIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public FaxIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 9h-1V4H8v16h14v-8c0-1.66-1.34-3-3-3m-9-3h6v3h-6zm4 11h-4v-5h4zm2 0c-.55 " +
                "0-1-.45-1-1s.45-1 1-1s1 .45 1 1s-.45 1-1 1m0-3c-.55 0-1-.45-1-1s.45-1 1-1s1 .45 1 1s" +
                "-.45 1-1 1m3 3c-.55 0-1-.45-1-1s.45-1 1-1s1 .45 1 1s-.45 1-1 1m0-3c-.55 0-1-.45-1-1s" +
                ".45-1 1-1s1 .45 1 1s-.45 1-1 1M4.5 8A2.5 2.5 0 0 0 2 10.5v8a2.5 2.5 0 0 0 5 0v-8A2.5" +
                " 2.5 0 0 0 4.5 8");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "fax-icon";
    }
}
