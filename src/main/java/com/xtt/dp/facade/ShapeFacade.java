package com.xtt.dp.facade;

import com.xtt.dp.facade.complex.Circle;
import com.xtt.dp.facade.complex.IShape;
import com.xtt.dp.facade.complex.Rectangle;
import com.xtt.dp.facade.complex.Square;

/**
 * 图形外观类
 * Created by zhaoteng on 2017/7/30.
 */
public class ShapeFacade {

    private IShape rectangle;
    private IShape square;
    private IShape circle;

    public ShapeFacade(){
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquar(){
        square.draw();
    }

    public void drawCircle(){
        circle.draw();
    }


}
