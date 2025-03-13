package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class CardViewApi21Impl
  implements CardViewImpl
{
  public void OooO(CardViewDelegate paramCardViewDelegate)
  {
    boolean bool1 = paramCardViewDelegate.getUseCompatPadding();
    if (!bool1)
    {
      paramCardViewDelegate.setShadowPadding(0, 0, 0, 0);
      return;
    }
    float f1 = OooO0oO(paramCardViewDelegate);
    float f2 = OooO0Oo(paramCardViewDelegate);
    boolean bool2 = paramCardViewDelegate.getPreventCornerOverlap();
    int j = (int)Math.ceil(RoundRectDrawableWithShadow.OooO0OO(f1, f2, bool2));
    boolean bool3 = paramCardViewDelegate.getPreventCornerOverlap();
    int i = (int)Math.ceil(RoundRectDrawableWithShadow.OooO0Oo(f1, f2, bool3));
    paramCardViewDelegate.setShadowPadding(j, i, j, i);
  }
  
  public void OooO00o(CardViewDelegate paramCardViewDelegate, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramContext = new androidx/cardview/widget/RoundRectDrawable;
    paramContext.<init>(paramColorStateList, paramFloat1);
    paramCardViewDelegate.setCardBackground(paramContext);
    paramContext = paramCardViewDelegate.getCardView();
    paramContext.setClipToOutline(true);
    paramContext.setElevation(paramFloat2);
    OooOOOO(paramCardViewDelegate, paramFloat3);
  }
  
  public void OooO0O0(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    OooOOOo(paramCardViewDelegate).setRadius(paramFloat);
  }
  
  public float OooO0OO(CardViewDelegate paramCardViewDelegate)
  {
    return paramCardViewDelegate.getCardView().getElevation();
  }
  
  public float OooO0Oo(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOOo(paramCardViewDelegate).getRadius();
  }
  
  public void OooO0o(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    paramCardViewDelegate.getCardView().setElevation(paramFloat);
  }
  
  public void OooO0o0(CardViewDelegate paramCardViewDelegate)
  {
    float f = OooO0oO(paramCardViewDelegate);
    OooOOOO(paramCardViewDelegate, f);
  }
  
  public float OooO0oO(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOOo(paramCardViewDelegate).getPadding();
  }
  
  public ColorStateList OooO0oo(CardViewDelegate paramCardViewDelegate)
  {
    return OooOOOo(paramCardViewDelegate).getColor();
  }
  
  public void OooOO0() {}
  
  public float OooOO0O(CardViewDelegate paramCardViewDelegate)
  {
    return OooO0Oo(paramCardViewDelegate) * 2.0F;
  }
  
  public float OooOO0o(CardViewDelegate paramCardViewDelegate)
  {
    return OooO0Oo(paramCardViewDelegate) * 2.0F;
  }
  
  public void OooOOO(CardViewDelegate paramCardViewDelegate, ColorStateList paramColorStateList)
  {
    OooOOOo(paramCardViewDelegate).setColor(paramColorStateList);
  }
  
  public void OooOOO0(CardViewDelegate paramCardViewDelegate)
  {
    float f = OooO0oO(paramCardViewDelegate);
    OooOOOO(paramCardViewDelegate, f);
  }
  
  public void OooOOOO(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    RoundRectDrawable localRoundRectDrawable = OooOOOo(paramCardViewDelegate);
    boolean bool1 = paramCardViewDelegate.getUseCompatPadding();
    boolean bool2 = paramCardViewDelegate.getPreventCornerOverlap();
    localRoundRectDrawable.OooO0O0(paramFloat, bool1, bool2);
    OooO(paramCardViewDelegate);
  }
  
  public final RoundRectDrawable OooOOOo(CardViewDelegate paramCardViewDelegate)
  {
    return (RoundRectDrawable)paramCardViewDelegate.getCardBackground();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cardview.widget.CardViewApi21Impl
 * JD-Core Version:    0.7.0.1
 */