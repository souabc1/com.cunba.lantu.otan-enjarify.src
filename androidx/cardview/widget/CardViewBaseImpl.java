package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;

class CardViewBaseImpl
  implements CardViewImpl
{
  public final RectF OooO00o;
  
  public CardViewBaseImpl()
  {
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>();
    this.OooO00o = localRectF;
  }
  
  public void OooO(CardViewDelegate paramCardViewDelegate)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    OooOOo0(paramCardViewDelegate).OooO0o(localRect);
    int i = (int)Math.ceil(OooOO0o(paramCardViewDelegate));
    int j = (int)Math.ceil(OooOO0O(paramCardViewDelegate));
    paramCardViewDelegate.setMinWidthHeightInternal(i, j);
    i = localRect.left;
    j = localRect.top;
    int k = localRect.right;
    int m = localRect.bottom;
    paramCardViewDelegate.setShadowPadding(i, j, k, m);
  }
  
  public void OooO00o(CardViewDelegate paramCardViewDelegate, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramContext = OooOOOo(paramContext, paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
    boolean bool = paramCardViewDelegate.getPreventCornerOverlap();
    paramContext.setAddPaddingForCorners(bool);
    paramCardViewDelegate.setCardBackground(paramContext);
    OooO(paramCardViewDelegate);
  }
  
  public void OooO0O0(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    OooOOo0(paramCardViewDelegate).setCornerRadius(paramFloat);
    OooO(paramCardViewDelegate);
  }
  
  public float OooO0OO(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOo0(paramCardViewDelegate).getShadowSize();
  }
  
  public float OooO0Oo(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOo0(paramCardViewDelegate).getCornerRadius();
  }
  
  public void OooO0o(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    OooOOo0(paramCardViewDelegate).setShadowSize(paramFloat);
  }
  
  public void OooO0o0(CardViewDelegate paramCardViewDelegate) {}
  
  public float OooO0oO(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOo0(paramCardViewDelegate).getMaxShadowSize();
  }
  
  public ColorStateList OooO0oo(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOo0(paramCardViewDelegate).getColor();
  }
  
  public void OooOO0()
  {
    CardViewBaseImpl.1 local1 = new androidx/cardview/widget/CardViewBaseImpl$1;
    local1.<init>(this);
    RoundRectDrawableWithShadow.OooOOo = local1;
  }
  
  public float OooOO0O(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOo0(paramCardViewDelegate).getMinHeight();
  }
  
  public float OooOO0o(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOo0(paramCardViewDelegate).getMinWidth();
  }
  
  public void OooOOO(CardViewDelegate paramCardViewDelegate, ColorStateList paramColorStateList)
  {
    OooOOo0(paramCardViewDelegate).setColor(paramColorStateList);
  }
  
  public void OooOOO0(CardViewDelegate paramCardViewDelegate)
  {
    RoundRectDrawableWithShadow localRoundRectDrawableWithShadow = OooOOo0(paramCardViewDelegate);
    boolean bool = paramCardViewDelegate.getPreventCornerOverlap();
    localRoundRectDrawableWithShadow.setAddPaddingForCorners(bool);
    OooO(paramCardViewDelegate);
  }
  
  public void OooOOOO(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    OooOOo0(paramCardViewDelegate).setMaxShadowSize(paramFloat);
    OooO(paramCardViewDelegate);
  }
  
  public final RoundRectDrawableWithShadow OooOOOo(Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    RoundRectDrawableWithShadow localRoundRectDrawableWithShadow = new androidx/cardview/widget/RoundRectDrawableWithShadow;
    Resources localResources = paramContext.getResources();
    localRoundRectDrawableWithShadow.<init>(localResources, paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
    return localRoundRectDrawableWithShadow;
  }
  
  public final RoundRectDrawableWithShadow OooOOo0(CardViewDelegate paramCardViewDelegate)
  {
    return (RoundRectDrawableWithShadow)paramCardViewDelegate.getCardBackground();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cardview.widget.CardViewBaseImpl
 * JD-Core Version:    0.7.0.1
 */