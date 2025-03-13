package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public abstract class VirtualLayout
  extends ConstraintHelper
{
  public boolean o00OoooO;
  public boolean o0O00o0;
  
  public VirtualLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void OooOO0(ConstraintLayout paramConstraintLayout)
  {
    OooO(paramConstraintLayout);
  }
  
  public void OooOOOO(AttributeSet paramAttributeSet)
  {
    super.OooOOOO(paramAttributeSet);
    if (paramAttributeSet != null)
    {
      Context localContext = getContext();
      int[] arrayOfInt = R.styleable.ConstraintLayout_Layout;
      paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
      int i = paramAttributeSet.getIndexCount();
      int j = 0;
      arrayOfInt = null;
      while (j < i)
      {
        int k = paramAttributeSet.getIndex(j);
        int m = R.styleable.ConstraintLayout_Layout_android_visibility;
        boolean bool = true;
        if (k == m)
        {
          this.o0O00o0 = bool;
        }
        else
        {
          m = R.styleable.ConstraintLayout_Layout_android_elevation;
          if (k == m) {
            this.o00OoooO = bool;
          }
        }
        j += 1;
      }
      paramAttributeSet.recycle();
    }
  }
  
  public void OooOo(androidx.constraintlayout.core.widgets.VirtualLayout paramVirtualLayout, int paramInt1, int paramInt2) {}
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    boolean bool1 = this.o0O00o0;
    if (!bool1)
    {
      bool1 = this.o00OoooO;
      if (!bool1) {}
    }
    else
    {
      Object localObject = getParent();
      boolean bool2 = localObject instanceof ConstraintLayout;
      if (bool2)
      {
        localObject = (ConstraintLayout)localObject;
        int i = getVisibility();
        float f1 = getElevation();
        int j = 0;
        for (;;)
        {
          int k = this.o00Ooo00;
          if (j >= k) {
            break;
          }
          k = this.o00OoOoo[j];
          View localView = ((ConstraintLayout)localObject).getViewById(k);
          if (localView != null)
          {
            boolean bool3 = this.o0O00o0;
            if (bool3) {
              localView.setVisibility(i);
            }
            bool3 = this.o00OoooO;
            if (bool3)
            {
              float f2 = 0.0F;
              bool3 = f1 < 0.0F;
              if (bool3)
              {
                f2 = localView.getTranslationZ() + f1;
                localView.setTranslationZ(f2);
              }
            }
          }
          j += 1;
        }
      }
    }
  }
  
  public void setElevation(float paramFloat)
  {
    super.setElevation(paramFloat);
    OooO0oo();
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    OooO0oo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.VirtualLayout
 * JD-Core Version:    0.7.0.1
 */