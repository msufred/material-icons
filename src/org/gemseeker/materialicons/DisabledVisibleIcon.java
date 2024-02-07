package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DisabledVisibleIcon extends SVGIcon {

    public DisabledVisibleIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public DisabledVisibleIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21.99 12.34c.01-.11.01-.23.01-.34c0-5.52-4.48-10-10-10S2 6.48 2 " +
                "12c0 5.17 3.93 9.43 8.96 9.95a9.343 9.343 0 0 1-2.32-2.68A8.01 8.01 0 0 " +
                "1 4 12c0-1.85.63-3.55 1.69-4.9l5.66 5.66c.56-.4 1.17-.73 1.82-1L7.1 5.69" +
                "A7.902 7.902 0 0 1 12 4c4.24 0 7.7 3.29 7.98 7.45c.71.22 1.39.52 2.01.89" +
                "M17 13c-3.18 0-5.9 1.87-7 4.5c1.1 2.63 3.82 4.5 7 4.5s5.9-1.87 7-4.5c-1." +
                "1-2.63-3.82-4.5-7-4.5m0 7a2.5 2.5 0 0 1 0-5a2.5 2.5 0 0 1 0 5m1.5-2.5c0 " +
                ".83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5s1.5.67 1.5 1.5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "disabled-visible-icon";
    }
}
