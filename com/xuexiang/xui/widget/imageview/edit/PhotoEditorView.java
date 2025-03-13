package com.xuexiang.xui.widget.imageview.edit;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import m54207b69;

public class PhotoEditorView
  extends RelativeLayout
{
  public FilterImageView o00OoOoo;
  public ImageFilterView o00Ooo0;
  public BrushDrawingView o00Ooo00;
  
  public BrushDrawingView getBrushDrawingView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (BrushDrawingView)m54207b69.F54207b69_09(3981, arrayOfObject);
  }
  
  public ImageView getSource()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ImageView)m54207b69.F54207b69_09(3982, arrayOfObject);
  }
  
  public void setFilterEffect(CustomEffect paramCustomEffect)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCustomEffect;
    m54207b69.F54207b69_00(3983, arrayOfObject);
  }
  
  public void setFilterEffect(PhotoFilter paramPhotoFilter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPhotoFilter;
    m54207b69.F54207b69_00(3984, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.edit.PhotoEditorView
 * JD-Core Version:    0.7.0.1
 */