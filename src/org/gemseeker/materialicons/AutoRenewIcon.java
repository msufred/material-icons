package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AutoRenewIcon extends SVGIcon {

    public AutoRenewIcon() {
        super(DEFAULT_SIZE * 0.95, DEFAULT_SIZE * 1.25);
    }

    public AutoRenewIcon(double size) {
        super(size * 0.95, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M196 725q-20-36-28-72.5t-8-74.5q0-131 94.5-225.5T480 258h43l-80-80 39-39 149 149-149 149-40-40 " +
                "79-79h-41q-107 0-183.5 76.5T220 578q0 29 5.5 55t13.5 49l-43 43Zm280 291L327 867l149-149 39 39-80 " +
                "80h45q107 0 183.5-76.5T740 577q0-29-5-55t-15-49l43-43q20 36 28.5 72.5T800 577q0 131-94.5 225.5T480 " +
                "897h-45l80 80-39 39Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "auto-renew-icon";
    }
}
