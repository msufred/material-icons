package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MoveUpIcon extends SVGIcon {

    public MoveUpIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public MoveUpIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M320 907q-117 0-198.5-81.5T40 627q0-123 87.5-200.5T323 356l-86-86 43-43 160 160-160 160-43-43 " +
                "89-89q-95-2-160.5 58T100 627q0 91.3 64.35 155.65Q228.7 847 320 847h120v60H320Zm200-360V267h360v280H520Zm0 " +
                "360V627h360v280H520Zm60-60h240V687H580v160Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "move-up-icon";
    }
}
