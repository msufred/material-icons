package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GroupWorkIcon extends SVGIcon {

    public GroupWorkIcon() {
        super();
    }

    public GroupWorkIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2M8 17.5a2.5 2.5 0 " +
                "0 1 0-5a2.5 2.5 0 0 1 0 5M9.5 8a2.5 2.5 0 0 1 5 0a2.5 2.5 0 0 1-5 0m6.5 9.5a2.5 2.5 0 0 1 0" +
                "-5a2.5 2.5 0 0 1 0 5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "group-work-icon";
    }
}
