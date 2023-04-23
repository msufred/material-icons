package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class HtmlIcon extends SVGIcon {

    public HtmlIcon() {
        super(DEFAULT_SIZE * 1.65, DEFAULT_SIZE * 0.45);
    }

    public HtmlIcon(double size) {
        super(size * 1.65, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M0 696V456h48v89h108v-89h48v240h-48V593H48v103H0Zm316 0V504h-70v-48h188v48h-70v192h-48Zm160 " +
                "0V490q0-15 9.5-24.5T510 456h200q15 0 24.5 9.5T744 490v206h-48V504h-62v150h-48V504h-62v192h-48Zm326 " +
                "0V456h48v192h110v48H802Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "html-icon";
    }
}
