package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OfflineBoltIcon extends SVGIcon {

    public OfflineBoltIcon() {
        super();
    }

    public OfflineBoltIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2.02c-5.51 0-9.98 4.47-9.98 9.98s4.47 9.98 9.98 9.98s9.98-4.47 " +
                "9.98-9.98S17.51 2.02 12 2.02M11.48 20v-6.26H8L13 4v6.26h3.35z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "offline-bolt-icon";
    }
}
