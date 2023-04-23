package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RepartitionIcon extends SVGIcon {

    public RepartitionIcon() {
        super();
    }

    public RepartitionIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 656v-60h560q42 0 71-29t29-71q0-42-29-71t-71-29H199l74 73-43 43L84 366l146-146 43 42-74 " +
                "74h481q66 0 113 47t47 113q0 66-47 113t-113 47H120Zm0 320V736h720v240H120Zm60-60h163V796H180v120Zm223 " +
                "0h153V796H403v120Zm214 0h163V796H617v120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "repartition-icon";
    }
}
