package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SearchCheckIcon extends SVGIcon {

    public SearchCheckIcon() {
        super();
    }

    public SearchCheckIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m358 568-97-96 42-42 54 54 100-100 42 42-141 142Zm438 367L533 672q-30 26-69.959 40.5T378 " +
                "727q-108.162 0-183.081-75Q120 577 120 471t75-181q75-75 181.5-75t181 75Q632 365 632 471.15 632 514 618 " +
                "554q-14 40-42 75l264 262-44 44ZM377 667q81.25 0 138.125-57.5T572 471q0-81-56.875-138.5T377 275q-82.083 " +
                "0-139.542 57.5Q180 390 180 471t57.458 138.5Q294.917 667 377 667Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "search-check-icon";
    }

}
