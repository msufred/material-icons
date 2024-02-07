package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BackupTableIcon extends SVGIcon {

    public BackupTableIcon() {
        super();
    }

    public BackupTableIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M20 6v14H6v2h14c1.1 0 2-.9 2-2V6z");
        SVGPath p2 = new SVGPath();
        p2.setContent("M16 2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2M9 " +
                "16H4v-5h5zm7 0h-5v-5h5zm0-7H4V4h12z");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "backup-table-icon";
    }
}
