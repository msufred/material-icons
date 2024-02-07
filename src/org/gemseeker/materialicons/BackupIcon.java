package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BackupIcon extends SVGIcon {

    public BackupIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.85);
    }

    public BackupIcon(double size) {
        super(size * 1.25, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19.35 10.04A7.49 7.49 0 0 0 12 4C9.11 4 6.6 5.64 5.35 8.04A5.994 5.994 0 0 0 0 14c0 " +
                "3.31 2.69 6 6 6h13c2.76 0 5-2.24 5-5c0-2.64-2.05-4.78-4.65-4.96M14 13v4h-4v-4H7l5-5l5 5z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "backup-icon";
    }
}
