package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class JavascriptIcon extends SVGIcon {

    public JavascriptIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 0.45);
    }

    public JavascriptIcon(double size) {
        super(size * 0.85, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M274 696q-15 0-24.5-9.5T240 662v-66h48v52h84V456h48v206q0 15-9.5 24.5T386 696H274Zm240 " +
                "0q-15 0-24.5-9.5T480 662v-46h48v32h104v-53H514q-14 0-24-10t-10-24v-71q0-15 9.5-24.5T514 456h132q15 " +
                "0 24.5 9.5T680 490v46h-48v-32H528v53h118q14 0 24 10t10 24v71q0 15-9.5 24.5T646 696H514Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "javascript-icon";
    }
}
