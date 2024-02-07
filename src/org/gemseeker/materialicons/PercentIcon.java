package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PercentIcon extends SVGIcon {

    public PercentIcon() {
        super();
    }

    public PercentIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 11C9.43 11 11 9.43 11 7.5S9.43 4 7.5 4S4 5.57 4 " +
                "7.5S5.57 11 7.5 11m0-5C8.33 6 9 6.67 9 7.5S8.33 9 7.5 9S6 8.3" +
                "3 6 7.5S6.67 6 7.5 6M4.002 18.583L18.59 3.996l1.414 1.414L5.4" +
                "17 19.997zM16.5 13c-1.93 0-3.5 1.57-3.5 3.5s1.57 3.5 3.5 3.5s" +
                "3.5-1.57 3.5-3.5s-1.57-3.5-3.5-3.5m0 5c-.83 0-1.5-.67-1.5-1.5" +
                "s.67-1.5 1.5-1.5s1.5.67 1.5 1.5s-.67 1.5-1.5 1.5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "percent-icon";
    }
}
