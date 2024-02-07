package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class EventRepeatIcon extends SVGIcon {

    public EventRepeatIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public EventRepeatIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21 12V6c0-1.1-.9-2-2-2h-1V2h-2v2H8V2H6v2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 " +
                "2 2 2h7v-2H5V10h14v2zm-5.36 8a3.504 3.504 0 0 0 6.86-1c0-1.93-1.57-3.5-3.5-3.5c" +
                "-.95 0-1.82.38-2.45 1H18V18h-4v-4h1.5v1.43c.9-.88 2.14-1.43 3.5-1.43c2.76 0 5 2" +
                ".24 5 5a5.002 5.002 0 0 1-9.9 1z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "event-repeat-icon";
    }
}
