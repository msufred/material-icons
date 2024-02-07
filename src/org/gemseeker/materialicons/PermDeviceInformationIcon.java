package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PermDeviceInformationIcon extends SVGIcon {

    public PermDeviceInformationIcon() {
        super(DEFAULT_SIZE * 0.6, DEFAULT_SIZE);
    }

    public PermDeviceInformationIcon(double size) {
        super(size * 0.6, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13 7h-2v2h2zm0 4h-2v6h2zm4-9.99L7 1c-1.1 0-2 .9-2 2v18c0 " +
                "1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99M17 19H7V5h10z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "perm-device-information-icon";
    }
}
