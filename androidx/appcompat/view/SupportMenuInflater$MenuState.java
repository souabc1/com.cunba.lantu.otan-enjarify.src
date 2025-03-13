package androidx.appcompat.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

class SupportMenuInflater$MenuState
{
  public int OooO;
  public Menu OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public boolean OooO0o;
  public int OooO0o0;
  public boolean OooO0oO;
  public boolean OooO0oo;
  public int OooOO0;
  public CharSequence OooOO0O;
  public CharSequence OooOO0o;
  public char OooOOO;
  public int OooOOO0;
  public int OooOOOO;
  public char OooOOOo;
  public int OooOOo;
  public int OooOOo0;
  public boolean OooOOoo;
  public String OooOo;
  public boolean OooOo0;
  public boolean OooOo00;
  public int OooOo0O;
  public int OooOo0o;
  public String OooOoO;
  public String OooOoO0;
  public ActionProvider OooOoOO;
  public CharSequence OooOoo;
  public CharSequence OooOoo0;
  public ColorStateList OooOooO = null;
  public PorterDuff.Mode OooOooo = null;
  
  public SupportMenuInflater$MenuState(SupportMenuInflater paramSupportMenuInflater, Menu paramMenu)
  {
    this.OooO00o = paramMenu;
    OooO0oo();
  }
  
