package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SortByAlphaIcon extends SVGIcon {

    public SortByAlphaIcon() {
        super(DEFAULT_SIZE * 1.5);
    }

    public SortByAlphaIcon(double size) {
        super(size * 1.5);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m80 776 162-400h63l161 400h-63l-38-99H181l-38 99H80Zm121-151h144l-70-185h-4l-70 185Zm347 " +
                "151v-62l233-286H566v-52h272v63L607 724h233v52H548ZM384 272l96-96 96 96H384Zm96 704-96-96h192l-96 96Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "sort-by-alpha-icon";
    }
}
