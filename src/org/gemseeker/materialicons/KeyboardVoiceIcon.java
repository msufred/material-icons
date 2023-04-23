package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyboardVoiceIcon extends SVGIcon {

    public KeyboardVoiceIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 1.25);
    }

    public KeyboardVoiceIcon(double size) {
        super(size * 0.85, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 633q-43 0-72-30.917-29-30.916-29-75.083V276q0-41.667 29.441-70.833Q437.882 176 " +
                "479.941 176t71.559 29.167Q581 234.333 581 276v251q0 44.167-29 75.083Q523 633 480 633Zm-30 " +
                "303V800q-106-11-178-89t-72-184h60q0 91 64.288 153t155.5 62Q571 742 635.5 680 700 618 700 " +
                "527h60q0 106-72 184t-178 89v136h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "keyboard-voice-icon";
    }

}
