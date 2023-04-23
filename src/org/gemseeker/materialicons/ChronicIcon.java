package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ChronicIcon extends SVGIcon {

    public ChronicIcon() {
        super();
    }

    public ChronicIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M363 888q-122-26-202.5-124T80 536q0-150 105-255t255-105q150 0 255 105t105 255q0 43-9.737 " +
                "83.5T763 696H518q-66 0-112 47t-46 113q0 8 .5 16t2.5 16Zm157-230 42-42-92-92V346h-60v202l110 110Zm0 " +
                "298h240q42 0 71-29t29-71q0-42-29-71t-71-29H520q-42 0-71 29t-29 71q0 42 29 71t71 29Zm-.175-70Q507 886 " +
                "498.5 877.325q-8.5-8.676-8.5-21.5 0-12.825 8.675-21.325 8.676-8.5 21.5-8.5 12.825 0 21.325 8.675 8.5 " +
                "8.676 8.5 21.5 0 12.825-8.675 21.325-8.676 8.5-21.5 8.5Zm120 0Q627 886 618.5 877.325q-8.5-8.676-8.5-21.5 " +
                "0-12.825 8.675-21.325 8.676-8.5 21.5-8.5 12.825 0 21.325 8.675 8.5 8.676 8.5 21.5 0 12.825-8.675 " +
                "21.325-8.676 8.5-21.5 8.5Zm120 0Q747 886 738.5 877.325q-8.5-8.676-8.5-21.5 0-12.825 8.675-21.325 " +
                "8.676-8.5 21.5-8.5 12.825 0 21.325 8.675 8.5 8.676 8.5 21.5 0 12.825-8.675 21.325-8.676 8.5-21.5 8.5Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "chronic-icon";
    }
}
