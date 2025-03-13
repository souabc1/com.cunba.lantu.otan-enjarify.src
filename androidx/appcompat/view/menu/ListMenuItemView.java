package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;

public class ListMenuItemView
  extends LinearLayout
  implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster
{
  public MenuItemImpl o00OoOoo;
  public RadioButton o00Ooo0;
  public ImageView o00Ooo00;
  public TextView o00Ooo0O;
  public CheckBox o00Ooo0o;
  public ImageView o00OooO;
  public TextView o00OooO0;
  public ImageView o00OooOO;
  public LinearLayout o00OooOo;
  public int o00OoooO;
  public Context o00Ooooo;
  public Drawable o00o000;
  public boolean o00o0000;
  public boolean o00o000O;
  public LayoutInflater o00o000o;
  public Drawable o0O00o0;
  public boolean oo00oO;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    int[] arrayOfInt = R.styleable.MenuView;
    paramAttributeSet = TintTypedArray.OooOOOO(localContext, paramAttributeSet, arrayOfInt, paramInt, 0);
    paramInt = R.styleable.MenuView_android_itemBackground;
    Object localObject = paramAttributeSet.getDrawable(paramInt);
    this.o0O00o0 = ((Drawable)localObject);
    paramInt = R.styleable.MenuView_android_itemTextAppearance;
    paramInt = paramAttributeSet.OooOO0O(paramInt, -1);
    this.o00OoooO = paramInt;
    paramInt = R.styleable.MenuView_preserveIconSpacing;
    paramInt = paramAttributeSet.OooO00o(paramInt, false);
    this.o00o0000 = paramInt;
    this.o00Ooooo = paramContext;
    paramInt = R.styleable.MenuView_subMenuArrow;
    localObject = paramAttributeSet.getDrawable(paramInt);
    this.o00o000 = ((Drawable)localObject);
    paramContext = paramContext.getTheme();
    localObject = new int[] { 16843049 };
    int i = R.attr.dropDownListViewStyle;
    paramContext = paramContext.obtainStyledAttributes(null, (int[])localObject, i, 0);
    paramInt = paramContext.hasValue(0);
    this.o00o000O = paramInt;
    paramAttributeSet.OooOOOo();
    paramContext.recycle();
  }
  
  private LayoutInflater getInflater()
  {
    LayoutInflater localLayoutInflater = this.o00o000o;
    if (localLayoutInflater == null)
    {
      localLayoutInflater = LayoutInflater.from(getContext());
      this.o00o000o = localLayoutInflater;
    }
    return this.o00o000o;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView = this.o00OooO;
    if (localImageView != null)
    {
      if (paramBoolean) {
        paramBoolean = false;
      } else {
        paramBoolean = true;
      }
      localImageView.setVisibility(paramBoolean);
    }
  }
  
  public final void OooO00o(View paramView)
  {
    OooO0O0(paramView, -1);
  }
  
  public final void OooO0O0(View paramView, int paramInt)
  {
    LinearLayout localLinearLayout = this.o00OooOo;
    if (localLinearLayout != null) {
      localLinearLayout.addView(paramView, paramInt);
    } else {
      addView(paramView, paramInt);
    }
  }
  
  public final void OooO0OO()
  {
    Object localObject = getInflater();
    int i = R.layout.abc_list_menu_item_checkbox;
    localObject = (CheckBox)((LayoutInflater)localObject).inflate(i, this, false);
    this.o00Ooo0o = ((CheckBox)localObject);
    OooO00o((View)localObject);
  }
  
  public final void OooO0Oo()
  {
    Object localObject = getInflater();
    int i = R.layout.abc_list_menu_item_icon;
    localObject = (ImageView)((LayoutInflater)localObject).inflate(i, this, false);
    this.o00Ooo00 = ((ImageView)localObject);
    OooO0O0((View)localObject, 0);
  }
  
  public void OooO0o(boolean paramBoolean, char paramChar)
  {
    if (paramBoolean)
    {
      MenuItemImpl localMenuItemImpl = this.o00OoOoo;
      paramBoolean = localMenuItemImpl.OooOOOO();
      if (paramBoolean)
      {
        paramBoolean = false;
        localMenuItemImpl = null;
        break label28;
      }
    }
    paramBoolean = true;
    label28:
    if (!paramBoolean)
    {
      localTextView = this.o00OooO0;
      String str = this.o00OoOoo.getShortcutLabel();
      localTextView.setText(str);
    }
    TextView localTextView = this.o00OooO0;
    paramChar = localTextView.getVisibility();
    if (paramChar != paramBoolean)
    {
      localTextView = this.o00OooO0;
      localTextView.setVisibility(paramBoolean);
    }
  }
  
  public final void OooO0o0()
  {
    Object localObject = getInflater();
    int i = R.layout.abc_list_menu_item_radio;
    localObject = (RadioButton)((LayoutInflater)localObject).inflate(i, this, false);
    this.o00Ooo0 = ((RadioButton)localObject);
    OooO00o((View)localObject);
  }
  
  public void adjustListItemSelectionBounds(Rect paramRect)
  {
    Object localObject = this.o00OooOO;
    if (localObject != null)
    {
      int i = ((View)localObject).getVisibility();
      if (i == 0)
      {
        localObject = (LinearLayout.LayoutParams)this.o00OooOO.getLayoutParams();
        int j = paramRect.top;
        ImageView localImageView = this.o00OooOO;
        int k = localImageView.getHeight();
        int m = ((LinearLayout.LayoutParams)localObject).topMargin;
        k += m;
        i = ((LinearLayout.LayoutParams)localObject).bottomMargin;
        k += i;
        j += k;
        paramRect.top = j;
      }
    }
  }
  
  public MenuItemImpl getItemData()
  {
    return this.o00OoOoo;
  }
  
  public void initialize(MenuItemImpl paramMenuItemImpl, int paramInt)
  {
    this.o00OoOoo = paramMenuItemImpl;
    paramInt = paramMenuItemImpl.isVisible();
    if (paramInt != 0)
    {
      paramInt = 0;
      localObject = null;
    }
    else
    {
      paramInt = 8;
    }
    setVisibility(paramInt);
    Object localObject = paramMenuItemImpl.OooO0o0(this);
    setTitle((CharSequence)localObject);
    paramInt = paramMenuItemImpl.isCheckable();
    setCheckable(paramInt);
    paramInt = paramMenuItemImpl.OooOOOO();
    char c = paramMenuItemImpl.getShortcut();
    OooO0o(paramInt, c);
    localObject = paramMenuItemImpl.getIcon();
    setIcon((Drawable)localObject);
    paramInt = paramMenuItemImpl.isEnabled();
    setEnabled(paramInt);
    paramInt = paramMenuItemImpl.hasSubMenu();
    setSubMenuArrowVisible(paramInt);
    paramMenuItemImpl = paramMenuItemImpl.getContentDescription();
    setContentDescription(paramMenuItemImpl);
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    Object localObject = this.o0O00o0;
    ViewCompat.o0ooOoO(this, (Drawable)localObject);
    int i = R.id.title;
    localObject = (TextView)findViewById(i);
    this.o00Ooo0O = ((TextView)localObject);
    int j = this.o00OoooO;
    int k = -1;
    if (j != k)
    {
      Context localContext = this.o00Ooooo;
      ((TextView)localObject).setTextAppearance(localContext, j);
    }
    i = R.id.shortcut;
    localObject = (TextView)findViewById(i);
    this.o00OooO0 = ((TextView)localObject);
    i = R.id.submenuarrow;
    localObject = (ImageView)findViewById(i);
    this.o00OooO = ((ImageView)localObject);
    if (localObject != null)
    {
      Drawable localDrawable = this.o00o000;
      ((ImageView)localObject).setImageDrawable(localDrawable);
    }
    i = R.id.group_divider;
    localObject = (ImageView)findViewById(i);
    this.o00OooOO = ((ImageView)localObject);
    i = R.id.content;
    localObject = (LinearLayout)findViewById(i);
    this.o00OooOo = ((LinearLayout)localObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = this.o00Ooo00;
    if (localObject != null)
    {
      boolean bool = this.o00o0000;
      if (bool)
      {
        localObject = getLayoutParams();
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.o00Ooo00.getLayoutParams();
        int i = ((ViewGroup.LayoutParams)localObject).height;
        if (i > 0)
        {
          int j = localLayoutParams.width;
          if (j <= 0) {
            localLayoutParams.width = i;
          }
        }
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean prefersCondensedTitle()
  {
    return false;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      localObject1 = this.o00Ooo0;
      if (localObject1 == null)
      {
        localObject1 = this.o00Ooo0o;
        if (localObject1 == null) {
          return;
        }
      }
    }
    Object localObject1 = this.o00OoOoo;
    boolean bool1 = ((MenuItemImpl)localObject1).isExclusiveCheckable();
    Object localObject2;
    if (bool1)
    {
      localObject1 = this.o00Ooo0;
      if (localObject1 == null) {
        OooO0o0();
      }
      localObject1 = this.o00Ooo0;
      localObject2 = this.o00Ooo0o;
    }
    else
    {
      localObject1 = this.o00Ooo0o;
      if (localObject1 == null) {
        OooO0OO();
      }
      localObject1 = this.o00Ooo0o;
      localObject2 = this.o00Ooo0;
    }
    boolean bool2 = true;
    Object localObject3;
    if (paramBoolean)
    {
      localObject3 = this.o00OoOoo;
      paramBoolean = ((MenuItemImpl)localObject3).isChecked();
      ((CompoundButton)localObject1).setChecked(paramBoolean);
      paramBoolean = ((View)localObject1).getVisibility();
      if (paramBoolean)
      {
        paramBoolean = false;
        localObject3 = null;
        ((View)localObject1).setVisibility(0);
      }
      if (localObject2 != null)
      {
        paramBoolean = ((View)localObject2).getVisibility();
        if (paramBoolean != bool2) {
          ((View)localObject2).setVisibility(bool2);
        }
      }
    }
    else
    {
      localObject3 = this.o00Ooo0o;
      if (localObject3 != null) {
        ((View)localObject3).setVisibility(bool2);
      }
      localObject3 = this.o00Ooo0;
      if (localObject3 != null) {
        ((View)localObject3).setVisibility(bool2);
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((MenuItemImpl)localObject).isExclusiveCheckable();
    if (bool)
    {
      localObject = this.o00Ooo0;
      if (localObject == null) {
        OooO0o0();
      }
      localObject = this.o00Ooo0;
    }
    else
    {
      localObject = this.o00Ooo0o;
      if (localObject == null) {
        OooO0OO();
      }
      localObject = this.o00Ooo0o;
    }
    ((CompoundButton)localObject).setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.oo00oO = paramBoolean;
    this.o00o0000 = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    ImageView localImageView = this.o00OooOO;
    if (localImageView != null)
    {
      boolean bool = this.o00o000O;
      if ((!bool) && (paramBoolean)) {
        paramBoolean = false;
      } else {
        paramBoolean = true;
      }
      localImageView.setVisibility(paramBoolean);
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    MenuItemImpl localMenuItemImpl = this.o00OoOoo;
    boolean bool1 = localMenuItemImpl.OooOOO();
    if (!bool1)
    {
      bool1 = this.oo00oO;
      if (!bool1)
      {
        bool1 = false;
        localMenuItemImpl = null;
        break label35;
      }
    }
    bool1 = true;
    label35:
    boolean bool2;
    if (!bool1)
    {
      bool2 = this.o00o0000;
      if (!bool2) {
        return;
      }
    }
    ImageView localImageView = this.o00Ooo00;
    if ((localImageView == null) && (paramDrawable == null))
    {
      boolean bool3 = this.o00o0000;
      if (!bool3) {
        return;
      }
    }
    if (localImageView == null) {
      OooO0Oo();
    }
    int i;
    if (paramDrawable == null)
    {
      bool2 = this.o00o0000;
      if (!bool2)
      {
        paramDrawable = this.o00Ooo00;
        i = 8;
        paramDrawable.setVisibility(i);
        return;
      }
    }
    localImageView = this.o00Ooo00;
    if (i == 0)
    {
      j = 0;
      paramDrawable = null;
    }
    localImageView.setImageDrawable(paramDrawable);
    paramDrawable = this.o00Ooo00;
    int j = paramDrawable.getVisibility();
    if (j != 0)
    {
      paramDrawable = this.o00Ooo00;
      paramDrawable.setVisibility(0);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    int i;
    int j;
    if (paramCharSequence != null)
    {
      TextView localTextView = this.o00Ooo0O;
      localTextView.setText(paramCharSequence);
      paramCharSequence = this.o00Ooo0O;
      i = paramCharSequence.getVisibility();
      if (i == 0) {
        return;
      }
      paramCharSequence = this.o00Ooo0O;
      j = 0;
      localTextView = null;
    }
    else
    {
      paramCharSequence = this.o00Ooo0O;
      i = paramCharSequence.getVisibility();
      j = 8;
      if (i == j) {
        return;
      }
      paramCharSequence = this.o00Ooo0O;
    }
    paramCharSequence.setVisibility(j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.ListMenuItemView
 * JD-Core Version:    0.7.0.1
 */