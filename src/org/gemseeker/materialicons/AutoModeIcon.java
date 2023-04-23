package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AutoModeIcon extends SVGIcon {

    public AutoModeIcon() {
        super();
    }

    public AutoModeIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m480 751-54-121-121-54 121-55 54-121 55 121 121 55-121 54-55 121Zm7 265q-121 0-221-56.5T100 " +
                "799v136H40V696h238v60H144q57 95 147 147.5T487 956q121 0 218-70.5T840 700l59 13q-43 136-156.5 219.5T487 " +
                "1016ZM42 536q7-68 32-128.5T142 295l43 43q-35 45-56 95t-27 103H42Zm199-254-42-44q54-44 115-69t128-" +
                "31v60q-52 5-101 25.5T241 282Zm478 0q-45-36-95-57.5T520 198v-60q68 6 128.5 31T761 238l-42 44Zm139 " +
                "254q-5-51-28-103t-59-97l42-44q46 54 73 116.5T918 536h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "auto-mode-icon";
    }
}
