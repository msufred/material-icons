package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class StepIntoIcon extends SVGIcon {

    public StepIntoIcon() {
        super(DEFAULT_SIZE * 0.55, DEFAULT_SIZE * 1.25);
    }

    public StepIntoIcon(double size) {
        super(size * 0.55, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M479.882 976Q434 976 402 943.882q-32-32.117-32-78Q370 820 402.118 788q32.117-32 78-32Q526 756 " +
                "558 788.118q32 32.117 32 78Q590 912 557.882 944q-32.117 32-78 32ZM480 646 294 460l42-42 114 " +
                "113V177h60v354l113-113 43 42-186 186Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "step-into-icon";
    }
}
