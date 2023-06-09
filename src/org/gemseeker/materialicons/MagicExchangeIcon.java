package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MagicExchangeIcon extends SVGIcon {

    public MagicExchangeIcon() {
        super();
    }

    public MagicExchangeIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 1016q-112 0-216-66T100 799v137H40V696h240v60H143q51 77 145.5 138.5T480 956q78 0 " +
                "147.5-30t121-81.5Q800 793 830 723.5T860 576h60q0 91-34.5 171T791 887q-60 60-140 94.5T480 1016ZM40 " +
                "576q0-91 34.5-171T169 265q60-60 140-94.5T480 136q112 0 216 66t164 151V216h60v240H680v-60h137q-51-77-" +
                "145-138.5T480 196q-78 0-147.5 30t-121 81.5Q160 359 130 428.5T100 576H40Zm440 175-54-121-121-54 121-55 " +
                "54-121 55 121 121 55-121 54-55 121Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "magic-exchange-icon";
    }
}
