package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AcuteIcon extends SVGIcon {

    public AcuteIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.9);
    }

    public AcuteIcon(double size) {
        super(size * 1.25, size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M600 896q-134 0-227-93t-93-227q0-134 93-227t227-93q134 0 227 93t93 227q0 134-93 227t-227 " +
                "93Zm102-177 42-42-113-114-1-147h-60v172l132 131ZM80 446v-60h160v60H80ZM40 606v-60h200v60H40Zm40 " +
                "160v-60h160v60H80Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "acute-icon";
    }
}
