package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwitchAccessShortcutAddIcon extends SVGIcon {

    public SwitchAccessShortcutAddIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public SwitchAccessShortcutAddIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M720 746V646H620v-60h100V486h60v100h100v60H780v100h-60ZM598 976q-123-51-196.5-160T328 " +
                "574q0-98.882 42-187.441T489 236H322v-60h276v276h-60V273q-71 54-110.5 132.5T388 573q0 107.978 56.5 " +
                "198.489Q501 862 598 910v66Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "switch-access-shortcut-add-icon";
    }
}
