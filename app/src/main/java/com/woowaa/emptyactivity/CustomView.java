package com.woowaa.emptyactivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    private static final int SQUARE_SIZE = 100;
    private Rect mRectSquare;
    private Paint mPaintSquare;




    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs)
    {
        mRectSquare = new Rect();
        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);

    }

    public  void SwapColor(){
        mPaintSquare.setColor(mPaintSquare.getColor() == Color.GREEN ? Color.RED : Color.GREEN);

        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {



        mRectSquare.left = 10;
        mRectSquare.top  = 10;
        mRectSquare.right = mRectSquare.left + SQUARE_SIZE;
        mRectSquare.bottom = mRectSquare.top + SQUARE_SIZE;


        mPaintSquare.setColor(Color.GREEN);

        canvas.drawRect(mRectSquare,mPaintSquare);
        mPaintSquare.setColor(Color.RED);
        canvas.drawText("hello", 10, 10, mPaintSquare);
    }
}
