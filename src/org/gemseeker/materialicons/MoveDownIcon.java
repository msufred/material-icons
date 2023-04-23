package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MoveDownIcon extends SVGIcon {

    public MoveDownIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public MoveDownIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m280 936-43-43 86-86q-108 7-195.5-70.5T40 536q0-117 81.5-198.5T320 256h120v60H320q-91 0-155.5 " +
                "64.5T100 536q0 94 65.5 154T326 748l-89-89 43-43 160 160-160 160Zm240-40V616h360v280H520Zm0-" +
                "360V256h360v280H520Zm60-60h240V316H580v160Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "move-down-icon";
    }
}
