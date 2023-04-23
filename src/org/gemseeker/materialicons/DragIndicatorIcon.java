package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DragIndicatorIcon extends SVGIcon {

    public DragIndicatorIcon() {
        super(DEFAULT_SIZE * 0.65, DEFAULT_SIZE);
    }

    public DragIndicatorIcon(double size) {
        super(size * 0.65, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M358.411 896Q326 896 303 872.708t-23-56Q280 784 303.232 761q23.233-23 55.857-23Q391 " +
                "738 414.5 761.292t23.5 56Q438 850 414.411 873q-23.588 23-56 23Zm241 0Q567 896 544 " +
                "872.708t-23-56Q521 784 544.232 761t55.857-23Q632 738 655.5 761.292t23.5 56Q679 850 " +
                "655.411 873q-23.588 23-56 23Zm-241-241Q326 655 303 632.911q-23-22.088-23-57 0-32.624 " +
                "23.232-55.767Q326.465 497 359.089 497 391 497 414.5 520.232t23.5 55.857Q438 611 414.411 " +
                "633q-23.588 22-56 22Zm241 0Q567 655 544 632.911q-23-22.088-23-57 0-32.624 23.232-55.767Q567.464 " +
                "497 600.089 497 632 497 655.5 520.232t23.5 55.857Q679 611 655.411 633q-23.588 22-56 " +
                "22Zm-241-241Q326 414 303 390.708t-23-56Q280 302 303.232 279q23.233-23 55.857-23Q391 " +
                "256 414.5 279.292t23.5 56Q438 368 414.411 391q-23.588 23-56 23Zm241 0Q567 414 544 " +
                "390.708t-23-56Q521 302 544.232 279t55.857-23Q632 256 655.5 279.292t23.5 56Q679 368 " +
                "655.411 391q-23.588 23-56 23Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "drag-indicator-icon";
    }
}
