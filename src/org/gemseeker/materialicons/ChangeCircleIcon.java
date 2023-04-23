package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ChangeCircleIcon extends SVGIcon {

    public ChangeCircleIcon() {
        super();
    }

    public ChangeCircleIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m482 856 114-113-114-113-42 42 43 43q-28 1-54.5-9T381 675q-20-20-30.5-46T340 577q0-17 " +
                "4.5-34t12.5-33l-44-44q-17 25-25 53t-8 57q0 38 15 75t44 66q29 29 65 43.5t74 15.5l-38 38 42 " +
                "42Zm165-170q17-25 25-53t8-57q0-38-14.5-75.5T622 434q-29-29-65.5-43T482 377l38-39-42-42-114 " +
                "113 114 113 42-42-44-44q27 0 55 10.5t48 30.5q20 20 30.5 46t10.5 52q0 17-4.5 34T603 642l44 " +
                "44ZM480 976q-82 0-155-31.5t-127.5-86Q143 804 111.5 731T80 576q0-83 31.5-156t86-127Q252 239 " +
                "325 207.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 82-31.5 155T763 858.5q-54 " +
                "54.5-127 86T480 976Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "change-circle-icon";
    }
}
