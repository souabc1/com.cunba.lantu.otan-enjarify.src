package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

class CardView$1
  implements CardViewDelegate
{
  public Drawable OooO00o;
  
  public CardView$1(CardView paramCardView) {}
  
  public Drawable getCardBackground()
  {
    return this.OooO00o;
  }
  
  public View getCardView()
  {
    return this.OooO0O0;
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.OooO0O0.getPreventCornerOverlap();
  }
  
  public boolean getUseCompatPadding()
  {
    return this.OooO0O0.getUseCompatPadding();
  }
  
  public void setCardBackground(Drawable paramDrawable)
  {
    this.OooO00o = paramDrawable;
    this.OooO0O0.setBackgroundDrawable(paramDrawable);
  }
  
  public void setMinWidthHeightInternal(int paramInt1, int paramInt2)
  {
    CardView localCardView1 = this.OooO0O0;
    int i = localCardView1.mUserSetMinWidth;
    if (paramInt1 > i) {
      CardView.access$101(localCardView1, paramInt1);
    }
    CardView localCardView2 = this.OooO0O0;
    int j = localCardView2.mUserSetMinHeight;
    if (paramInt2 > j) {
      CardView.access$201(localCardView2, paramInt2);
    }
  }
  
  public void setShadowPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.OooO0O0.mShadowBounds.set(paramInt1, paramInt2, paramInt3, paramInt4);
    CardView localCardView = this.OooO0O0;
    Rect localRect = localCardView.mContentPadding;
    int i = localRect.left;
    paramInt1 += i;
    i = localRect.top;
    paramInt2 += i;
    i = localRect.right;
    paramInt3 += i;
    int j = localRect.bottom;
    paramInt4 += j;
    CardView.access$001(localCardView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cardview.widget.CardView.1
 * JD-Core Version:    0.7.0.1
 */