package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PermIdentityIcon extends SVGIcon {

    public PermIdentityIcon() {
        super();
    }

    public PermIdentityIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 5.9a2.1 2.1 0 1 1 0 4.2a2.1 2.1 0 0 1 0-4.2m0 " +
                "9c2.97 0 6.1 1.46 6.1 2.1v1.1H5.9V17c0-.64 3.13-2.1 6.1-2." +
                "1M12 4C9.79 4 8 5.79 8 8s1.79 4 4 4s4-1.79 4-4s-1.79-4-4-4" +
                "m0 9c-2.67 0-8 1.34-8 4v3h16v-3c0-2.66-5.33-4-8-4");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "perm-identity-icon";
    }
}
