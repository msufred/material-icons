package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PanToolIcon extends SVGIcon {

    public PanToolIcon() {
        super(DEFAULT_SIZE * 0.95, DEFAULT_SIZE);
    }

    public PanToolIcon(double size) {
        super(size * 0.95, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M23 5.5V20c0 2.2-1.8 4-4 4h-7.3c-1.08 0-2.1-.43-2.85-1.19L1 14." +
                "83s1.26-1.23 1.3-1.25c.22-.19.49-.29.79-.29c.22 0 .42.06.6.16c.04.01 4." +
                "31 2.46 4.31 2.46V4c0-.83.67-1.5 1.5-1.5S11 3.17 11 4v7h1V1.5c0-.83.67-" +
                "1.5 1.5-1.5S15 .67 15 1.5V11h1V2.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5V" +
                "11h1V5.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "pan-tool-icon";
    }
}
