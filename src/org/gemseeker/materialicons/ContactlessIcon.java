package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ContactlessIcon extends SVGIcon {

    public ContactlessIcon() {
        super();
    }

    public ContactlessIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2M8.46 14.45l-1.36-" +
                ".62c.28-.61.41-1.24.4-1.86a4.42 4.42 0 0 0-.4-1.8l1.36-.63c.35.75.53 1.56.54 2.4c.01.86-.17" +
                " 1.7-.54 2.51m3.07 1.56l-1.3-.74c.52-.92.78-1.98.78-3.15c0-1.19-.27-2.33-.8-3.4l1.34-.67c.6" +
                "4 1.28.96 2.65.96 4.07c0 1.43-.33 2.74-.98 3.89m3.14 1.32l-1.35-.66c.78-1.6 1.18-3.18 1.18-" +
                "4.69c0-1.51-.4-3.07-1.18-4.64l1.34-.67c.9 1.78 1.34 3.56 1.34 5.31c0 1.74-.44 3.54-1.33 5.35");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "contactless-icon";
    }
}
