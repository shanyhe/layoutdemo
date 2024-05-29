package com.example.layoutdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.RectF;
public class TouchChangeView extends View{
    public float mX;
    public float mY;
    public TouchChangeView(Context context) {
        super(context);
        mX = 0;
        mY = 200;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.example_appwidget_preview);
        canvas.drawBitmap(bitmap, mX, mY, paint);
        paint.setColor(0xFFFF0000);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(new RectF(mX - 2, mY - 2, mX + bitmap.getWidth() + 4, mY + bitmap.getHeight() + 4), paint);
        if (bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }
}
