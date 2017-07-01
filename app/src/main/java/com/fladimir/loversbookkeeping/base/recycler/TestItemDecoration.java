package com.fladimir.loversbookkeeping.base.recycler;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by NingJiang on 2017/5/31.
 * Class Note:
 */

public class TestItemDecoration extends RecyclerView.ItemDecoration {
    private float mDividerHeight;
    private Paint mPaint;

    public TestItemDecoration() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLUE);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.getChildAdapterPosition(view) != 0) {
            outRect.top = 1;
            mDividerHeight = 1;
        }
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = parent.getChildAt(i);
            int index = parent.getChildAdapterPosition(view);
            if (index == 0)
                continue;
            float dividerTop = view.getTop() - mDividerHeight;
            float dividerLeft = parent.getPaddingLeft();
            float dividerBottom = view.getTop();
            float dividerRight = parent.getWidth() - parent.getPaddingRight();
            c.drawRect(dividerLeft, dividerTop, dividerRight, dividerBottom, mPaint);
        }
    }
}
