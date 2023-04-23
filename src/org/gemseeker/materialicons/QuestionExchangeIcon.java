package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class QuestionExchangeIcon extends SVGIcon {

    public QuestionExchangeIcon() {
        super();
    }

    public QuestionExchangeIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 1016q-112 0-216-66T100 799v137H40V696h240v60H143q51 77 145.5 138.5T480 956q78 0 " +
                "147.5-30t121-81.5Q800 793 830 723.5T860 576h60q0 91-34.5 171T791 887q-60 60-140 94.5T480 1016ZM40 " +
                "576q0-91 34.5-171T169 265q60-60 140-94.5T480 136q112 0 216 66t164 151V216h60v240H680v-60h137q-51-" +
                "77-145-138.5T480 196q-78 0-147.5 30t-121 81.5Q160 359 130 428.5T100 576H40Zm437 234q16 0 27-11t11" +
                "-27q0-16-11-27t-27-11q-16 0-27 11t-11 27q0 16 11 27t27 11Zm-33-148h57q0-31 10-50.5t35-44.5q33-33 " +
                "46-58.5t13-53.5q0-52-36-83.5T479 340q-49 0-86 23.5T338 432l53 22q13-26 36-41.5t52-15.5q29 0 49 " +
                "16t20 44q0 20-11 38.5T500 539q-37 35-46.5 60t-9.5 63Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "question-exchange-icon";
    }
}
