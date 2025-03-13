package com.google.android.material.internal;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;

class WindowUtils$Api17Impl
{
  public static Rect getCurrentWindowBounds(WindowManager paramWindowManager)
  {
    paramWindowManager = paramWindowManager.getDefaultDisplay();
    Point localPoint = new android/graphics/Point;
    localPoint.<init>();
    paramWindowManager.getRealSize(localPoint);
    paramWindowManager = new android/graphics/Rect;
    paramWindowManager.<init>();
    int i = localPoint.x;
    paramWindowManager.right = i;
    int j = localPoint.y;
    paramWindowManager.bottom = j;
    return paramWindowManager;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.WindowUtils.Api17Impl
 * JD-Core Version:    0.7.0.1
 */