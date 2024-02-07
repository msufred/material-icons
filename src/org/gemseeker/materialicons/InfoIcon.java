package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class InfoIcon extends SVGIcon {

    public InfoIcon() {
        super();
    }

    public InfoIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m1 15h-2v-6h2zm0-8h-2V7h2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "info-icon";
    }
}
