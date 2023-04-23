package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DeleteSweepIcon extends SVGIcon {

    public DeleteSweepIcon() {
        super(DEFAULT_SIZE * 1.5, DEFAULT_SIZE);
    }

    public DeleteSweepIcon(double size) {
        super(size * 1.5, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M600 826v-60h145v60H600Zm0-368v-60h280v60H600Zm0 184v-60h235v60H600ZM125 " +
                "381H80v-60h170v-45h135v45h170v60h-45v415q0 24-18 42t-42 18H185q-24 0-42-18t-18-42V381Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "delete-sweep-icon";
    }
}
