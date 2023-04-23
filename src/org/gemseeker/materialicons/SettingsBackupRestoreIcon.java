package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SettingsBackupRestoreIcon extends SVGIcon {

    public SettingsBackupRestoreIcon() {
        super();
    }

    public SettingsBackupRestoreIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M479.956 651Q449 651 427 628.956q-22-22.045-22-53Q405 545 427.044 523q22.045-22 53-22Q511 501 " +
                "533 523.044q22 22.045 22 53Q555 607 532.956 629q-22.045 22-53 22ZM480 936q-150 0-255-105.5T120 575h60q0 " +
                "125 87.5 213T480 876q125.357 0 212.679-87.321Q780 701.357 780 576t-87.321-212.679Q605.357 276 480 " +
                "276q-69 0-129 30.5T246 389h104v60H142V241h60v106q53-62 125.216-96.5T480 216q75 0 140.5 28.5t114 " +
                "77q48.5 48.5 77 114T840 576q0 75-28.5 140.5t-77 114q-48.5 48.5-114 77T480 936Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "settings-backup-restore-icon";
    }

}
