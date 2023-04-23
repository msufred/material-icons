package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CycleIcon extends SVGIcon {

    public CycleIcon() {
        super();
    }

    public CycleIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M352 876q-119-40-196-143T79 496q0-32 5-64t16-63l-64 37-30-51 173-100 100 172-52 30-58-99q-14 " +
                "33-21.5 68t-7.5 71q0 116 68.5 205T383 823l-31 53Zm288-520v-60h115q-48-66-120.5-103T480 156q-69 0-128.5 " +
                "25T246 250l-31-54q54-47 121-73.5T479 96q88 0 166 35.5T780 232v-76h60v200H640Zm-45 620L422 876l100-172 " +
                "51 30-58 101q130-13 217.5-109.5T820 497q0-21-2.5-41t-7.5-40h62q4 20 6 40t2 40q0 143-89.5 253T562 888l63 " +
                "37-30 51Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "cycle-icon";
    }
}
