package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwitchAccessShortcutIcon extends SVGIcon {

    public SwitchAccessShortcutIcon() {
        super(DEFAULT_SIZE * 0.35, DEFAULT_SIZE);
    }

    public SwitchAccessShortcutIcon(double size) {
        super(size * 0.35, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M598 976q-123-51-196.5-160T328 574q0-99 42-187.5T489 236H322v-60h276v276h-60V273q-71 " +
                "54-110.5 132.5T388 573q0 108 56.5 198.5T598 910v66Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "switch-access-shortcut-icon";
    }
}
