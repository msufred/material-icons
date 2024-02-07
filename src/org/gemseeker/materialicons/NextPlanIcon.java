package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NextPlanIcon extends SVGIcon {

    public NextPlanIcon() {
        super();
    }

    public NextPlanIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m6 " +
                "11.97h-5l2.26-2.26a4.94 4.94 0 0 0-3.76-1.74c-2.37 0-4.35 1.66-4.86 3.88l-.9" +
                "6-.32c.64-2.62 3-4.56 5.82-4.56c1.78 0 3.37.79 4.47 2.03L18 8.97z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "next-plan-icon";
    }
}
