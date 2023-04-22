package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AddCircleIcon extends SVGIcon {

    public AddCircleIcon() {
        super();
    }

    public AddCircleIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M453 776h60V610h167v-60H513V376h-60v174H280v60h173v166Zm27.266 200q-82.734 " +
                "0-155.5-31.5t-127.266-86q-54.5-54.5-86-127.341Q80 658.319 80 575.5q0-82.819 31.5-155.659Q143 " +
                "347 197.5 293t127.341-85.5Q397.681 176 480.5 176q82.819 0 155.659 31.5Q709 239 763 293t85.5 " +
                "127Q880 493 880 575.734q0 82.734-31.5 155.5T763 858.316q-54 54.316-127 86Q563 976 480.266 976Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-circle-icon";
    }
}