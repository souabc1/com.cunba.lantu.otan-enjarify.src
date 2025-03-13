package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;

public class WindowDecorActionBar
  extends ActionBar
  implements ActionBarOverlayLayout.ActionBarVisibilityCallback
{
  public static final Interpolator Oooo000;
  public static final Interpolator Oooo00O;
  public ScrollingTabContainerView OooO;
  public Context OooO00o;
  public Context OooO0O0;
  public Activity OooO0OO;
  public ActionBarOverlayLayout OooO0Oo;
  public DecorToolbar OooO0o;
  public ActionBarContainer OooO0o0;
  public ActionBarContextView OooO0oO;
  public View OooO0oo;
  public ArrayList OooOO0;
  public WindowDecorActionBar.TabImpl OooOO0O;
  public int OooOO0o;
  public WindowDecorActionBar.ActionModeImpl OooOOO;
  public boolean OooOOO0;
  public ActionMode OooOOOO;
  public ActionMode.Callback OooOOOo;
  public ArrayList OooOOo;
  public boolean OooOOo0;
  public boolean OooOOoo;
  public boolean OooOo;
  public boolean OooOo0;
  public int OooOo00;
  public boolean OooOo0O;
  public boolean OooOo0o;
  public ViewPropertyAnimatorCompatSet OooOoO;
  public boolean OooOoO0;
  public boolean OooOoOO;
  public final ViewPropertyAnimatorListener OooOoo;
  public boolean OooOoo0;
  public final ViewPropertyAnimatorListener OooOooO;
  public final ViewPropertyAnimatorUpdateListener OooOooo;
  
  static
  {
    Object localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>();
    Oooo000 = (Interpolator)localObject;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>();
    Oooo00O = (Interpolator)localObject;
  }
  
  public WindowDecorActionBar(Activity paramActivity, boolean paramBoolean)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooOO0 = ((ArrayList)localObject);
    this.OooOO0o = -1;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooOOo = ((ArrayList)localObject);
    this.OooOo00 = 0;
    boolean bool = true;
    this.OooOo0 = bool;
    this.OooOoO0 = bool;
    localObject = new androidx/appcompat/app/WindowDecorActionBar$1;
    ((WindowDecorActionBar.1)localObject).<init>(this);
    this.OooOoo = ((ViewPropertyAnimatorListener)localObject);
    localObject = new androidx/appcompat/app/WindowDecorActionBar$2;
    ((WindowDecorActionBar.2)localObject).<init>(this);
    this.OooOooO = ((ViewPropertyAnimatorListener)localObject);
    localObject = new androidx/appcompat/app/WindowDecorActionBar$3;
    ((WindowDecorActionBar.3)localObject).<init>(this);
    this.OooOooo = ((ViewPropertyAnimatorUpdateListener)localObject);
    this.OooO0OO = paramActivity;
    paramActivity = paramActivity.getWindow().getDecorView();
    OooOoO0(paramActivity);
    if (!paramBoolean)
    {
      paramBoolean = 16908290;
      paramActivity = paramActivity.findViewById(paramBoolean);
      this.OooO0oo = paramActivity;
    }
  }
  
  public WindowDecorActionBar(Dialog paramDialog)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooOO0 = ((ArrayList)localObject);
    this.OooOO0o = -1;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooOOo = ((ArrayList)localObject);
    this.OooOo00 = 0;
    boolean bool = true;
    this.OooOo0 = bool;
    this.OooOoO0 = bool;
    localObject = new androidx/appcompat/app/WindowDecorActionBar$1;
    ((WindowDecorActionBar.1)localObject).<init>(this);
    this.OooOoo = ((ViewPropertyAnimatorListener)localObject);
    localObject = new androidx/appcompat/app/WindowDecorActionBar$2;
    ((WindowDecorActionBar.2)localObject).<init>(this);
    this.OooOooO = ((ViewPropertyAnimatorListener)localObject);
    localObject = new androidx/appcompat/app/WindowDecorActionBar$3;
    ((WindowDecorActionBar.3)localObject).<init>(this);
    this.OooOooo = ((ViewPropertyAnimatorUpdateListener)localObject);
    paramDialog = paramDialog.getWindow().getDecorView();
    OooOoO0(paramDialog);
  }
  
  public static boolean OooOOo(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = true;
    if (paramBoolean3) {
      return bool;
    }
    if ((!paramBoolean1) && (!paramBoolean2)) {
      return bool;
    }
    return false;
  }
  
  private void setHasEmbeddedTabs(boolean paramBoolean)
  {
    this.OooOOoo = paramBoolean;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2;
    if (!paramBoolean)
    {
      this.OooO0o.setEmbeddedTabView(null);
      localObject2 = this.OooO0o0;
      localObject1 = this.OooO;
      ((ActionBarContainer)localObject2).setTabContainer((ScrollingTabContainerView)localObject1);
    }
    else
    {
      this.OooO0o0.setTabContainer(null);
      localObject2 = this.OooO0o;
      localObject1 = this.OooO;
      ((DecorToolbar)localObject2).setEmbeddedTabView((ScrollingTabContainerView)localObject1);
    }
    paramBoolean = getNavigationMode();
    bool1 = true;
    boolean bool2 = true;
    if (paramBoolean == bool1)
    {
      paramBoolean = bool2;
    }
    else
    {
      paramBoolean = false;
      localObject2 = null;
    }
    localObject1 = this.OooO;
    if (localObject1 != null) {
      if (paramBoolean)
      {
        ((View)localObject1).setVisibility(0);
        localObject1 = this.OooO0Oo;
        if (localObject1 != null) {
          ViewCompat.o00o0O((View)localObject1);
        }
      }
      else
      {
        int i = 8;
        ((View)localObject1).setVisibility(i);
      }
    }
    localObject1 = this.OooO0o;
    boolean bool3 = this.OooOOoo;
    if ((!bool3) && (paramBoolean)) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    ((DecorToolbar)localObject1).setCollapsible(bool3);
    localObject1 = this.OooO0Oo;
    bool3 = this.OooOOoo;
    if ((bool3) || (!paramBoolean)) {
      bool2 = false;
    }
    ((ActionBarOverlayLayout)localObject1).setHasNonEmbeddedTabs(bool2);
  }
  
  public void OooO(boolean paramBoolean)
  {
    boolean bool = this.OooOOo0;
    if (paramBoolean == bool) {
      return;
    }
    this.OooOOo0 = paramBoolean;
    ArrayList localArrayList = this.OooOOo;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      ActionBar.OnMenuVisibilityListener localOnMenuVisibilityListener = (ActionBar.OnMenuVisibilityListener)this.OooOOo.get(j);
      localOnMenuVisibilityListener.OooO00o(paramBoolean);
      j += 1;
    }
  }
  
  public void OooO00o()
  {
    boolean bool = this.OooOo0o;
    if (bool)
    {
      this.OooOo0o = false;
      bool = true;
      OooOoo(bool);
    }
  }
  
  public void OooO0O0() {}
  
  public void OooO0OO(boolean paramBoolean)
  {
    this.OooOo0 = paramBoolean;
  }
  
  public void OooO0Oo()
  {
    boolean bool = this.OooOo0o;
    if (!bool)
    {
      bool = true;
      this.OooOo0o = bool;
      OooOoo(bool);
    }
  }
  
  public void OooO0o(int paramInt)
  {
    this.OooOo00 = paramInt;
  }
  
  public void OooO0o0()
  {
    ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = this.OooOoO;
    if (localViewPropertyAnimatorCompatSet != null)
    {
      localViewPropertyAnimatorCompatSet.OooO00o();
      localViewPropertyAnimatorCompatSet = null;
      this.OooOoO = null;
    }
  }
  
  public boolean OooO0oo()
  {
    DecorToolbar localDecorToolbar = this.OooO0o;
    if (localDecorToolbar != null)
    {
      boolean bool = localDecorToolbar.OooO0oO();
      if (bool)
      {
        this.OooO0o.collapseActionView();
        return true;
      }
    }
    return false;
  }
  
  public void OooOO0O(Configuration paramConfiguration)
  {
    boolean bool = ActionBarPolicy.OooO0O0(this.OooO00o).OooO0OO();
    setHasEmbeddedTabs(bool);
  }
  
  public boolean OooOOO0(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = this.OooOOO;
    if (localObject == null) {
      return false;
    }
    localObject = ((WindowDecorActionBar.ActionModeImpl)localObject).getMenu();
    if (localObject != null)
    {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      }
      KeyCharacterMap localKeyCharacterMap = KeyCharacterMap.load(i);
      int i = localKeyCharacterMap.getKeyboardType();
      int j = 1;
      if (i == j) {
        j = 0;
      }
      ((Menu)localObject).setQwertyMode(j);
      return ((Menu)localObject).performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public ActionMode OooOOOo(ActionMode.Callback paramCallback)
  {
    WindowDecorActionBar.ActionModeImpl localActionModeImpl = this.OooOOO;
    if (localActionModeImpl != null) {
      localActionModeImpl.OooO00o();
    }
    this.OooO0Oo.setHideOnContentScrollEnabled(false);
    this.OooO0oO.OooOO0O();
    localActionModeImpl = new androidx/appcompat/app/WindowDecorActionBar$ActionModeImpl;
    Context localContext = this.OooO0oO.getContext();
    localActionModeImpl.<init>(this, localContext, paramCallback);
    boolean bool = localActionModeImpl.OooO0OO();
    if (bool)
    {
      this.OooOOO = localActionModeImpl;
      localActionModeImpl.OooO0O0();
      this.OooO0oO.OooO(localActionModeImpl);
      OooOOo0(true);
      return localActionModeImpl;
    }
    return null;
  }
  
  public void OooOOo0(boolean paramBoolean)
  {
    if (paramBoolean) {
      OooOoo0();
    } else {
      OooOo();
    }
    boolean bool = OooOoOO();
    int i = 4;
    int j = 8;
    Object localObject;
    if (bool)
    {
      long l1 = 100;
      long l2 = 200L;
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat;
      if (paramBoolean)
      {
        localObject = this.OooO0o.OooO0oo(i, l1);
        localViewPropertyAnimatorCompat = this.OooO0oO.OooO0o(0, l2);
      }
      else
      {
        localViewPropertyAnimatorCompat = this.OooO0o.OooO0oo(0, l2);
        localObject = this.OooO0oO.OooO0o(j, l1);
      }
      ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = new androidx/appcompat/view/ViewPropertyAnimatorCompatSet;
      localViewPropertyAnimatorCompatSet.<init>();
      localViewPropertyAnimatorCompatSet.OooO0Oo((ViewPropertyAnimatorCompat)localObject, localViewPropertyAnimatorCompat);
      localViewPropertyAnimatorCompatSet.OooO0oo();
    }
    else if (paramBoolean)
    {
      this.OooO0o.setVisibility(i);
      localObject = this.OooO0oO;
      ((ActionBarContextView)localObject).setVisibility(0);
    }
    else
    {
      this.OooO0o.setVisibility(0);
      localObject = this.OooO0oO;
      ((ActionBarContextView)localObject).setVisibility(j);
    }
  }
  
  public void OooOOoo()
  {
    ActionMode.Callback localCallback = this.OooOOOo;
    if (localCallback != null)
    {
      ActionMode localActionMode = this.OooOOOO;
      localCallback.OooO00o(localActionMode);
      localCallback = null;
      this.OooOOOO = null;
      this.OooOOOo = null;
    }
  }
  
  public final void OooOo()
  {
    boolean bool = this.OooOo;
    if (bool)
    {
      bool = false;
      this.OooOo = false;
      ActionBarOverlayLayout localActionBarOverlayLayout = this.OooO0Oo;
      if (localActionBarOverlayLayout != null) {
        localActionBarOverlayLayout.setShowingForActionMode(false);
      }
      OooOoo(false);
    }
  }
  
  public void OooOo0(boolean paramBoolean)
  {
    Object localObject1 = this.OooOoO;
    if (localObject1 != null) {
      ((ViewPropertyAnimatorCompatSet)localObject1).OooO00o();
    }
    localObject1 = this.OooO0o0;
    boolean bool1 = false;
    Object localObject2 = null;
    ((ActionBarContainer)localObject1).setVisibility(0);
    int i = this.OooOo00;
    if (i == 0)
    {
      boolean bool2 = this.OooOoOO;
      if ((bool2) || (paramBoolean))
      {
        this.OooO0o0.setTranslationY(0.0F);
        localObject1 = this.OooO0o0;
        j = -((View)localObject1).getHeight();
        f1 = j;
        if (paramBoolean)
        {
          localObject3 = new int[] { 0, 0 };
          localObject2 = this.OooO0o0;
          ((View)localObject2).getLocationInWindow((int[])localObject3);
          bool1 = true;
          paramBoolean = localObject3[bool1];
          float f2 = paramBoolean;
          f1 -= f2;
        }
        this.OooO0o0.setTranslationY(f1);
        localObject3 = new androidx/appcompat/view/ViewPropertyAnimatorCompatSet;
        ((ViewPropertyAnimatorCompatSet)localObject3).<init>();
        localObject2 = ViewCompat.OooO0o0(this.OooO0o0).OooOO0o(0.0F);
        ViewPropertyAnimatorUpdateListener localViewPropertyAnimatorUpdateListener = this.OooOooo;
        ((ViewPropertyAnimatorCompat)localObject2).OooOO0(localViewPropertyAnimatorUpdateListener);
        ((ViewPropertyAnimatorCompatSet)localObject3).OooO0OO((ViewPropertyAnimatorCompat)localObject2);
        bool1 = this.OooOo0;
        if (bool1)
        {
          localObject2 = this.OooO0oo;
          if (localObject2 != null)
          {
            ((View)localObject2).setTranslationY(f1);
            localObject1 = ViewCompat.OooO0o0(this.OooO0oo).OooOO0o(0.0F);
            ((ViewPropertyAnimatorCompatSet)localObject3).OooO0OO((ViewPropertyAnimatorCompat)localObject1);
          }
        }
        localObject1 = Oooo00O;
        ((ViewPropertyAnimatorCompatSet)localObject3).OooO0o((Interpolator)localObject1);
        long l = 250L;
        ((ViewPropertyAnimatorCompatSet)localObject3).OooO0o0(l);
        localObject1 = this.OooOooO;
        ((ViewPropertyAnimatorCompatSet)localObject3).OooO0oO((ViewPropertyAnimatorListener)localObject1);
        this.OooOoO = ((ViewPropertyAnimatorCompatSet)localObject3);
        ((ViewPropertyAnimatorCompatSet)localObject3).OooO0oo();
        break label360;
      }
    }
    Object localObject3 = this.OooO0o0;
    int j = 1065353216;
    float f1 = 1.0F;
    ((View)localObject3).setAlpha(f1);
    localObject3 = this.OooO0o0;
    ((View)localObject3).setTranslationY(0.0F);
    paramBoolean = this.OooOo0;
    if (paramBoolean)
    {
      localObject3 = this.OooO0oo;
      if (localObject3 != null) {
        ((View)localObject3).setTranslationY(0.0F);
      }
    }
    localObject3 = this.OooOooO;
    j = 0;
    f1 = 0.0F;
    localObject1 = null;
    ((ViewPropertyAnimatorListener)localObject3).OooO0O0(null);
    label360:
    localObject3 = this.OooO0Oo;
    if (localObject3 != null) {
      ViewCompat.o00o0O((View)localObject3);
    }
  }
  
  public void OooOo00(boolean paramBoolean)
  {
    Object localObject1 = this.OooOoO;
    if (localObject1 != null) {
      ((ViewPropertyAnimatorCompatSet)localObject1).OooO00o();
    }
    int i = this.OooOo00;
    if (i == 0)
    {
      bool1 = this.OooOoOO;
      if ((bool1) || (paramBoolean))
      {
        this.OooO0o0.setAlpha(1.0F);
        localObject1 = this.OooO0o0;
        boolean bool2 = true;
        ((ActionBarContainer)localObject1).setTransitioning(bool2);
        localObject1 = new androidx/appcompat/view/ViewPropertyAnimatorCompatSet;
        ((ViewPropertyAnimatorCompatSet)localObject1).<init>();
        ActionBarContainer localActionBarContainer1 = this.OooO0o0;
        int j = -localActionBarContainer1.getHeight();
        float f1 = j;
        if (paramBoolean)
        {
          localObject2 = new int[] { 0, 0 };
          ActionBarContainer localActionBarContainer2 = this.OooO0o0;
          localActionBarContainer2.getLocationInWindow((int[])localObject2);
          paramBoolean = localObject2[bool2];
          float f2 = paramBoolean;
          f1 -= f2;
        }
        localObject2 = ViewCompat.OooO0o0(this.OooO0o0).OooOO0o(f1);
        ViewPropertyAnimatorUpdateListener localViewPropertyAnimatorUpdateListener = this.OooOooo;
        ((ViewPropertyAnimatorCompat)localObject2).OooOO0(localViewPropertyAnimatorUpdateListener);
        ((ViewPropertyAnimatorCompatSet)localObject1).OooO0OO((ViewPropertyAnimatorCompat)localObject2);
        paramBoolean = this.OooOo0;
        if (paramBoolean)
        {
          localObject2 = this.OooO0oo;
          if (localObject2 != null)
          {
            localObject2 = ViewCompat.OooO0o0((View)localObject2).OooOO0o(f1);
            ((ViewPropertyAnimatorCompatSet)localObject1).OooO0OO((ViewPropertyAnimatorCompat)localObject2);
          }
        }
        localObject2 = Oooo000;
        ((ViewPropertyAnimatorCompatSet)localObject1).OooO0o((Interpolator)localObject2);
        long l = 250L;
        ((ViewPropertyAnimatorCompatSet)localObject1).OooO0o0(l);
        localObject2 = this.OooOoo;
        ((ViewPropertyAnimatorCompatSet)localObject1).OooO0oO((ViewPropertyAnimatorListener)localObject2);
        this.OooOoO = ((ViewPropertyAnimatorCompatSet)localObject1);
        ((ViewPropertyAnimatorCompatSet)localObject1).OooO0oo();
        return;
      }
    }
    Object localObject2 = this.OooOoo;
    boolean bool1 = false;
    localObject1 = null;
    ((ViewPropertyAnimatorListener)localObject2).OooO0O0(null);
  }
  
  public final void OooOo0O()
  {
    ScrollingTabContainerView localScrollingTabContainerView = this.OooO;
    if (localScrollingTabContainerView != null) {
      return;
    }
    localScrollingTabContainerView = new androidx/appcompat/widget/ScrollingTabContainerView;
    Object localObject = this.OooO00o;
    localScrollingTabContainerView.<init>((Context)localObject);
    boolean bool = this.OooOOoo;
    if (bool)
    {
      localScrollingTabContainerView.setVisibility(0);
      localObject = this.OooO0o;
      ((DecorToolbar)localObject).setEmbeddedTabView(localScrollingTabContainerView);
    }
    else
    {
      int i = getNavigationMode();
      int j = 2;
      if (i == j)
      {
        localScrollingTabContainerView.setVisibility(0);
        localObject = this.OooO0Oo;
        if (localObject != null) {
          ViewCompat.o00o0O((View)localObject);
        }
      }
      else
      {
        i = 8;
        localScrollingTabContainerView.setVisibility(i);
      }
      localObject = this.OooO0o0;
      ((ActionBarContainer)localObject).setTabContainer(localScrollingTabContainerView);
    }
    this.OooO = localScrollingTabContainerView;
  }
  
  public final DecorToolbar OooOo0o(View paramView)
  {
    boolean bool = paramView instanceof DecorToolbar;
    if (bool) {
      return (DecorToolbar)paramView;
    }
    bool = paramView instanceof Toolbar;
    if (bool) {
      return ((Toolbar)paramView).getWrapper();
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "Can't make a decor toolbar out of ";
    localStringBuilder.append(str);
    if (paramView != null) {
      paramView = paramView.getClass().getSimpleName();
    } else {
      paramView = "null";
    }
    localStringBuilder.append(paramView);
    paramView = localStringBuilder.toString();
    localIllegalStateException.<init>(paramView);
    throw localIllegalStateException;
  }
  
  public void OooOoO(ActionBar.Tab paramTab)
  {
    int i = getNavigationMode();
    int j = 2;
    int k = -1;
    if (i != j)
    {
      if (paramTab != null) {
        k = paramTab.getPosition();
      }
      this.OooOO0o = k;
      return;
    }
    Object localObject1 = this.OooO0OO;
    boolean bool1 = localObject1 instanceof FragmentActivity;
    if (bool1)
    {
      localObject1 = this.OooO0o.getViewGroup();
      bool1 = ((View)localObject1).isInEditMode();
      if (!bool1)
      {
        localObject1 = ((FragmentActivity)this.OooO0OO).getSupportFragmentManager().OooOOo0().OooOOOO();
        break label95;
      }
    }
    bool1 = false;
    localObject1 = null;
    label95:
    Object localObject2 = this.OooOO0O;
    WindowDecorActionBar.TabImpl localTabImpl;
    if (localObject2 == paramTab)
    {
      if (localObject2 != null)
      {
        localObject2 = ((WindowDecorActionBar.TabImpl)localObject2).getCallback();
        localTabImpl = this.OooOO0O;
        ((ActionBar.TabListener)localObject2).OooO0OO(localTabImpl, (FragmentTransaction)localObject1);
        localObject2 = this.OooO;
        int m = paramTab.getPosition();
        ((ScrollingTabContainerView)localObject2).OooO00o(m);
      }
    }
    else
    {
      localObject2 = this.OooO;
      if (paramTab != null) {
        k = paramTab.getPosition();
      }
      ((ScrollingTabContainerView)localObject2).setTabSelected(k);
      localObject2 = this.OooOO0O;
      if (localObject2 != null)
      {
        localObject2 = ((WindowDecorActionBar.TabImpl)localObject2).getCallback();
        localTabImpl = this.OooOO0O;
        ((ActionBar.TabListener)localObject2).OooO0O0(localTabImpl, (FragmentTransaction)localObject1);
      }
      paramTab = (WindowDecorActionBar.TabImpl)paramTab;
      this.OooOO0O = paramTab;
      if (paramTab != null)
      {
        paramTab = paramTab.getCallback();
        localObject2 = this.OooOO0O;
        paramTab.OooO00o((ActionBar.Tab)localObject2, (FragmentTransaction)localObject1);
      }
    }
    if (localObject1 != null)
    {
      boolean bool2 = ((FragmentTransaction)localObject1).isEmpty();
      if (!bool2) {
        ((FragmentTransaction)localObject1).OooOO0();
      }
    }
  }
  
  public final void OooOoO0(View paramView)
  {
    int i = R.id.decor_content_parent;
    Object localObject1 = (ActionBarOverlayLayout)paramView.findViewById(i);
    this.OooO0Oo = ((ActionBarOverlayLayout)localObject1);
    if (localObject1 != null) {
      ((ActionBarOverlayLayout)localObject1).setActionBarVisibilityCallback(this);
    }
    i = R.id.action_bar;
    localObject1 = paramView.findViewById(i);
    localObject1 = OooOo0o((View)localObject1);
    this.OooO0o = ((DecorToolbar)localObject1);
    i = R.id.action_context_bar;
    localObject1 = (ActionBarContextView)paramView.findViewById(i);
    this.OooO0oO = ((ActionBarContextView)localObject1);
    i = R.id.action_bar_container;
    paramView = (ActionBarContainer)paramView.findViewById(i);
    this.OooO0o0 = paramView;
    localObject1 = this.OooO0o;
    if (localObject1 != null)
    {
      localObject2 = this.OooO0oO;
      if ((localObject2 != null) && (paramView != null))
      {
        paramView = ((DecorToolbar)localObject1).getContext();
        this.OooO00o = paramView;
        paramView = this.OooO0o;
        int k = paramView.getDisplayOptions() & 0x4;
        i = 1;
        float f = 1.4E-45F;
        localObject2 = null;
        if (k != 0)
        {
          k = i;
        }
        else
        {
          k = 0;
          paramView = null;
        }
        if (k != 0) {
          this.OooOOO0 = i;
        }
        Object localObject3 = ActionBarPolicy.OooO0O0(this.OooO00o);
        boolean bool2 = ((ActionBarPolicy)localObject3).OooO00o();
        if ((!bool2) && (k == 0))
        {
          k = 0;
          paramView = null;
        }
        else
        {
          k = i;
        }
        setHomeButtonEnabled(k);
        boolean bool1 = ((ActionBarPolicy)localObject3).OooO0OO();
        setHasEmbeddedTabs(bool1);
        paramView = this.OooO00o;
        localObject3 = R.styleable.ActionBar;
        int m = R.attr.actionBarStyle;
        paramView = paramView.obtainStyledAttributes(null, (int[])localObject3, m, 0);
        int n = R.styleable.ActionBar_hideOnContentScroll;
        boolean bool3 = paramView.getBoolean(n, false);
        if (bool3) {
          setHideOnContentScrollEnabled(i);
        }
        int j = R.styleable.ActionBar_elevation;
        j = paramView.getDimensionPixelSize(j, 0);
        if (j != 0)
        {
          f = j;
          setElevation(f);
        }
        paramView.recycle();
        return;
      }
    }
    paramView = new java/lang/IllegalStateException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = getClass().getSimpleName();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(" can only be used with a compatible window decor layout");
    localObject1 = ((StringBuilder)localObject1).toString();
    paramView.<init>((String)localObject1);
    throw paramView;
  }
  
  public final boolean OooOoOO()
  {
    return ViewCompat.OoooOOO(this.OooO0o0);
  }
  
  public final void OooOoo(boolean paramBoolean)
  {
    boolean bool1 = this.OooOo0O;
    boolean bool2 = this.OooOo0o;
    boolean bool3 = this.OooOo;
    bool1 = OooOOo(bool1, bool2, bool3);
    if (bool1)
    {
      bool1 = this.OooOoO0;
      if (!bool1)
      {
        bool1 = true;
        this.OooOoO0 = bool1;
        OooOo0(paramBoolean);
      }
    }
    else
    {
      bool1 = this.OooOoO0;
      if (bool1)
      {
        bool1 = false;
        this.OooOoO0 = false;
        OooOo00(paramBoolean);
      }
    }
  }
  
  public final void OooOoo0()
  {
    boolean bool = this.OooOo;
    if (!bool)
    {
      bool = true;
      this.OooOo = bool;
      ActionBarOverlayLayout localActionBarOverlayLayout = this.OooO0Oo;
      if (localActionBarOverlayLayout != null) {
        localActionBarOverlayLayout.setShowingForActionMode(bool);
      }
      bool = false;
      OooOoo(false);
    }
  }
  
  public View getCustomView()
  {
    return this.OooO0o.getCustomView();
  }
  
  public int getDisplayOptions()
  {
    return this.OooO0o.getDisplayOptions();
  }
  
  public float getElevation()
  {
    return ViewCompat.OooOo0O(this.OooO0o0);
  }
  
  public int getHeight()
  {
    return this.OooO0o0.getHeight();
  }
  
  public int getHideOffset()
  {
    return this.OooO0Oo.getActionBarHideOffset();
  }
  
  public int getNavigationItemCount()
  {
    DecorToolbar localDecorToolbar = this.OooO0o;
    int i = localDecorToolbar.getNavigationMode();
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j) {
        return 0;
      }
      return this.OooOO0.size();
    }
    return this.OooO0o.getDropdownItemCount();
  }
  
  public int getNavigationMode()
  {
    return this.OooO0o.getNavigationMode();
  }
  
  public int getSelectedNavigationIndex()
  {
    Object localObject = this.OooO0o;
    int i = ((DecorToolbar)localObject).getNavigationMode();
    int j = 1;
    if (i != j)
    {
      j = 2;
      int k = -1;
      if (i != j) {
        return k;
      }
      localObject = this.OooOO0O;
      if (localObject != null) {
        k = ((WindowDecorActionBar.TabImpl)localObject).getPosition();
      }
      return k;
    }
    return this.OooO0o.getDropdownSelectedPosition();
  }
  
  public ActionBar.Tab getSelectedTab()
  {
    return this.OooOO0O;
  }
  
  public CharSequence getSubtitle()
  {
    return this.OooO0o.getSubtitle();
  }
  
  public ActionBar.Tab getTabAt(int paramInt)
  {
    return (ActionBar.Tab)this.OooOO0.get(paramInt);
  }
  
  public int getTabCount()
  {
    return this.OooOO0.size();
  }
  
  public Context getThemedContext()
  {
    Object localObject1 = this.OooO0O0;
    if (localObject1 == null)
    {
      localObject1 = new android/util/TypedValue;
      ((TypedValue)localObject1).<init>();
      Object localObject2 = this.OooO00o.getTheme();
      int i = R.attr.actionBarWidgetTheme;
      boolean bool = true;
      ((Resources.Theme)localObject2).resolveAttribute(i, (TypedValue)localObject1, bool);
      int j = ((TypedValue)localObject1).resourceId;
      if (j != 0)
      {
        localObject2 = new android/view/ContextThemeWrapper;
        Context localContext = this.OooO00o;
        ((ContextThemeWrapper)localObject2).<init>(localContext, j);
        this.OooO0O0 = ((Context)localObject2);
      }
      else
      {
        localObject1 = this.OooO00o;
        this.OooO0O0 = ((Context)localObject1);
      }
    }
    return this.OooO0O0;
  }
  
  public CharSequence getTitle()
  {
    return this.OooO0o.getTitle();
  }
  
  public boolean isHideOnContentScrollEnabled()
  {
    return this.OooO0Oo.isHideOnContentScrollEnabled();
  }
  
  public boolean isShowing()
  {
    int i = getHeight();
    boolean bool = this.OooOoO0;
    if (bool) {
      if (i != 0)
      {
        int j = getHideOffset();
        if (j >= i) {}
      }
      else
      {
        return 1;
      }
    }
    i = 0;
    return i;
  }
  
  public boolean isTitleTruncated()
  {
    DecorToolbar localDecorToolbar = this.OooO0o;
    if (localDecorToolbar != null)
    {
      bool = localDecorToolbar.isTitleTruncated();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localDecorToolbar = null;
    return bool;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.OooO0o0.setPrimaryBackground(paramDrawable);
  }
  
  public void setCustomView(int paramInt)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(getThemedContext());
    ViewGroup localViewGroup = this.OooO0o.getViewGroup();
    View localView = localLayoutInflater.inflate(paramInt, localViewGroup, false);
    setCustomView(localView);
  }
  
  public void setCustomView(View paramView)
  {
    this.OooO0o.setCustomView(paramView);
  }
  
  public void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    boolean bool = this.OooOOO0;
    if (!bool) {
      setDisplayHomeAsUpEnabled(paramBoolean);
    }
  }
  
  public void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    setDisplayOptions(paramBoolean, bool);
  }
  
  public void setDisplayOptions(int paramInt)
  {
    int i = paramInt & 0x4;
    if (i != 0)
    {
      i = 1;
      this.OooOOO0 = i;
    }
    this.OooO0o.setDisplayOptions(paramInt);
  }
  
  public void setDisplayOptions(int paramInt1, int paramInt2)
  {
    DecorToolbar localDecorToolbar1 = this.OooO0o;
    int i = localDecorToolbar1.getDisplayOptions();
    int j = paramInt2 & 0x4;
    if (j != 0)
    {
      j = 1;
      this.OooOOO0 = j;
    }
    DecorToolbar localDecorToolbar2 = this.OooO0o;
    paramInt1 &= paramInt2;
    paramInt2 = (paramInt2 ^ 0xFFFFFFFF) & i;
    paramInt1 |= paramInt2;
    localDecorToolbar2.setDisplayOptions(paramInt1);
  }
  
  public void setDisplayShowCustomEnabled(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    setDisplayOptions(paramBoolean, bool);
  }
  
  public void setDisplayShowHomeEnabled(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    setDisplayOptions(paramBoolean, bool);
  }
  
  public void setDisplayShowTitleEnabled(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    setDisplayOptions(paramBoolean, bool);
  }
  
  public void setDisplayUseLogoEnabled(boolean paramBoolean)
  {
    setDisplayOptions(paramBoolean, 1);
  }
  
  public void setElevation(float paramFloat)
  {
    ViewCompat.oo0o0Oo(this.OooO0o0, paramFloat);
  }
  
  public void setHideOffset(int paramInt)
  {
    if (paramInt != 0)
    {
      ActionBarOverlayLayout localActionBarOverlayLayout = this.OooO0Oo;
      boolean bool = localActionBarOverlayLayout.isInOverlayMode();
      if (!bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        throw localIllegalStateException;
      }
    }
    this.OooO0Oo.setActionBarHideOffset(paramInt);
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ActionBarOverlayLayout localActionBarOverlayLayout = this.OooO0Oo;
      boolean bool = localActionBarOverlayLayout.isInOverlayMode();
      if (!bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        throw localIllegalStateException;
      }
    }
    this.OooOoo0 = paramBoolean;
    this.OooO0Oo.setHideOnContentScrollEnabled(paramBoolean);
  }
  
  public void setHomeActionContentDescription(int paramInt)
  {
    this.OooO0o.setNavigationContentDescription(paramInt);
  }
  
  public void setHomeActionContentDescription(CharSequence paramCharSequence)
  {
    this.OooO0o.setNavigationContentDescription(paramCharSequence);
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    this.OooO0o.setNavigationIcon(paramInt);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    this.OooO0o.setNavigationIcon(paramDrawable);
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean)
  {
    this.OooO0o.setHomeButtonEnabled(paramBoolean);
  }
  
  public void setIcon(int paramInt)
  {
    this.OooO0o.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.OooO0o.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    this.OooO0o.setLogo(paramInt);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    this.OooO0o.setLogo(paramDrawable);
  }
  
  public void setNavigationMode(int paramInt)
  {
    Object localObject1 = this.OooO0o;
    int i = ((DecorToolbar)localObject1).getNavigationMode();
    int j = 2;
    int k;
    if (i == j)
    {
      k = getSelectedNavigationIndex();
      this.OooOO0o = k;
      k = 0;
      OooOoO(null);
      localObject2 = this.OooO;
      m = 8;
      ((View)localObject2).setVisibility(m);
    }
    if (i != paramInt)
    {
      bool1 = this.OooOOoo;
      if (!bool1)
      {
        localObject1 = this.OooO0Oo;
        if (localObject1 != null) {
          ViewCompat.o00o0O((View)localObject1);
        }
      }
    }
    this.OooO0o.setNavigationMode(paramInt);
    boolean bool1 = false;
    localObject1 = null;
    if (paramInt == j)
    {
      OooOo0O();
      localObject2 = this.OooO;
      ((View)localObject2).setVisibility(0);
      k = this.OooOO0o;
      m = -1;
      if (k != m)
      {
        setSelectedNavigationItem(k);
        this.OooOO0o = m;
      }
    }
    Object localObject2 = this.OooO0o;
    int m = 1;
    if (paramInt == j)
    {
      bool2 = this.OooOOoo;
      if (!bool2)
      {
        bool2 = m;
        break label191;
      }
    }
    boolean bool2 = false;
    label191:
    ((DecorToolbar)localObject2).setCollapsible(bool2);
    localObject2 = this.OooO0Oo;
    if (paramInt == j)
    {
      paramInt = this.OooOOoo;
      if (paramInt == 0) {
        bool1 = m;
      }
    }
    ((ActionBarOverlayLayout)localObject2).setHasNonEmbeddedTabs(bool1);
  }
  
  public void setSelectedNavigationItem(int paramInt)
  {
    Object localObject1 = this.OooO0o;
    int i = ((DecorToolbar)localObject1).getNavigationMode();
    int j = 1;
    if (i != j)
    {
      j = 2;
      Object localObject2;
      if (i == j)
      {
        localObject1 = this.OooOO0;
        localObject2 = (ActionBar.Tab)((ArrayList)localObject1).get(paramInt);
        OooOoO((ActionBar.Tab)localObject2);
      }
      else
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("setSelectedNavigationIndex not valid for current navigation mode");
        throw ((Throwable)localObject2);
      }
    }
    else
    {
      localObject1 = this.OooO0o;
      ((DecorToolbar)localObject1).setDropdownSelectedPosition(paramInt);
    }
  }
  
  public void setShowHideAnimationEnabled(boolean paramBoolean)
  {
    this.OooOoOO = paramBoolean;
    if (!paramBoolean)
    {
      ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = this.OooOoO;
      if (localViewPropertyAnimatorCompatSet != null) {
        localViewPropertyAnimatorCompatSet.OooO00o();
      }
    }
  }
  
  public void setSplitBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setStackedBackgroundDrawable(Drawable paramDrawable)
  {
    this.OooO0o0.setStackedBackground(paramDrawable);
  }
  
  public void setSubtitle(int paramInt)
  {
    String str = this.OooO00o.getString(paramInt);
    setSubtitle(str);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.OooO0o.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    String str = this.OooO00o.getString(paramInt);
    setTitle(str);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.OooO0o.setTitle(paramCharSequence);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    this.OooO0o.setWindowTitle(paramCharSequence);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.WindowDecorActionBar
 * JD-Core Version:    0.7.0.1
 */