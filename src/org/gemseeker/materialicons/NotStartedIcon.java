package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NotStartedIcon extends SVGIcon {

    public NotStartedIcon() {
        super();
    }

    public NotStartedIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m-1 14H9V8h2zm1 0V8l5 4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "not-started-icon";
    }
}
