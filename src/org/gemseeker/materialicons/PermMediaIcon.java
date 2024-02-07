package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PermMediaIcon extends SVGIcon {

    public PermMediaIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public PermMediaIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M2 6H0v5h.01L0 20c0 1.1.9 2 2 2h18v-2H2zm20-2h-8l-2-2H6c-1.1 0-1.99.9-1.99 2L4 " +
                "16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2M7 15l4.5-6l3.5 4.51l2.5-3.01L21 15z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "perm-media-icon";
    }
}
