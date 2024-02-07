package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PowerSettingsNewIcon extends SVGIcon {

    public PowerSettingsNewIcon() {
        super();
    }

    public PowerSettingsNewIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13 3h-2v10h2zm4.83 2.17l-1.42 1.42A6.92 6.92 0 0 1 19 " +
                "12c0 3.87-3.13 7-7 7A6.995 6.995 0 0 1 7.58 6.58L6.17 5.17A8.93" +
                "2 8.932 0 0 0 3 12a9 9 0 0 0 18 0c0-2.74-1.23-5.18-3.17-6.83");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "power-settings-new-icon";
    }
}
