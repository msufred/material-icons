package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ExploreIcon extends SVGIcon {

    public ExploreIcon() {
        super();
    }

    public ExploreIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 10.9c-.61 0-1.1.49-1.1 1.1s.49 1.1 1.1 1.1c.61 0 1.1-.49 1.1-1.1s-." +
                "49-1.1-1.1-1.1M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2" +
                "m2.19 12.19L6 18l3.81-8.19L18 6z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "explore-icon";
    }
}
