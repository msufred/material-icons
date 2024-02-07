package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PermScanWifiIcon extends SVGIcon {

    public PermScanWifiIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public PermScanWifiIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 3C6.95 3 3.15 4.85 0 7.23L12 22L24 7.25C20.85 4.87 17.05 3 12 3m1 13h-2v-6h2zm-2-8V6h2v2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "perm-scan-wifi-icon";
    }
}
