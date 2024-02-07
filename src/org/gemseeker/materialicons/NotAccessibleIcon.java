package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NotAccessibleIcon extends SVGIcon {

    public NotAccessibleIcon() {
        super();
    }

    public NotAccessibleIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m14 11.05l-3.42-3.42c.32-.34.74-.57 1.23-.61c.48-.04.84.07 " +
                "1.2.26c.19.1.39.22.63.46l1.29 1.43c.98 1.08 2.53 1.85 4.07 1.83v2c-" +
                "1.75-.01-3.71-.88-5-1.95M12 6c1.1 0 2-.9 2-2s-.9-2-2-2s-2 .9-2 2s.9" +
                " 2 2 2M2.81 2.81L1.39 4.22L10 12.83V15c0 1.1.9 2 2 2h2.17l5.61 5.61" +
                "l1.41-1.41zM10 20c-1.66 0-3-1.34-3-3c0-1.31.84-2.41 2-2.83V12.1a5 5" +
                " 0 1 0 5.9 5.9h-2.07c-.41 1.16-1.52 2-2.83 2");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "not-accessible-icon";
    }
}
