package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DatasetLinkedIcon extends SVGIcon {

    public DatasetLinkedIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public DatasetLinkedIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 896q-24 0-42-18t-18-42V236q0-24 18-42t42-18h600q24 0 42 18t18 42v302q-8-1-14.5-1.5T811 " +
                "536H560q-40 0-77 13.5T414 586H290v140h26q-3 12-4.5 24.5T310 776q0 30 8.5 62t23.5 58H180Zm110-410h14" +
                "0V346H290v140Zm270 450q-66 0-113-47t-47-113q0-66 46.5-113T560 616h70v60h-70q-42 0-71 29t-29 71q0 42 " +
                "29 71t71 29h81v60h-81Zm-30-450h140V346H530v140Zm30 320v-60h240v60H560Zm160 130v-60h80q42 0 71-29t29-" +
                "71q0-42-29-71t-71-29h-70v-60h70q66 0 113 46.5T960 776q0 66-47 113t-113 47h-80Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "dataset-linked-icon";
    }
}
