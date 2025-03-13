package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Paint;
import android.graphics.Path;
import m54207b69;

class LinePath
{
  public final Paint OooO00o;
  public final Path OooO0O0;
  
  public LinePath(Path paramPath, Paint paramPaint)
  {
    Paint localPaint = new android/graphics/Paint;
    localPaint.<init>(paramPaint);
    this.OooO00o = localPaint;
    paramPaint = new android/graphics/Path;
    paramPaint.<init>(paramPath);
    this.OooO0O0 = paramPaint;
  }
  
  public Paint getDrawPaint()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Paint)m54207b69.F54207b69_09(3919, arrayOfObject);
  }
  
  public Path getDrawPath()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Path)m54207b69.F54207b69_09(3920, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.edit.LinePath
 * JD-Core Version:    0.7.0.1
 */