package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ExitToAppIcon extends SVGIcon {

    public ExitToAppIcon() {
        super();
    }

    public ExitToAppIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-24 0-42-18t-18-42V666h60v210h600V274H180v212h-60V274q0-24 18-42t42-18h600q24 0 42 " +
                "18t18 42v602q0 24-18 42t-42 18H180Zm233-167-45-45 118-118H120v-60h366L368 428l45-45 193 193-193 193Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "exit-to-app-icon";
    }
}
