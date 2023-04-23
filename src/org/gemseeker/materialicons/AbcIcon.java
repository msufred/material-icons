package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AbcIcon extends SVGIcon {

    public AbcIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.45);
    }

    public AbcIcon(double size) {
        super(size * 1.25, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M667 696q-15 0-24.5-9.5T633 662V490q0-15 9.5-24.5T667 456h139q15 0 24.5 9.5T840 " +
                "490v46h-48v-32H681v144h111v-32h48v46q0 15-9.5 24.5T806 696H667Zm-287 0V456h173q15 0 24.5 9.5T587 " +
                "490v52q0 15-9.5 24.5T553 576q15 0 24.5 9.5T587 610v52q0 15-9.5 24.5T553 696H380Zm48-144h111v-" +
                "48H428v48Zm0 96h111v-48H428v48Zm-308 48V490q0-15 9.5-24.5T154 456h139q15 0 24.5 9.5T327 " +
                "490v206h-48v-77H168v77h-48Zm48-125h111v-67H168v67Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "abc-icon";
    }
}
