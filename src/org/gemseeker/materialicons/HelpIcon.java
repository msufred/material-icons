package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HelpIcon extends SVGIcon {

    public HelpIcon() {
        super();
    }

    public HelpIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m1 " +
                "17h-2v-2h2zm2.07-7.75l-.9.92C13.45 12.9 13 13.5 13 15h-2v-.5c0-1.1.45-2.1 1." +
                "17-2.83l1.24-1.26c.37-.36.59-.86.59-1.41c0-1.1-.9-2-2-2s-2 .9-2 2H8c0-2.21 1" +
                ".79-4 4-4s4 1.79 4 4c0 .88-.36 1.68-.93 2.25");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "help-icon";
    }
}
