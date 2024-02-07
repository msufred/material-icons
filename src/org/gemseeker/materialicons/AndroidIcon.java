package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AndroidIcon extends SVGIcon {

    public AndroidIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.75);
    }

    public AndroidIcon(double size) {
        super(size * 1.25, size * 0.75);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m17.6 9.48l1.84-3.18c.16-.31.04-.69-.26-.85a.637.637 0 0 0-.83.22l-1.88 " +
                "3.24a11.463 11.463 0 0 0-8.94 0L5.65 5.67a.643.643 0 0 0-.87-.2c-.28.18-.37.54-." +
                "22.83L6.4 9.48A10.78 10.78 0 0 0 1 18h22a10.78 10.78 0 0 0-5.4-8.52M7 15.25a1.25" +
                " 1.25 0 1 1 0-2.5a1.25 1.25 0 0 1 0 2.5m10 0a1.25 1.25 0 1 1 0-2.5a1.25 1.25 0 0" +
                " 1 0 2.5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "android-icon";
    }
}
