package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.database.Observable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;

public class ActivityChooserView
  extends ViewGroup
  implements ActivityChooserModel.ActivityChooserModelClient
{
  public final ActivityChooserView.ActivityChooserViewAdapter o00OoOoo;
  public final View o00Ooo0;
  public final ActivityChooserView.Callbacks o00Ooo00;
  public final Drawable o00Ooo0O;
  public final FrameLayout o00Ooo0o;
  public final FrameLayout o00OooO;
  public final ImageView o00OooO0;
  public final ImageView o00OooOO;
  public final int o00OooOo;
  public final DataSetObserver o00OoooO;
  public final ViewTreeObserver.OnGlobalLayoutListener o00Ooooo;
  public int o00o00;
  public PopupWindow.OnDismissListener o00o000;
  public ListPopupWindow o00o0000;
  public boolean o00o000O;
  public int o00o000o;
  public ActionProvider o0O00o0;
  public boolean oo00oO;
  
  public ActivityChooserView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new androidx/appcompat/widget/ActivityChooserView$1;
    ((ActivityChooserView.1)localObject1).<init>(this);
    this.o00OoooO = ((DataSetObserver)localObject1);
    localObject1 = new androidx/appcompat/widget/ActivityChooserView$2;
    ((ActivityChooserView.2)localObject1).<init>(this);
    this.o00Ooooo = ((ViewTreeObserver.OnGlobalLayoutListener)localObject1);
    int i = 4;
    this.o00o000o = i;
    Object localObject2 = R.styleable.ActivityChooserView;
    localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
    int[] arrayOfInt = R.styleable.ActivityChooserView;
    ViewCompat.o00ooo(this, paramContext, arrayOfInt, paramAttributeSet, (TypedArray)localObject2, paramInt, 0);
    int j = R.styleable.ActivityChooserView_initialActivityCount;
    j = ((TypedArray)localObject2).getInt(j, i);
    this.o00o000o = j;
    j = R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable;
    paramAttributeSet = ((TypedArray)localObject2).getDrawable(j);
    ((TypedArray)localObject2).recycle();
    Object localObject3 = LayoutInflater.from(getContext());
    i = R.layout.abc_activity_chooser_view;
    ((LayoutInflater)localObject3).inflate(i, this, true);
    localObject3 = new androidx/appcompat/widget/ActivityChooserView$Callbacks;
    ((ActivityChooserView.Callbacks)localObject3).<init>(this);
    this.o00Ooo00 = ((ActivityChooserView.Callbacks)localObject3);
    i = R.id.activity_chooser_view_content;
    localObject1 = findViewById(i);
    this.o00Ooo0 = ((View)localObject1);
    localObject1 = ((View)localObject1).getBackground();
    this.o00Ooo0O = ((Drawable)localObject1);
    i = R.id.default_activity_button;
    localObject1 = (FrameLayout)findViewById(i);
    this.o00OooO = ((FrameLayout)localObject1);
    ((View)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    ((View)localObject1).setOnLongClickListener((View.OnLongClickListener)localObject3);
    int k = R.id.image;
    localObject1 = (ImageView)((View)localObject1).findViewById(k);
    this.o00OooOO = ((ImageView)localObject1);
    i = R.id.expand_activities_button;
    localObject1 = (FrameLayout)findViewById(i);
    ((View)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    localObject3 = new androidx/appcompat/widget/ActivityChooserView$3;
    ((ActivityChooserView.3)localObject3).<init>(this);
    ((View)localObject1).setAccessibilityDelegate((View.AccessibilityDelegate)localObject3);
    localObject3 = new androidx/appcompat/widget/ActivityChooserView$4;
    ((ActivityChooserView.4)localObject3).<init>(this, (View)localObject1);
    ((View)localObject1).setOnTouchListener((View.OnTouchListener)localObject3);
    this.o00Ooo0o = ((FrameLayout)localObject1);
    paramInt = R.id.image;
    localObject3 = (ImageView)((View)localObject1).findViewById(paramInt);
    this.o00OooO0 = ((ImageView)localObject3);
    ((ImageView)localObject3).setImageDrawable(paramAttributeSet);
    paramAttributeSet = new androidx/appcompat/widget/ActivityChooserView$ActivityChooserViewAdapter;
    paramAttributeSet.<init>(this);
    this.o00OoOoo = paramAttributeSet;
    localObject3 = new androidx/appcompat/widget/ActivityChooserView$5;
    ((ActivityChooserView.5)localObject3).<init>(this);
    paramAttributeSet.registerDataSetObserver((DataSetObserver)localObject3);
    paramContext = paramContext.getResources();
    j = paramContext.getDisplayMetrics().widthPixels / 2;
    paramInt = R.dimen.abc_config_prefDialogWidth;
    int m = paramContext.getDimensionPixelSize(paramInt);
    m = Math.max(j, m);
    this.o00OooOo = m;
  }
  
  public boolean OooO00o()
  {
    boolean bool1 = isShowingPopup();
    if (bool1)
    {
      getListPopupWindow().dismiss();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      boolean bool2 = localViewTreeObserver.isAlive();
      if (bool2)
      {
        ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.o00Ooooo;
        localViewTreeObserver.removeGlobalOnLayoutListener(localOnGlobalLayoutListener);
      }
    }
    return true;
  }
  
  public boolean OooO0O0()
  {
    boolean bool = isShowingPopup();
    if (!bool)
    {
      bool = this.oo00oO;
      if (bool)
      {
        this.o00o000O = false;
        int i = this.o00o000o;
        OooO0OO(i);
        return true;
      }
    }
    return false;
  }
  
  public void OooO0OO(int paramInt)
  {
    Object localObject1 = this.o00OoOoo.getDataModel();
    if (localObject1 != null)
    {
      localObject1 = getViewTreeObserver();
      Object localObject2 = this.o00Ooooo;
      ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
      localObject1 = this.o00OooO;
      int i = ((View)localObject1).getVisibility();
      int j = 1;
      if (i == 0)
      {
        i = j;
      }
      else
      {
        i = 0;
        localObject1 = null;
      }
      ActivityChooserView.ActivityChooserViewAdapter localActivityChooserViewAdapter = this.o00OoOoo;
      int k = localActivityChooserViewAdapter.getActivityCount();
      int n = -1 >>> 1;
      if (paramInt != n)
      {
        n = paramInt + i;
        if (k > n)
        {
          this.o00OoOoo.setShowFooterView(j);
          localActivityChooserViewAdapter = this.o00OoOoo;
          paramInt -= j;
          break label132;
        }
      }
      this.o00OoOoo.setShowFooterView(false);
      localActivityChooserViewAdapter = this.o00OoOoo;
      label132:
      localActivityChooserViewAdapter.setMaxActivityCount(paramInt);
      localObject3 = getListPopupWindow();
      boolean bool = ((ListPopupWindow)localObject3).isShowing();
      if (!bool)
      {
        bool = this.o00o000O;
        if ((!bool) && (i != 0))
        {
          localObject1 = this.o00OoOoo;
          ((ActivityChooserView.ActivityChooserViewAdapter)localObject1).OooO0O0(false, false);
        }
        else
        {
          localActivityChooserViewAdapter = this.o00OoOoo;
          localActivityChooserViewAdapter.OooO0O0(j, i);
        }
        i = this.o00OoOoo.OooO00o();
        int m = this.o00OooOo;
        i = Math.min(i, m);
        ((ListPopupWindow)localObject3).setContentWidth(i);
        ((ListPopupWindow)localObject3).show();
        localObject1 = this.o0O00o0;
        if (localObject1 != null) {
          ((ActionProvider)localObject1).OooO0oo(j);
        }
        localObject1 = ((ListPopupWindow)localObject3).getListView();
        localObject2 = getContext();
        m = R.string.abc_activitychooserview_choose_application;
        localObject2 = ((Context)localObject2).getString(m);
        ((View)localObject1).setContentDescription((CharSequence)localObject2);
        localObject3 = ((ListPopupWindow)localObject3).getListView();
        localObject1 = new android/graphics/drawable/ColorDrawable;
        ((ColorDrawable)localObject1).<init>(0);
        ((AbsListView)localObject3).setSelector((Drawable)localObject1);
      }
      return;
    }
    Object localObject3 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject3).<init>("No data model. Did you call #setDataModel?");
    throw ((Throwable)localObject3);
  }
  
  public void OooO0Oo()
  {
    Object localObject1 = this.o00OoOoo;
    int i = ((ActivityChooserView.ActivityChooserViewAdapter)localObject1).getCount();
    int j = 0;
    Object localObject2 = null;
    int k = 1;
    if (i > 0)
    {
      localObject1 = this.o00Ooo0o;
      ((View)localObject1).setEnabled(k);
    }
    else
    {
      localObject1 = this.o00Ooo0o;
      ((View)localObject1).setEnabled(false);
    }
    localObject1 = this.o00OoOoo;
    i = ((ActivityChooserView.ActivityChooserViewAdapter)localObject1).getActivityCount();
    Object localObject3 = this.o00OoOoo;
    int n = ((ActivityChooserView.ActivityChooserViewAdapter)localObject3).getHistorySize();
    if ((i != k) && ((i <= k) || (n <= 0)))
    {
      localObject1 = this.o00OooO;
      j = 8;
      ((View)localObject1).setVisibility(j);
    }
    else
    {
      this.o00OooO.setVisibility(0);
      localObject1 = this.o00OoOoo.getDefaultActivity();
      localObject2 = getContext().getPackageManager();
      ImageView localImageView = this.o00OooOO;
      localObject3 = ((ResolveInfo)localObject1).loadIcon((PackageManager)localObject2);
      localImageView.setImageDrawable((Drawable)localObject3);
      int m = this.o00o00;
      if (m != 0)
      {
        localObject1 = ((ResolveInfo)localObject1).loadLabel((PackageManager)localObject2);
        localObject2 = getContext();
        m = this.o00o00;
        localObject1 = new Object[] { localObject1 };
        localObject1 = ((Context)localObject2).getString(m, (Object[])localObject1);
        localObject2 = this.o00OooO;
        ((View)localObject2).setContentDescription((CharSequence)localObject1);
      }
    }
    localObject1 = this.o00OooO;
    i = ((View)localObject1).getVisibility();
    if (i == 0)
    {
      localObject1 = this.o00Ooo0;
      localObject2 = this.o00Ooo0O;
    }
    else
    {
      localObject1 = this.o00Ooo0;
      j = 0;
      localObject2 = null;
    }
    ((View)localObject1).setBackgroundDrawable((Drawable)localObject2);
  }
  
  public ActivityChooserModel getDataModel()
  {
    return this.o00OoOoo.getDataModel();
  }
  
  public ListPopupWindow getListPopupWindow()
  {
    ListPopupWindow localListPopupWindow = this.o00o0000;
    if (localListPopupWindow == null)
    {
      localListPopupWindow = new androidx/appcompat/widget/ListPopupWindow;
      Object localObject = getContext();
      localListPopupWindow.<init>((Context)localObject);
      this.o00o0000 = localListPopupWindow;
      localObject = this.o00OoOoo;
      localListPopupWindow.setAdapter((ListAdapter)localObject);
      this.o00o0000.setAnchorView(this);
      localListPopupWindow = this.o00o0000;
      boolean bool = true;
      localListPopupWindow.setModal(bool);
      localListPopupWindow = this.o00o0000;
      localObject = this.o00Ooo00;
      localListPopupWindow.setOnItemClickListener((AdapterView.OnItemClickListener)localObject);
      localListPopupWindow = this.o00o0000;
      localObject = this.o00Ooo00;
      localListPopupWindow.setOnDismissListener((PopupWindow.OnDismissListener)localObject);
    }
    return this.o00o0000;
  }
  
  public boolean isShowingPopup()
  {
    return getListPopupWindow().isShowing();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ActivityChooserModel localActivityChooserModel = this.o00OoOoo.getDataModel();
    if (localActivityChooserModel != null)
    {
      DataSetObserver localDataSetObserver = this.o00OoooO;
      localActivityChooserModel.registerObserver(localDataSetObserver);
    }
    this.oo00oO = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject1 = this.o00OoOoo.getDataModel();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.o00OoooO;
      ((Observable)localObject1).unregisterObserver(localObject2);
    }
    localObject1 = getViewTreeObserver();
    boolean bool1 = ((ViewTreeObserver)localObject1).isAlive();
    if (bool1)
    {
      localObject2 = this.o00Ooooo;
      ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
    }
    boolean bool2 = isShowingPopup();
    if (bool2) {
      OooO00o();
    }
    this.oo00oO = false;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = this.o00Ooo0;
    paramInt3 -= paramInt1;
    paramInt4 -= paramInt2;
    paramInt1 = 0;
    localView.layout(0, 0, paramInt3, paramInt4);
    paramBoolean = isShowingPopup();
    if (!paramBoolean) {
      OooO00o();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = this.o00Ooo0;
    FrameLayout localFrameLayout = this.o00OooO;
    int i = localFrameLayout.getVisibility();
    if (i != 0)
    {
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      i = 1073741824;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2, i);
    }
    measureChild(localView, paramInt1, paramInt2);
    paramInt1 = localView.getMeasuredWidth();
    paramInt2 = localView.getMeasuredHeight();
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public void setActivityChooserModel(ActivityChooserModel paramActivityChooserModel)
  {
    ActivityChooserView.ActivityChooserViewAdapter localActivityChooserViewAdapter = this.o00OoOoo;
    localActivityChooserViewAdapter.setDataModel(paramActivityChooserModel);
    boolean bool = isShowingPopup();
    if (bool)
    {
      OooO00o();
      OooO0O0();
    }
  }
  
  public void setDefaultActionButtonContentDescription(int paramInt)
  {
    this.o00o00 = paramInt;
  }
  
  public void setExpandActivityOverflowButtonContentDescription(int paramInt)
  {
    String str = getContext().getString(paramInt);
    this.o00OooO0.setContentDescription(str);
  }
  
  public void setExpandActivityOverflowButtonDrawable(Drawable paramDrawable)
  {
    this.o00OooO0.setImageDrawable(paramDrawable);
  }
  
  public void setInitialActivityCount(int paramInt)
  {
    this.o00o000o = paramInt;
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.o00o000 = paramOnDismissListener;
  }
  
  public void setProvider(ActionProvider paramActionProvider)
  {
    this.o0O00o0 = paramActionProvider;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView
 * JD-Core Version:    0.7.0.1
 */