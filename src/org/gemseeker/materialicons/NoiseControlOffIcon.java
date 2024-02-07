package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NoiseControlOffIcon extends SVGIcon {

    public NoiseControlOffIcon() {
        super();
    }

    public NoiseControlOffIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M12 4c1.44 0 2.79.38 3.95 1.05L17.4 3.6C15.85 2.59 13.99 2 12 2s-3.85.59-5.41 1" +
                ".59l1.45 1.45A8.034 8.034 0 0 1 12 4m8 8c0 1.44-.38 2.79-1.05 3.95l1.45 1.45c1.01-1.5" +
                "5 1.6-3.41 1.6-5.4s-.59-3.85-1.59-5.41l-1.45 1.45A8.034 8.034 0 0 1 20 12m-8 8c-1.44 " +
                "0-2.79-.38-3.95-1.05L6.6 20.4C8.15 21.41 10.01 22 12 22s3.85-.59 5.41-1.59l-1.45-1.45" +
                "A8.034 8.034 0 0 1 12 20m-8-8c0-1.44.38-2.79 1.05-3.95L3.59 6.59C2.59 8.15 2 10.01 2 " +
                "12s.59 3.85 1.59 5.41l1.45-1.45A8.034 8.034 0 0 1 4 12m7.5-6C9.02 6 7 8.02 7 10.5c0 1" +
                ".22.49 2.41 1.35 3.27l1.36 1.36c.17.17.31.44.44.82A3.013 3.013 0 0 0 13 18c1.65 0 3-1" +
                ".35 3-3h-2a1.003 1.003 0 0 1-1.95.32c-.15-.44-.4-1.08-.93-1.61l-1.36-1.36C9.28 11.87 " +
                "9 11.19 9 10.5a2.5 2.5 0 0 1 4.95-.5h2.02c-.25-2.25-2.16-4-4.47-4");
        SVGPath p2 = new SVGPath();
        p2.setContent("M12,12.5a1.5,1.5 0 1,0 3,0a1.5,1.5 0 1,0 -3,0");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "noise-control-off-icon";
    }
}
