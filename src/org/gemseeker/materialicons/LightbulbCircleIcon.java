package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LightbulbCircleIcon extends SVGIcon {

    public LightbulbCircleIcon() {
        super();
    }

    public LightbulbCircleIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m0 17c-.83 " +
                "0-1.5-.67-1.5-1.5h3c0 .83-.67 1.5-1.5 1.5m3-2.5H9V15h6zm-.03-2.5H9.03A4.966 4.966 0 " +
                "0 1 7 10c0-2.76 2.24-5 5-5s5 2.24 5 5c0 1.64-.8 3.09-2.03 4");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "lightbulb-circle-icon";
    }
}
