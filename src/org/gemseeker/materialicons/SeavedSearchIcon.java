package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SeavedSearchIcon extends SVGIcon {

    public SeavedSearchIcon() {
        super();
    }

    public SeavedSearchIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M796 935 533 672q-30 26-70 40.5T378 727q-108 0-183-75t-75-181q0-106 75-181t182-75q106 0 " +
                "180.5 75T632 471q0 43-14 83t-42 75l264 262-44 44ZM377 667q81 0 138-57.5T572 471q0-81-57-138.5T377 " +
                "275q-82 0-139.5 57.5T180 471q0 81 57.5 138.5T377 667Zm-74-89 29-87-73-56h87l30-87 30 87h86l-73 " +
                "56 29 87-72-55-73 55Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "saved-search-icon";
    }

}
