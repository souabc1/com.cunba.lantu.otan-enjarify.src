package com.xuexiang.xui.widget.textview.marqueen;

import android.view.View;
import java.util.List;
import m54207b69;

public abstract class MarqueeFactory
{
  public MarqueeFactory.OnItemClickListener OooO00o;
  public List OooO0O0;
  public List OooO0OO;
  public boolean OooO0Oo;
  public MarqueeView OooO0o0;
  
  public abstract View OooO00o(Object paramObject);
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6404, arrayOfObject);
  }
  
  public List getMarqueeViews()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (List)m54207b69.F54207b69_09(6405, arrayOfObject);
  }
  
  public void setAttachedToMarqueeView(MarqueeView paramMarqueeView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMarqueeView;
    m54207b69.F54207b69_00(6406, arrayOfObject);
  }
  
  public void setData(List paramList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramList;
    m54207b69.F54207b69_00(6407, arrayOfObject);
  }
  
  public void setOnItemClickListener(MarqueeFactory.OnItemClickListener paramOnItemClickListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnItemClickListener;
    m54207b69.F54207b69_00(6408, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.marqueen.MarqueeFactory
 * JD-Core Version:    0.7.0.1
 */