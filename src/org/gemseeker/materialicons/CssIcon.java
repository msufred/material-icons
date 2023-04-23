package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CssIcon extends SVGIcon {

    public CssIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.45);
    }

    public CssIcon(double size) {
        super(size * 1.25, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M414 696q-15 0-24.5-9.5T380 662v-46h48v32h104v-53H414q-14 0-24-10t-10-24v-71q0-15 9.5-24.5T414 " +
                "456h132q15 0 24.5 9.5T580 490v46h-48v-32H428v53h118q14 0 24 10t10 24v71q0 15-9.5 24.5T546 696H414Zm260 " +
                "0q-15 0-24.5-9.5T640 662v-46h48v32h104v-53H674q-14 0-24-10t-10-24v-71q0-15 9.5-24.5T674 456h132q15 0 " +
                "24.5 9.5T840 490v46h-48v-32H688v53h118q14 0 24 10t10 24v71q0 15-9.5 24.5T806 696H674Zm-520 0q-15 " +
                "0-24.5-9.5T120 662V490q0-15 9.5-24.5T154 456h132q15 0 24.5 9.5T320 490v46h-48v-32H168v144h104v-" +
                "32h48v46q0 15-9.5 24.5T286 696H154Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "css-icon";
    }
}
