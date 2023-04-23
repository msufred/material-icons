package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class PreliminaryIcon extends SVGIcon {

    public PreliminaryIcon() {
        super();
    }

    public PreliminaryIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M360.175 766q12.825 0 21.325-8.675 8.5-8.676 8.5-21.5 0-12.825-8.675-21.325-8.676-8.5-21.5-8.5-12.825 " +
                "0-21.325 8.675-8.5 8.676-8.5 21.5 0 12.825 8.675 21.325 8.676 8.5 21.5 8.5Zm120 0q12.825 0 " +
                "21.325-8.675 8.5-8.676 8.5-21.5 0-12.825-8.675-21.325-8.676-8.5-21.5-8.5-12.825 0-21.325 " +
                "8.675-8.5 8.676-8.5 21.5 0 12.825 8.675 21.325 8.676 8.5 21.5 8.5Zm120 0q12.825 0 " +
                "21.325-8.675 8.5-8.676 8.5-21.5 0-12.825-8.675-21.325-8.676-8.5-21.5-8.5-12.825 " +
                "0-21.325 8.675-8.5 8.676-8.5 21.5 0 12.825 8.675 21.325 8.676 8.5 21.5 8.5ZM438 " +
                "642l212-212-43-43-169.333 170L353 472l-43 42 128 128Zm42.266 334q-82.734 " +
                "0-155.5-31.5t-127.266-86q-54.5-54.5-86-127.341Q80 658.319 80 575.5q0-82.819 " +
                "31.5-155.659Q143 347 197.5 293t127.341-85.5Q397.681 176 480.5 176q82.819 0 " +
                "155.659 31.5Q709 239 763 293t85.5 127Q880 493 880 575.734q0 82.734-31.5 155.5T763 " +
                "858.316q-54 54.316-127 86Q563 976 480.266 976Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "preliminary-icon";
    }
}
