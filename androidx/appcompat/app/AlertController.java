package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;

class AlertController
{
  public int OooO;
  public final Context OooO00o;
  public final AppCompatDialog OooO0O0;
  public final Window OooO0OO;
  public final int OooO0Oo;
  public CharSequence OooO0o;
  public CharSequence OooO0o0;
  public ListView OooO0oO;
  public View OooO0oo;
  public int OooOO0;
  public int OooOO0O;
  public int OooOO0o;
  public boolean OooOOO = false;
  public int OooOOO0;
  public Button OooOOOO;
  public CharSequence OooOOOo;
  public Drawable OooOOo;
  public Message OooOOo0;
  public Button OooOOoo;
  public CharSequence OooOo;
  public Message OooOo0;
  public CharSequence OooOo00;
  public Drawable OooOo0O;
  public Button OooOo0o;
  public Drawable OooOoO;
  public Message OooOoO0;
  public NestedScrollView OooOoOO;
  public Drawable OooOoo;
  public int OooOoo0 = 0;
  public ImageView OooOooO;
  public TextView OooOooo;
  public boolean Oooo;
  public int Oooo0 = -1;
  public TextView Oooo000;
  public View Oooo00O;
  public ListAdapter Oooo00o;
  public int Oooo0O0;
  public int Oooo0OO;
  public int Oooo0o;
  public int Oooo0o0;
  public int Oooo0oO;
  public int Oooo0oo;
  public Handler OoooO0;
  public int OoooO00 = 0;
  public final View.OnClickListener OoooO0O;
  
  public AlertController(Context paramContext, AppCompatDialog paramAppCompatDialog, Window paramWindow)
  {
    AlertController.1 local1 = new androidx/appcompat/app/AlertController$1;
    local1.<init>(this);
    this.OoooO0O = local1;
    this.OooO00o = paramContext;
    this.OooO0O0 = paramAppCompatDialog;
    this.OooO0OO = paramWindow;
    paramWindow = new androidx/appcompat/app/AlertController$ButtonHandler;
    paramWindow.<init>(paramAppCompatDialog);
    this.OoooO0 = paramWindow;
    paramWindow = R.styleable.AlertDialog;
    int i = R.attr.alertDialogStyle;
    paramContext = paramContext.obtainStyledAttributes(null, paramWindow, i, 0);
    int j = R.styleable.AlertDialog_android_layout;
    j = paramContext.getResourceId(j, 0);
    this.Oooo0O0 = j;
    j = R.styleable.AlertDialog_buttonPanelSideLayout;
    j = paramContext.getResourceId(j, 0);
    this.Oooo0OO = j;
    j = R.styleable.AlertDialog_listLayout;
    j = paramContext.getResourceId(j, 0);
    this.Oooo0o0 = j;
    j = R.styleable.AlertDialog_multiChoiceItemLayout;
    j = paramContext.getResourceId(j, 0);
    this.Oooo0o = j;
    j = R.styleable.AlertDialog_singleChoiceItemLayout;
    j = paramContext.getResourceId(j, 0);
    this.Oooo0oO = j;
    j = R.styleable.AlertDialog_listItemLayout;
    j = paramContext.getResourceId(j, 0);
    this.Oooo0oo = j;
    j = R.styleable.AlertDialog_showTitle;
    i = 1;
    boolean bool = paramContext.getBoolean(j, i);
    this.Oooo = bool;
    int k = R.styleable.AlertDialog_buttonIconDimen;
    k = paramContext.getDimensionPixelSize(k, 0);
    this.OooO0Oo = k;
    paramContext.recycle();
    paramAppCompatDialog.supportRequestWindowFeature(i);
  }
  
