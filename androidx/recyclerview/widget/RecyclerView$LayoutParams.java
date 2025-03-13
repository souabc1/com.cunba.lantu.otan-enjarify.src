package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class RecyclerView$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public RecyclerView.ViewHolder OooO00o;
  public final Rect OooO0O0;
  public boolean OooO0OO;
  public boolean OooO0Oo;
  
  public RecyclerView$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooO0O0 = localRect;
    this.OooO0OO = true;
    this.OooO0Oo = false;
  }
  
  public RecyclerView$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = new android/graphics/Rect;
    paramContext.<init>();
    this.OooO0O0 = paramContext;
    this.OooO0OO = true;
    this.OooO0Oo = false;
  }
  
  public RecyclerView$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    paramLayoutParams = new android/graphics/Rect;
    paramLayoutParams.<init>();
    this.OooO0O0 = paramLayoutParams;
    this.OooO0OO = true;
    this.OooO0Oo = false;
  }
  
  public RecyclerView$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    paramMarginLayoutParams = new android/graphics/Rect;
    paramMarginLayoutParams.<init>();
    this.OooO0O0 = paramMarginLayoutParams;
    this.OooO0OO = true;
    this.OooO0Oo = false;
  }
  
  public RecyclerView$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    paramLayoutParams = new android/graphics/Rect;
    paramLayoutParams.<init>();
    this.OooO0O0 = paramLayoutParams;
    this.OooO0OO = true;
    this.OooO0Oo = false;
  }
  
  public int getAbsoluteAdapterPosition()
  {
    return this.OooO00o.getAbsoluteAdapterPosition();
  }
  
  public int getBindingAdapterPosition()
  {
    return this.OooO00o.getBindingAdapterPosition();
  }
  
  public int getViewAdapterPosition()
  {
    return this.OooO00o.getBindingAdapterPosition();
  }
  
  public int getViewLayoutPosition()
  {
    return this.OooO00o.getLayoutPosition();
  }
  
  public int getViewPosition()
  {
    return this.OooO00o.getPosition();
  }
  
  public boolean isItemChanged()
  {
    return this.OooO00o.isUpdated();
  }
  
  public boolean isItemRemoved()
  {
    return this.OooO00o.isRemoved();
  }
  
  public boolean isViewInvalid()
  {
    return this.OooO00o.isInvalid();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.LayoutParams
 * JD-Core Version:    0.7.0.1
 */