  private void setItem(MenuItem paramMenuItem)
  {
    boolean bool1 = this.OooOOoo;
    Object localObject1 = paramMenuItem.setChecked(bool1);
    boolean bool4 = this.OooOo00;
    localObject1 = ((MenuItem)localObject1).setVisible(bool4);
    bool4 = this.OooOo0;
    localObject1 = ((MenuItem)localObject1).setEnabled(bool4);
    int m = this.OooOOo;
    int i1 = 0;
    Object[] arrayOfObject = null;
    int i2 = 1;
    if (m >= i2)
    {
      m = i2;
    }
    else
    {
      m = 0;
      localObject2 = null;
    }
    localObject1 = ((MenuItem)localObject1).setCheckable(m);
    Object localObject2 = this.OooOO0o;
    localObject1 = ((MenuItem)localObject1).setTitleCondensed((CharSequence)localObject2);
    int n = this.OooOOO0;
    ((MenuItem)localObject1).setIcon(n);
    int i = this.OooOo0O;
    if (i >= 0) {
      paramMenuItem.setShowAsAction(i);
    }
    localObject1 = this.OooOoO;
    if (localObject1 != null)
    {
      localObject1 = this.Oooo000.OooO0OO;
      boolean bool2 = ((Context)localObject1).isRestricted();
      if (!bool2)
      {
        localObject1 = new androidx/appcompat/view/SupportMenuInflater$InflatedOnMenuItemClickListener;
        localObject2 = this.Oooo000.getRealOwner();
        String str = this.OooOoO;
        ((SupportMenuInflater.InflatedOnMenuItemClickListener)localObject1).<init>(localObject2, str);
        paramMenuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)localObject1);
      }
      else
      {
        paramMenuItem = new java/lang/IllegalStateException;
        paramMenuItem.<init>("The android:onClick attribute cannot be used within a restricted context");
        throw paramMenuItem;
      }
    }
    int j = this.OooOOo;
    n = 2;
    if (j >= n)
    {
      boolean bool3 = paramMenuItem instanceof MenuItemImpl;
      if (bool3)
      {
        localObject1 = paramMenuItem;
        localObject1 = (MenuItemImpl)paramMenuItem;
        ((MenuItemImpl)localObject1).setExclusiveCheckable(i2);
      }
      else
      {
        bool3 = paramMenuItem instanceof MenuItemWrapperICS;
        if (bool3)
        {
          localObject1 = paramMenuItem;
          localObject1 = (MenuItemWrapperICS)paramMenuItem;
          ((MenuItemWrapperICS)localObject1).setExclusiveCheckable(i2);
        }
      }
    }
    localObject1 = this.OooOo;
    if (localObject1 != null)
    {
      localObject2 = SupportMenuInflater.OooO0o0;
      arrayOfObject = this.Oooo000.OooO00o;
      localObject1 = (View)OooO0o0((String)localObject1, (Class[])localObject2, arrayOfObject);
      ((MenuItem)paramMenuItem).setActionView((View)localObject1);
      i1 = i2;
    }
    int k = this.OooOo0o;
    if ((k > 0) && (i1 == 0)) {
      ((MenuItem)paramMenuItem).setActionView(k);
    }
    localObject1 = this.OooOoOO;
    if (localObject1 != null) {
      MenuItemCompat.OooO00o((MenuItem)paramMenuItem, (ActionProvider)localObject1);
    }
    localObject1 = this.OooOoo0;
    MenuItemCompat.OooO0OO((MenuItem)paramMenuItem, (CharSequence)localObject1);
    localObject1 = this.OooOoo;
    MenuItemCompat.OooO0oO((MenuItem)paramMenuItem, (CharSequence)localObject1);
    k = this.OooOOO;
    n = this.OooOOOO;
    MenuItemCompat.OooO0O0((MenuItem)paramMenuItem, k, n);
    char c = this.OooOOOo;
    n = this.OooOOo0;
    MenuItemCompat.OooO0o((MenuItem)paramMenuItem, c, n);
    localObject1 = this.OooOooo;
    if (localObject1 != null) {
      MenuItemCompat.OooO0o0((MenuItem)paramMenuItem, (PorterDuff.Mode)localObject1);
    }
    localObject1 = this.OooOooO;
    if (localObject1 != null) {
      MenuItemCompat.OooO0Oo((MenuItem)paramMenuItem, (ColorStateList)localObject1);
    }
  }
  
  public void OooO00o()
  {
    this.OooO0oo = true;
    Object localObject = this.OooO00o;
    int i = this.OooO0O0;
    int j = this.OooO;
    int k = this.OooOO0;
    CharSequence localCharSequence = this.OooOO0O;
    localObject = ((Menu)localObject).add(i, j, k, localCharSequence);
    setItem((MenuItem)localObject);
  }
  
  public SubMenu OooO0O0()
  {
    this.OooO0oo = true;
    Object localObject = this.OooO00o;
    int i = this.OooO0O0;
    int j = this.OooO;
    int k = this.OooOO0;
    CharSequence localCharSequence = this.OooOO0O;
    localObject = ((Menu)localObject).addSubMenu(i, j, k, localCharSequence);
    MenuItem localMenuItem = ((SubMenu)localObject).getItem();
    setItem(localMenuItem);
    return localObject;
  }
  
  public final char OooO0OO(String paramString)
  {
    if (paramString == null) {
      return '\000';
    }
    return paramString.charAt(0);
  }
  
  public boolean OooO0Oo()
  {
    return this.OooO0oo;
  }
  
  public void OooO0o(AttributeSet paramAttributeSet)
  {
    Context localContext = this.Oooo000.OooO0OO;
    int[] arrayOfInt = R.styleable.MenuGroup;
    paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = R.styleable.MenuGroup_android_id;
    i = paramAttributeSet.getResourceId(i, 0);
    this.OooO0O0 = i;
    i = R.styleable.MenuGroup_android_menuCategory;
    i = paramAttributeSet.getInt(i, 0);
    this.OooO0OO = i;
    i = R.styleable.MenuGroup_android_orderInCategory;
    i = paramAttributeSet.getInt(i, 0);
    this.OooO0Oo = i;
    i = R.styleable.MenuGroup_android_checkableBehavior;
    i = paramAttributeSet.getInt(i, 0);
    this.OooO0o0 = i;
    i = R.styleable.MenuGroup_android_visible;
    boolean bool3 = true;
    boolean bool1 = paramAttributeSet.getBoolean(i, bool3);
    this.OooO0o = bool1;
    int j = R.styleable.MenuGroup_android_enabled;
    boolean bool2 = paramAttributeSet.getBoolean(j, bool3);
    this.OooO0oO = bool2;
    paramAttributeSet.recycle();
  }
  
  public final Object OooO0o0(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = this.Oooo000;
      localObject = ((SupportMenuInflater)localObject).OooO0OO;
      localObject = ((Context)localObject).getClassLoader();
      localObject = Class.forName(paramString, false, (ClassLoader)localObject);
      paramArrayOfClass = ((Class)localObject).getConstructor(paramArrayOfClass);
      boolean bool = true;
      paramArrayOfClass.setAccessible(bool);
      return paramArrayOfClass.newInstance(paramArrayOfObject);
    }
    catch (Exception localException)
    {
      paramArrayOfClass = new java/lang/StringBuilder;
      paramArrayOfClass.<init>();
      paramArrayOfClass.append("Cannot instantiate class: ");
      paramArrayOfClass.append(paramString);
    }
    return null;
  }
  
  public void OooO0oO(AttributeSet paramAttributeSet)
  {
    Object localObject1 = this.Oooo000.OooO0OO;
    int[] arrayOfInt = R.styleable.MenuItem;
    paramAttributeSet = TintTypedArray.OooOOO((Context)localObject1, paramAttributeSet, arrayOfInt);
    int i = R.styleable.MenuItem_android_id;
    arrayOfInt = null;
    i = paramAttributeSet.OooOO0O(i, 0);
    this.OooO = i;
    i = R.styleable.MenuItem_android_menuCategory;
    int i4 = this.OooO0OO;
    i = paramAttributeSet.OooO0oo(i, i4);
    i4 = R.styleable.MenuItem_android_orderInCategory;
    int i6 = this.OooO0Oo;
    i4 = paramAttributeSet.OooO0oo(i4, i6);
    i &= 0xFFFF0000;
    i6 = (char)-1;
    i4 &= i6;
    i |= i4;
    this.OooOO0 = i;
    i = R.styleable.MenuItem_android_title;
    localObject1 = paramAttributeSet.getText(i);
    this.OooOO0O = ((CharSequence)localObject1);
    i = R.styleable.MenuItem_android_titleCondensed;
    localObject1 = paramAttributeSet.getText(i);
    this.OooOO0o = ((CharSequence)localObject1);
    i = R.styleable.MenuItem_android_icon;
    i = paramAttributeSet.OooOO0O(i, 0);
    this.OooOOO0 = i;
    i = R.styleable.MenuItem_android_alphabeticShortcut;
    localObject1 = paramAttributeSet.getString(i);
    i = OooO0OO((String)localObject1);
    this.OooOOO = i;
    i = R.styleable.MenuItem_alphabeticModifiers;
    i4 = 4096;
    i = paramAttributeSet.OooO0oo(i, i4);
    this.OooOOOO = i;
    i = R.styleable.MenuItem_android_numericShortcut;
    localObject1 = paramAttributeSet.getString(i);
    i = OooO0OO((String)localObject1);
    this.OooOOOo = i;
    i = R.styleable.MenuItem_numericModifiers;
    i = paramAttributeSet.OooO0oo(i, i4);
    this.OooOOo0 = i;
    i = R.styleable.MenuItem_android_checkable;
    boolean bool1 = paramAttributeSet.OooOO0o(i);
    if (bool1)
    {
      int j = R.styleable.MenuItem_android_checkable;
      boolean bool2 = paramAttributeSet.OooO00o(j, false);
    }
    else
    {
      k = this.OooO0o0;
    }
    this.OooOOo = k;
    int k = R.styleable.MenuItem_android_checked;
    boolean bool3 = paramAttributeSet.OooO00o(k, false);
    this.OooOOoo = bool3;
    int m = R.styleable.MenuItem_android_visible;
    boolean bool8 = this.OooO0o;
    boolean bool4 = paramAttributeSet.OooO00o(m, bool8);
    this.OooOo00 = bool4;
    int n = R.styleable.MenuItem_android_enabled;
    bool8 = this.OooO0oO;
    boolean bool5 = paramAttributeSet.OooO00o(n, bool8);
    this.OooOo0 = bool5;
    int i1 = R.styleable.MenuItem_showAsAction;
    int i5 = -1;
    i1 = paramAttributeSet.OooO0oo(i1, i5);
    this.OooOo0O = i1;
    i1 = R.styleable.MenuItem_android_onClick;
    localObject1 = paramAttributeSet.getString(i1);
    this.OooOoO = ((String)localObject1);
    i1 = R.styleable.MenuItem_actionLayout;
    i1 = paramAttributeSet.OooOO0O(i1, 0);
    this.OooOo0o = i1;
    i1 = R.styleable.MenuItem_actionViewClass;
    localObject1 = paramAttributeSet.getString(i1);
    this.OooOo = ((String)localObject1);
    i1 = R.styleable.MenuItem_actionProviderClass;
    localObject1 = paramAttributeSet.getString(i1);
    this.OooOoO0 = ((String)localObject1);
    Object localObject2;
    if (localObject1 != null)
    {
      i6 = 1;
    }
    else
    {
      i6 = 0;
      localObject2 = null;
    }
    if (i6 != 0)
    {
      i6 = this.OooOo0o;
      if (i6 == 0)
      {
        localObject2 = this.OooOo;
        if (localObject2 == null)
        {
          localObject2 = SupportMenuInflater.OooO0o;
          Object[] arrayOfObject = this.Oooo000.OooO0O0;
          localObject1 = (ActionProvider)OooO0o0((String)localObject1, (Class[])localObject2, arrayOfObject);
          this.OooOoOO = ((ActionProvider)localObject1);
          break label565;
        }
      }
    }
    this.OooOoOO = null;
    label565:
    i1 = R.styleable.MenuItem_contentDescription;
    localObject1 = paramAttributeSet.getText(i1);
    this.OooOoo0 = ((CharSequence)localObject1);
    i1 = R.styleable.MenuItem_tooltipText;
    localObject1 = paramAttributeSet.getText(i1);
    this.OooOoo = ((CharSequence)localObject1);
    i1 = R.styleable.MenuItem_iconTintMode;
    boolean bool6 = paramAttributeSet.OooOO0o(i1);
    if (bool6)
    {
      i2 = R.styleable.MenuItem_iconTintMode;
      i2 = paramAttributeSet.OooO0oo(i2, i5);
      PorterDuff.Mode localMode = this.OooOooo;
      localObject1 = DrawableUtils.OooO0o0(i2, localMode);
      this.OooOooo = ((PorterDuff.Mode)localObject1);
    }
    else
    {
      this.OooOooo = null;
    }
    int i2 = R.styleable.MenuItem_iconTint;
    boolean bool7 = paramAttributeSet.OooOO0o(i2);
    if (bool7)
    {
      int i3 = R.styleable.MenuItem_iconTint;
      localObject1 = paramAttributeSet.getColorStateList(i3);
      this.OooOooO = ((ColorStateList)localObject1);
    }
    else
    {
      this.OooOooO = null;
    }
    paramAttributeSet.OooOOOo();
    this.OooO0oo = false;
  }
  
  public void OooO0oo()
  {
    this.OooO0O0 = 0;
    this.OooO0OO = 0;
    this.OooO0Oo = 0;
    this.OooO0o0 = 0;
    boolean bool = true;
    this.OooO0o = bool;
    this.OooO0oO = bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.SupportMenuInflater.MenuState
 * JD-Core Version:    0.7.0.1
 */