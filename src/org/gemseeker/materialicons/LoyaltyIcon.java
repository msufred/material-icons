package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LoyaltyIcon extends SVGIcon {

    public LoyaltyIcon() {
        super();
    }

    public LoyaltyIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m21.41 11.58l-9-9C12.05 2.22 11.55 2 11 2H4c-1.1 0-2 .9-2 " +
                "2v7c0 .55.22 1.05.59 1.42l9 9c.36.36.86.58 1.41.58c.55 0 1.05-.22 " +
                "1.41-.59l7-7c.37-.36.59-.86.59-1.41c0-.55-.23-1.06-.59-1.42M5.5 7C" +
                "4.67 7 4 6.33 4 5.5S4.67 4 5.5 4S7 4.67 7 5.5S6.33 7 5.5 7m11.77 8" +
                ".27L13 19.54l-4.27-4.27A2.5 2.5 0 0 1 10.5 11c.69 0 1.32.28 1.77.7" +
                "4l.73.72l.73-.73a2.5 2.5 0 0 1 3.54 3.54");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "loyalty-icon";
    }
}