  public static boolean OooO00o(View paramView)
  {
    boolean bool1 = paramView.onCheckIsTextEditor();
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    bool1 = paramView instanceof ViewGroup;
    if (!bool1) {
      return false;
    }
    paramView = (ViewGroup)paramView;
    int i = paramView.getChildCount();
    while (i > 0)
    {
      i += -1;
      View localView = paramView.getChildAt(i);
      boolean bool3 = OooO00o(localView);
      if (bool3) {
        return bool2;
      }
    }
    return false;
  }
  
  public static void OooO0Oo(View paramView1, View paramView2, View paramView3)
  {
    int i = 0;
    int j = 4;
    if (paramView2 != null)
    {
      int k = paramView1.canScrollVertically(-1);
      if (k != 0) {
        k = 0;
      } else {
        k = j;
      }
      paramView2.setVisibility(k);
    }
    if (paramView3 != null)
    {
      int m = 1;
      boolean bool = paramView1.canScrollVertically(m);
      if (!bool) {
        i = j;
      }
      paramView3.setVisibility(i);
    }
  }
  
  public static boolean OooOOO0(Context paramContext)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    paramContext = paramContext.getTheme();
    int i = R.attr.alertDialogCenterButtons;
    boolean bool = true;
    paramContext.resolveAttribute(i, localTypedValue, bool);
    int j = localTypedValue.data;
    if (j == 0) {
      bool = false;
    }
    return bool;
  }
  
  private void setupButtons(ViewGroup paramViewGroup)
  {
    Object localObject1 = (Button)paramViewGroup.findViewById(16908313);
    this.OooOOOO = ((Button)localObject1);
    View.OnClickListener localOnClickListener = this.OoooO0O;
    ((View)localObject1).setOnClickListener(localOnClickListener);
    localObject1 = this.OooOOOo;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    int j = 8;
    boolean bool2 = false;
    Object localObject2 = null;
    int m = 1;
    if (bool1)
    {
      localObject1 = this.OooOOo;
      if (localObject1 == null)
      {
        this.OooOOOO.setVisibility(j);
        bool1 = false;
        localObject1 = null;
        break label156;
      }
    }
    localObject1 = this.OooOOOO;
    Object localObject3 = this.OooOOOo;
    ((TextView)localObject1).setText((CharSequence)localObject3);
    localObject1 = this.OooOOo;
    if (localObject1 != null)
    {
      int n = this.OooO0Oo;
      ((Drawable)localObject1).setBounds(0, 0, n, n);
      localObject1 = this.OooOOOO;
      localObject3 = this.OooOOo;
      ((TextView)localObject1).setCompoundDrawables((Drawable)localObject3, null, null, null);
    }
    localObject1 = this.OooOOOO;
    ((View)localObject1).setVisibility(0);
    bool1 = m;
    label156:
    localObject3 = (Button)paramViewGroup.findViewById(16908314);
    this.OooOOoo = ((Button)localObject3);
    Object localObject4 = this.OoooO0O;
    ((View)localObject3).setOnClickListener((View.OnClickListener)localObject4);
    localObject3 = this.OooOo00;
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject3);
    if (bool3)
    {
      localObject3 = this.OooOo0O;
      if (localObject3 == null)
      {
        localObject3 = this.OooOOoo;
        ((View)localObject3).setVisibility(j);
        break label319;
      }
    }
    localObject3 = this.OooOOoo;
    localObject4 = this.OooOo00;
    ((TextView)localObject3).setText((CharSequence)localObject4);
    localObject3 = this.OooOo0O;
    int i1;
    if (localObject3 != null)
    {
      i1 = this.OooO0Oo;
      ((Drawable)localObject3).setBounds(0, 0, i1, i1);
      localObject3 = this.OooOOoo;
      localObject4 = this.OooOo0O;
      ((TextView)localObject3).setCompoundDrawables((Drawable)localObject4, null, null, null);
    }
    localObject3 = this.OooOOoo;
    ((View)localObject3).setVisibility(0);
    int i;
    bool1 |= true;
    label319:
    localObject3 = (Button)paramViewGroup.findViewById(16908315);
    this.OooOo0o = ((Button)localObject3);
    localObject4 = this.OoooO0O;
    ((View)localObject3).setOnClickListener((View.OnClickListener)localObject4);
    localObject3 = this.OooOo;
    bool3 = TextUtils.isEmpty((CharSequence)localObject3);
    if (bool3)
    {
      localObject3 = this.OooOoO;
      if (localObject3 == null)
      {
        localObject2 = this.OooOo0o;
        ((View)localObject2).setVisibility(j);
        break label482;
      }
    }
    localObject3 = this.OooOo0o;
    localObject4 = this.OooOo;
    ((TextView)localObject3).setText((CharSequence)localObject4);
    localObject3 = this.OooOoO;
    if (localObject3 != null)
    {
      i1 = this.OooO0Oo;
      ((Drawable)localObject3).setBounds(0, 0, i1, i1);
      localObject3 = this.OooOo0o;
      localObject4 = this.OooOoO;
      ((TextView)localObject3).setCompoundDrawables((Drawable)localObject4, null, null, null);
    }
    localObject2 = this.OooOo0o;
    ((View)localObject2).setVisibility(0);
    i |= 0x4;
    label482:
    localObject2 = this.OooO00o;
    bool2 = OooOOO0((Context)localObject2);
    if (bool2)
    {
      if (i == m) {
        localObject2 = this.OooOOOO;
      }
      for (;;)
      {
        OooO0O0((Button)localObject2);
        break;
        int k = 2;
        if (i == k)
        {
          localObject2 = this.OooOOoo;
        }
        else
        {
          k = 4;
          if (i != k) {
            break;
          }
          localObject2 = this.OooOo0o;
        }
      }
    }
    if (i == 0) {
      m = 0;
    }
    if (m == 0) {
      paramViewGroup.setVisibility(j);
    }
  }
  
  private void setupContent(ViewGroup paramViewGroup)
  {
    Object localObject1 = this.OooO0OO;
    int i = R.id.scrollView;
    localObject1 = (NestedScrollView)((Window)localObject1).findViewById(i);
    this.OooOoOO = ((NestedScrollView)localObject1);
    i = 0;
    Object localObject2 = null;
    ((View)localObject1).setFocusable(false);
    this.OooOoOO.setNestedScrollingEnabled(false);
    int j = 16908299;
    localObject1 = (TextView)paramViewGroup.findViewById(j);
    this.Oooo000 = ((TextView)localObject1);
    if (localObject1 == null) {
      return;
    }
    localObject2 = this.OooO0o;
    if (localObject2 != null)
    {
      ((TextView)localObject1).setText((CharSequence)localObject2);
    }
    else
    {
      i = 8;
      ((View)localObject1).setVisibility(i);
      localObject1 = this.OooOoOO;
      Object localObject3 = this.Oooo000;
      ((ViewGroup)localObject1).removeView((View)localObject3);
      localObject1 = this.OooO0oO;
      if (localObject1 != null)
      {
        paramViewGroup = (ViewGroup)this.OooOoOO.getParent();
        localObject1 = this.OooOoOO;
        j = paramViewGroup.indexOfChild((View)localObject1);
        paramViewGroup.removeViewAt(j);
        localObject2 = this.OooO0oO;
        localObject3 = new android/view/ViewGroup$LayoutParams;
        int k = -1;
        ((ViewGroup.LayoutParams)localObject3).<init>(k, k);
        paramViewGroup.addView((View)localObject2, j, (ViewGroup.LayoutParams)localObject3);
      }
      else
      {
        paramViewGroup.setVisibility(i);
      }
    }
  }
  
  private void setupCustomContent(ViewGroup paramViewGroup)
  {
    Object localObject1 = this.OooO0oo;
    int i = 0;
    Object localObject2 = null;
    if (localObject1 == null)
    {
      int j = this.OooO;
      if (j != 0)
      {
        localObject1 = LayoutInflater.from(this.OooO00o);
        int m = this.OooO;
        localObject1 = ((LayoutInflater)localObject1).inflate(m, paramViewGroup, false);
      }
      else
      {
        j = 0;
        localObject1 = null;
      }
    }
    if (localObject1 != null) {
      i = 1;
    }
    Object localObject3;
    int i1;
    if (i != 0)
    {
      boolean bool2 = OooO00o((View)localObject1);
      if (bool2) {}
    }
    else
    {
      localObject3 = this.OooO0OO;
      i1 = 131072;
      ((Window)localObject3).setFlags(i1, i1);
    }
    int k;
    if (i != 0)
    {
      localObject2 = this.OooO0OO;
      int n = R.id.custom;
      localObject2 = (FrameLayout)((Window)localObject2).findViewById(n);
      localObject3 = new android/view/ViewGroup$LayoutParams;
      i1 = -1;
      ((ViewGroup.LayoutParams)localObject3).<init>(i1, i1);
      ((ViewGroup)localObject2).addView((View)localObject1, (ViewGroup.LayoutParams)localObject3);
      boolean bool1 = this.OooOOO;
      if (bool1)
      {
        k = this.OooOO0;
        n = this.OooOO0O;
        i1 = this.OooOO0o;
        int i2 = this.OooOOO0;
        ((View)localObject2).setPadding(k, n, i1, i2);
      }
      localObject1 = this.OooO0oO;
      if (localObject1 != null)
      {
        paramViewGroup = (LinearLayoutCompat.LayoutParams)paramViewGroup.getLayoutParams();
        k = 0;
        localObject1 = null;
        paramViewGroup.weight = 0.0F;
      }
    }
    else
    {
      k = 8;
      paramViewGroup.setVisibility(k);
    }
  }
  
  private void setupTitle(ViewGroup paramViewGroup)
  {
    Object localObject1 = this.Oooo00O;
    int i = 8;
    int j;
    Object localObject2;
    int k;
    ImageView localImageView1;
    if (localObject1 != null)
    {
      localObject1 = new android/view/ViewGroup$LayoutParams;
      j = -1;
      ((ViewGroup.LayoutParams)localObject1).<init>(j, -2);
      localObject2 = this.Oooo00O;
      k = 0;
      localImageView1 = null;
      paramViewGroup.addView((View)localObject2, 0, (ViewGroup.LayoutParams)localObject1);
      paramViewGroup = this.OooO0OO;
      int m = R.id.title_template;
      paramViewGroup = paramViewGroup.findViewById(m);
    }
    for (;;)
    {
      paramViewGroup.setVisibility(i);
      break;
      localObject1 = this.OooO0OO;
      j = 16908294;
      localObject1 = (ImageView)((Window)localObject1).findViewById(j);
      this.OooOooO = ((ImageView)localObject1);
      localObject1 = this.OooO0o0;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1) ^ true;
      if (bool)
      {
        bool = this.Oooo;
        if (bool)
        {
          paramViewGroup = this.OooO0OO;
          int n = R.id.alertTitle;
          paramViewGroup = (TextView)paramViewGroup.findViewById(n);
          this.OooOooo = paramViewGroup;
          localObject1 = this.OooO0o0;
          paramViewGroup.setText((CharSequence)localObject1);
          int i1 = this.OooOoo0;
          if (i1 != 0)
          {
            localObject1 = this.OooOooO;
            ((ImageView)localObject1).setImageResource(i1);
            break;
          }
          paramViewGroup = this.OooOoo;
          if (paramViewGroup != null)
          {
            localObject1 = this.OooOooO;
            ((ImageView)localObject1).setImageDrawable(paramViewGroup);
            break;
          }
          paramViewGroup = this.OooOooo;
          localObject1 = this.OooOooO;
          n = ((View)localObject1).getPaddingLeft();
          localObject2 = this.OooOooO;
          j = ((View)localObject2).getPaddingTop();
          localImageView1 = this.OooOooO;
          k = localImageView1.getPaddingRight();
          ImageView localImageView2 = this.OooOooO;
          int i2 = localImageView2.getPaddingBottom();
          paramViewGroup.setPadding(n, j, k, i2);
          paramViewGroup = this.OooOooO;
          paramViewGroup.setVisibility(i);
          break;
        }
      }
      localObject1 = this.OooO0OO;
      j = R.id.title_template;
      ((Window)localObject1).findViewById(j).setVisibility(i);
      localObject1 = this.OooOooO;
      ((ImageView)localObject1).setVisibility(i);
    }
  }
  
  public void OooO(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage, Drawable paramDrawable)
  {
    if ((paramMessage == null) && (paramOnClickListener != null)) {
      paramMessage = this.OoooO0.obtainMessage(paramInt, paramOnClickListener);
    }
    int i = -3;
    if (paramInt != i)
    {
      i = -2;
      if (paramInt != i)
      {
        i = -1;
        if (paramInt == i)
        {
          this.OooOOOo = paramCharSequence;
          this.OooOOo0 = paramMessage;
          this.OooOOo = paramDrawable;
        }
        else
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("Button does not exist");
          throw localIllegalArgumentException;
        }
      }
      else
      {
        this.OooOo00 = paramCharSequence;
        this.OooOo0 = paramMessage;
        this.OooOo0O = paramDrawable;
      }
    }
    else
    {
      this.OooOo = paramCharSequence;
      this.OooOoO0 = paramMessage;
      this.OooOoO = paramDrawable;
    }
  }
  
  public final void OooO0O0(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    localLayoutParams.gravity = 1;
    localLayoutParams.weight = 0.5F;
    paramButton.setLayoutParams(localLayoutParams);
  }
  
  public void OooO0OO()
  {
    int i = OooO0oo();
    this.OooO0O0.setContentView(i);
    OooOO0o();
  }
  
  public boolean OooO0o(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = this.OooOoOO;
    if (localNestedScrollView != null)
    {
      paramInt = localNestedScrollView.OooOOO(paramKeyEvent);
      if (paramInt != 0) {
        return 1;
      }
    }
    paramInt = 0;
    localNestedScrollView = null;
    return paramInt;
  }
  
  public boolean OooO0o0(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = this.OooOoOO;
    if (localNestedScrollView != null)
    {
      paramInt = localNestedScrollView.OooOOO(paramKeyEvent);
      if (paramInt != 0) {
        return 1;
      }
    }
    paramInt = 0;
    localNestedScrollView = null;
    return paramInt;
  }
  
  public final ViewGroup OooO0oO(View paramView1, View paramView2)
  {
    if (paramView1 == null)
    {
      boolean bool1 = paramView2 instanceof ViewStub;
      if (bool1) {
        paramView2 = ((ViewStub)paramView2).inflate();
      }
      return (ViewGroup)paramView2;
    }
    if (paramView2 != null)
    {
      Object localObject = paramView2.getParent();
      boolean bool2 = localObject instanceof ViewGroup;
      if (bool2)
      {
        localObject = (ViewGroup)localObject;
        ((ViewGroup)localObject).removeView(paramView2);
      }
    }
    boolean bool3 = paramView1 instanceof ViewStub;
    if (bool3) {
      paramView1 = ((ViewStub)paramView1).inflate();
    }
    return (ViewGroup)paramView1;
  }
  
  public final int OooO0oo()
  {
    int i = this.Oooo0OO;
    if (i == 0) {
      return this.Oooo0O0;
    }
    int j = this.OoooO00;
    int k = 1;
    if (j == k) {
      return i;
    }
    return this.Oooo0O0;
  }
  
  public final void OooOO0(ViewGroup paramViewGroup, View paramView, int paramInt1, int paramInt2)
  {
    Object localObject1 = this.OooO0OO;
    int i = R.id.scrollIndicatorUp;
    localObject1 = ((Window)localObject1).findViewById(i);
    Object localObject2 = this.OooO0OO;
    int j = R.id.scrollIndicatorDown;
    localObject2 = ((Window)localObject2).findViewById(j);
    ViewCompat.o00000o0(paramView, paramInt1, paramInt2);
    if (localObject1 != null) {
      paramViewGroup.removeView((View)localObject1);
    }
    if (localObject2 != null) {
      paramViewGroup.removeView((View)localObject2);
    }
  }
  
  public void OooOO0O(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.OooO0oo = paramView;
    this.OooO = 0;
    this.OooOOO = true;
    this.OooOO0 = paramInt1;
    this.OooOO0O = paramInt2;
    this.OooOO0o = paramInt3;
    this.OooOOO0 = paramInt4;
  }
  
  public final void OooOO0o()
  {
    Object localObject1 = this.OooO0OO;
    int i = R.id.parentPanel;
    localObject1 = ((Window)localObject1).findViewById(i);
    i = R.id.topPanel;
    Object localObject2 = ((View)localObject1).findViewById(i);
    int j = R.id.contentPanel;
    Object localObject3 = ((View)localObject1).findViewById(j);
    int k = R.id.buttonPanel;
    Object localObject4 = ((View)localObject1).findViewById(k);
    int n = R.id.customPanel;
    localObject1 = (ViewGroup)((View)localObject1).findViewById(n);
    setupCustomContent((ViewGroup)localObject1);
    n = R.id.topPanel;
    Object localObject5 = ((View)localObject1).findViewById(n);
    int i2 = R.id.contentPanel;
    View localView1 = ((View)localObject1).findViewById(i2);
    int i3 = R.id.buttonPanel;
    View localView2 = ((View)localObject1).findViewById(i3);
    localObject2 = OooO0oO((View)localObject5, (View)localObject2);
    localObject3 = OooO0oO(localView1, (View)localObject3);
    localObject4 = OooO0oO(localView2, (View)localObject4);
    setupContent((ViewGroup)localObject3);
    setupButtons((ViewGroup)localObject4);
    setupTitle((ViewGroup)localObject2);
    int i4 = ((View)localObject1).getVisibility();
    n = 8;
    i2 = 1;
    i3 = 0;
    localView2 = null;
    int i5;
    if (i4 != n)
    {
      i4 = i2;
    }
    else
    {
      i5 = 0;
      localObject1 = null;
    }
    if (localObject2 != null)
    {
      int i6 = ((View)localObject2).getVisibility();
      if (i6 != n)
      {
        i6 = i2;
        break label220;
      }
    }
    int i7 = 0;
    label220:
    if (localObject4 != null)
    {
      k = ((View)localObject4).getVisibility();
      if (k != n)
      {
        k = i2;
        break label252;
      }
    }
    k = 0;
    localObject4 = null;
    label252:
    int i1;
    if ((k == 0) && (localObject3 != null))
    {
      i1 = R.id.textSpacerNoButtons;
      localObject5 = ((View)localObject3).findViewById(i1);
      if (localObject5 != null) {
        ((View)localObject5).setVisibility(0);
      }
    }
    if (i7 != 0)
    {
      localObject5 = this.OooOoOO;
      if (localObject5 != null) {
        ((ViewGroup)localObject5).setClipToPadding(i2);
      }
      localObject5 = this.OooO0o;
      if (localObject5 == null)
      {
        localObject5 = this.OooO0oO;
        if (localObject5 == null)
        {
          i = 0;
          localObject2 = null;
          break label354;
        }
      }
      i1 = R.id.titleDividerNoCustom;
      localObject2 = ((View)localObject2).findViewById(i1);
      label354:
      if (localObject2 == null) {
        break label386;
      }
    }
    else
    {
      if (localObject3 == null) {
        break label386;
      }
      i = R.id.textSpacerNoTitle;
      localObject2 = ((View)localObject3).findViewById(i);
      if (localObject2 == null) {
        break label386;
      }
    }
    ((View)localObject2).setVisibility(0);
    label386:
    localObject2 = this.OooO0oO;
    boolean bool = localObject2 instanceof AlertController.RecycleListView;
    if (bool)
    {
      localObject2 = (AlertController.RecycleListView)localObject2;
      ((AlertController.RecycleListView)localObject2).OooO00o(i7, k);
    }
    if (i5 == 0)
    {
      localObject1 = this.OooO0oO;
      if (localObject1 == null) {
        localObject1 = this.OooOoOO;
      }
      if (localObject1 != null)
      {
        if (k != 0) {
          i3 = 2;
        }
        i = i7 | i3;
        int m = 3;
        OooOO0((ViewGroup)localObject3, (View)localObject1, i, m);
      }
    }
    localObject1 = this.OooO0oO;
    if (localObject1 != null)
    {
      localObject2 = this.Oooo00o;
      if (localObject2 != null)
      {
        ((ListView)localObject1).setAdapter((ListAdapter)localObject2);
        i = this.Oooo0;
        j = -1;
        if (i > j)
        {
          ((AbsListView)localObject1).setItemChecked(i, i2);
          ((ListView)localObject1).setSelection(i);
        }
      }
    }
  }
  
  public Button getButton(int paramInt)
  {
    int i = -3;
    if (paramInt != i)
    {
      i = -2;
      if (paramInt != i)
      {
        i = -1;
        if (paramInt != i) {
          return null;
        }
        return this.OooOOOO;
      }
      return this.OooOOoo;
    }
    return this.OooOo0o;
  }
  
  public int getIconAttributeResId(int paramInt)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    this.OooO00o.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    return localTypedValue.resourceId;
  }
  
  public ListView getListView()
  {
    return this.OooO0oO;
  }
  
  public void setButtonPanelLayoutHint(int paramInt)
  {
    this.OoooO00 = paramInt;
  }
  
  public void setCustomTitle(View paramView)
  {
    this.Oooo00O = paramView;
  }
  
  public void setIcon(int paramInt)
  {
    int i = 0;
    this.OooOoo = null;
    this.OooOoo0 = paramInt;
    ImageView localImageView1 = this.OooOooO;
    if (localImageView1 != null) {
      if (paramInt != 0)
      {
        paramInt = 0;
        localImageView1.setVisibility(0);
        ImageView localImageView2 = this.OooOooO;
        i = this.OooOoo0;
        localImageView2.setImageResource(i);
      }
      else
      {
        paramInt = 8;
        localImageView1.setVisibility(paramInt);
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.OooOoo = paramDrawable;
    ImageView localImageView1 = null;
    this.OooOoo0 = 0;
    ImageView localImageView2 = this.OooOooO;
    if (localImageView2 != null) {
      if (paramDrawable != null)
      {
        localImageView2.setVisibility(0);
        localImageView1 = this.OooOooO;
        localImageView1.setImageDrawable(paramDrawable);
      }
      else
      {
        int i = 8;
        localImageView2.setVisibility(i);
      }
    }
  }
  
  public void setMessage(CharSequence paramCharSequence)
  {
    this.OooO0o = paramCharSequence;
    TextView localTextView = this.Oooo000;
    if (localTextView != null) {
      localTextView.setText(paramCharSequence);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.OooO0o0 = paramCharSequence;
    TextView localTextView = this.OooOooo;
    if (localTextView != null) {
      localTextView.setText(paramCharSequence);
    }
  }
  
  public void setView(int paramInt)
  {
    this.OooO0oo = null;
    this.OooO = paramInt;
    this.OooOOO = false;
  }
  
  public void setView(View paramView)
  {
    this.OooO0oo = paramView;
    this.OooO = 0;
    this.OooOOO = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController
 * JD-Core Version:    0.7.0.1
 */