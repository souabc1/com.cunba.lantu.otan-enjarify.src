package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.R.attr;
import androidx.appcompat.app.ActionBar.Tab;

class ScrollingTabContainerView$TabView
  extends LinearLayout
{
  public final int[] o00OoOoo;
  public TextView o00Ooo0;
  public ActionBar.Tab o00Ooo00;
  public ImageView o00Ooo0O;
  public View o00Ooo0o;
  
  public ScrollingTabContainerView$TabView(ScrollingTabContainerView paramScrollingTabContainerView, Context paramContext, ActionBar.Tab paramTab, boolean paramBoolean)
  {
    super(paramContext, null, i);
    i = 16842964;
    paramScrollingTabContainerView = new int[] { i };
    this.o00OoOoo = paramScrollingTabContainerView;
    this.o00Ooo00 = paramTab;
    int j = R.attr.actionBarTabStyle;
    paramScrollingTabContainerView = TintTypedArray.OooOOOO(paramContext, null, paramScrollingTabContainerView, j, 0);
    boolean bool = paramScrollingTabContainerView.OooOO0o(0);
    if (bool)
    {
      paramContext = paramScrollingTabContainerView.getDrawable(0);
      setBackgroundDrawable(paramContext);
    }
    paramScrollingTabContainerView.OooOOOo();
    if (paramBoolean)
    {
      i = 8388627;
      setGravity(i);
    }
    OooO0O0();
  }
  
  public void OooO00o(ActionBar.Tab paramTab)
  {
    this.o00Ooo00 = paramTab;
    OooO0O0();
  }
  
  public void OooO0O0()
  {
    Object localObject1 = this.o00Ooo00;
    Object localObject2 = ((ActionBar.Tab)localObject1).getCustomView();
    int i = 8;
    CharSequence localCharSequence = null;
    if (localObject2 != null)
    {
      localObject1 = ((View)localObject2).getParent();
      if (localObject1 != this)
      {
        if (localObject1 != null)
        {
          localObject1 = (ViewGroup)localObject1;
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
        addView((View)localObject2);
      }
      this.o00Ooo0o = ((View)localObject2);
      localObject1 = this.o00Ooo0;
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(i);
      }
      localObject1 = this.o00Ooo0O;
      if (localObject1 != null)
      {
        ((ImageView)localObject1).setVisibility(i);
        localObject1 = this.o00Ooo0O;
        ((ImageView)localObject1).setImageDrawable(null);
      }
    }
    else
    {
      localObject2 = this.o00Ooo0o;
      if (localObject2 != null)
      {
        removeView((View)localObject2);
        this.o00Ooo0o = null;
      }
      localObject2 = ((ActionBar.Tab)localObject1).getIcon();
      Object localObject3 = ((ActionBar.Tab)localObject1).getText();
      int j = 16;
      int k = -2;
      Object localObject4;
      if (localObject2 != null)
      {
        localObject4 = this.o00Ooo0O;
        if (localObject4 == null)
        {
          localObject4 = new androidx/appcompat/widget/AppCompatImageView;
          Object localObject5 = getContext();
          ((AppCompatImageView)localObject4).<init>((Context)localObject5);
          localObject5 = new android/widget/LinearLayout$LayoutParams;
          ((LinearLayout.LayoutParams)localObject5).<init>(k, k);
          ((LinearLayout.LayoutParams)localObject5).gravity = j;
          ((View)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject5);
          addView((View)localObject4, 0);
          this.o00Ooo0O = ((ImageView)localObject4);
        }
        localObject4 = this.o00Ooo0O;
        ((ImageView)localObject4).setImageDrawable((Drawable)localObject2);
        localObject2 = this.o00Ooo0O;
        ((ImageView)localObject2).setVisibility(0);
      }
      else
      {
        localObject2 = this.o00Ooo0O;
        if (localObject2 != null)
        {
          ((ImageView)localObject2).setVisibility(i);
          localObject2 = this.o00Ooo0O;
          ((ImageView)localObject2).setImageDrawable(null);
        }
      }
      boolean bool = TextUtils.isEmpty((CharSequence)localObject3) ^ true;
      if (bool)
      {
        localObject6 = this.o00Ooo0;
        if (localObject6 == null)
        {
          localObject6 = new androidx/appcompat/widget/AppCompatTextView;
          localObject4 = getContext();
          int m = R.attr.actionBarTabTextStyle;
          ((AppCompatTextView)localObject6).<init>((Context)localObject4, null, m);
          localObject4 = TextUtils.TruncateAt.END;
          ((TextView)localObject6).setEllipsize((TextUtils.TruncateAt)localObject4);
          localObject4 = new android/widget/LinearLayout$LayoutParams;
          ((LinearLayout.LayoutParams)localObject4).<init>(k, k);
          ((LinearLayout.LayoutParams)localObject4).gravity = j;
          ((View)localObject6).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          addView((View)localObject6);
          this.o00Ooo0 = ((TextView)localObject6);
        }
        this.o00Ooo0.setText((CharSequence)localObject3);
        localObject6 = this.o00Ooo0;
        ((View)localObject6).setVisibility(0);
      }
      else
      {
        localObject3 = this.o00Ooo0;
        if (localObject3 != null)
        {
          ((View)localObject3).setVisibility(i);
          localObject6 = this.o00Ooo0;
          ((TextView)localObject6).setText(null);
        }
      }
      Object localObject6 = this.o00Ooo0O;
      if (localObject6 != null)
      {
        localObject3 = ((ActionBar.Tab)localObject1).getContentDescription();
        ((View)localObject6).setContentDescription((CharSequence)localObject3);
      }
      if (!bool) {
        localCharSequence = ((ActionBar.Tab)localObject1).getContentDescription();
      }
      TooltipCompat.OooO00o(this, localCharSequence);
    }
  }
  
  public ActionBar.Tab getTab()
  {
    return this.o00Ooo00;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    ScrollingTabContainerView localScrollingTabContainerView1 = this.o00OooO0;
    paramInt1 = localScrollingTabContainerView1.o00OooO0;
    if (paramInt1 > 0)
    {
      paramInt1 = getMeasuredWidth();
      ScrollingTabContainerView localScrollingTabContainerView2 = this.o00OooO0;
      int i = localScrollingTabContainerView2.o00OooO0;
      if (paramInt1 > i)
      {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
  
  public void setSelected(boolean paramBoolean)
  {
    boolean bool = isSelected();
    if (bool != paramBoolean) {
      bool = true;
    } else {
      bool = false;
    }
    super.setSelected(paramBoolean);
    if ((bool) && (paramBoolean))
    {
      paramBoolean = true;
      sendAccessibilityEvent(paramBoolean);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.TabView
 * JD-Core Version:    0.7.0.1
 */