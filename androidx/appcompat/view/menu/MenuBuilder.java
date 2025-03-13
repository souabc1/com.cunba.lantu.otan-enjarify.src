package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuBuilder
  implements SupportMenu
{
  private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
  private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
  private static final String PRESENTER_KEY = "android:menu:presenters";
  private static final String TAG = "MenuBuilder";
  private static final int[] sCategoryToOrder;
  private ArrayList mActionItems;
  private MenuBuilder.Callback mCallback;
  private final Context mContext;
  private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
  private int mDefaultShowAsAction = 0;
  private MenuItemImpl mExpandedItem;
  private boolean mGroupDividerEnabled;
  Drawable mHeaderIcon;
  CharSequence mHeaderTitle;
  View mHeaderView;
  private boolean mIsActionItemsStale;
  private boolean mIsClosing = false;
  private boolean mIsVisibleItemsStale;
  private ArrayList mItems;
  private boolean mItemsChangedWhileDispatchPrevented = false;
  private ArrayList mNonActionItems;
  private boolean mOptionalIconsVisible = false;
  private boolean mOverrideVisibleItems;
  private CopyOnWriteArrayList mPresenters;
  private boolean mPreventDispatchingItemsChanged = false;
  private boolean mQwertyMode;
  private final Resources mResources;
  private boolean mShortcutsVisible;
  private boolean mStructureChangedWhileDispatchPrevented = false;
  private ArrayList mTempShortcutItemList;
  private ArrayList mVisibleItems;
  
  static
  {
    int[] arrayOfInt = new int[6];
    int[] tmp7_5 = arrayOfInt;
    tmp7_5[0] = 1;
    arrayOfInt[1] = 4;
    int[] tmp14_7 = tmp7_5;
    tmp14_7[2] = 5;
    arrayOfInt[3] = 3;
    tmp14_7[4] = 2;
    arrayOfInt[5] = 0;
    sCategoryToOrder = arrayOfInt;
  }
  
  public MenuBuilder(Context paramContext)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mTempShortcutItemList = ((ArrayList)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    this.mPresenters = ((CopyOnWriteArrayList)localObject);
    this.mGroupDividerEnabled = false;
    this.mContext = paramContext;
    paramContext = paramContext.getResources();
    this.mResources = paramContext;
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.mItems = paramContext;
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.mVisibleItems = paramContext;
    boolean bool = true;
    this.mIsVisibleItemsStale = bool;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mActionItems = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mNonActionItems = localArrayList;
    this.mIsActionItemsStale = bool;
    setShortcutsVisibleInner(bool);
  }
  
  public static int OooO0o(ArrayList paramArrayList, int paramInt)
  {
    int i = paramArrayList.size() + -1;
    while (i >= 0)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)paramArrayList.get(i);
      int j = localMenuItemImpl.getOrdering();
      if (j <= paramInt) {
        return i + 1;
      }
      i += -1;
    }
    return 0;
  }
  
  private static int getOrdering(int paramInt)
  {
    int i = (0xFFFF0000 & paramInt) >> 16;
    if (i >= 0)
    {
      int[] arrayOfInt = sCategoryToOrder;
      int j = arrayOfInt.length;
      if (i < j)
      {
        i = arrayOfInt[i] << 16;
        return paramInt & (char)-1 | i;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("order does not contain a valid category.");
    throw localIllegalArgumentException;
  }
  
  private void setShortcutsVisibleInner(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Object localObject = this.mResources.getConfiguration();
      paramBoolean = ((Configuration)localObject).keyboard;
      bool = true;
      if (paramBoolean != bool)
      {
        localObject = ViewConfiguration.get(this.mContext);
        Context localContext = this.mContext;
        paramBoolean = ViewConfigurationCompat.OooO0OO((ViewConfiguration)localObject, localContext);
        if (paramBoolean) {
          break label54;
        }
      }
    }
    boolean bool = false;
    label54:
    this.mShortcutsVisible = bool;
  }
  
  public final MenuItemImpl OooO00o(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    MenuItemImpl localMenuItemImpl = new androidx/appcompat/view/menu/MenuItemImpl;
    localMenuItemImpl.<init>(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5);
    return localMenuItemImpl;
  }
  
  public final void OooO0O0(boolean paramBoolean)
  {
    Object localObject1 = this.mPresenters;
    boolean bool1 = ((CopyOnWriteArrayList)localObject1).isEmpty();
    if (bool1) {
      return;
    }
    stopDispatchingItemsChanged();
    localObject1 = this.mPresenters.iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject1).next();
      Object localObject2 = (MenuPresenter)localWeakReference.get();
      if (localObject2 == null)
      {
        localObject2 = this.mPresenters;
        ((CopyOnWriteArrayList)localObject2).remove(localWeakReference);
      }
      else
      {
        ((MenuPresenter)localObject2).updateMenuView(paramBoolean);
      }
    }
    startDispatchingItemsChanged();
  }
  
  public final void OooO0OO(Bundle paramBundle)
  {
    Object localObject1 = "android:menu:presenters";
    paramBundle = paramBundle.getSparseParcelableArray((String)localObject1);
    if (paramBundle != null)
    {
      localObject1 = this.mPresenters;
      boolean bool1 = ((CopyOnWriteArrayList)localObject1).isEmpty();
      if (!bool1)
      {
        localObject1 = this.mPresenters.iterator();
        for (;;)
        {
          boolean bool2 = ((Iterator)localObject1).hasNext();
          if (!bool2) {
            break;
          }
          Object localObject2 = (WeakReference)((Iterator)localObject1).next();
          Object localObject3 = (MenuPresenter)((Reference)localObject2).get();
          if (localObject3 == null)
          {
            localObject3 = this.mPresenters;
            ((CopyOnWriteArrayList)localObject3).remove(localObject2);
          }
          else
          {
            int i = ((MenuPresenter)localObject3).getId();
            if (i > 0)
            {
              localObject2 = (Parcelable)paramBundle.get(i);
              if (localObject2 != null) {
                ((MenuPresenter)localObject3).onRestoreInstanceState((Parcelable)localObject2);
              }
            }
          }
        }
      }
    }
  }
  
  public final void OooO0Oo(Bundle paramBundle)
  {
    Object localObject1 = this.mPresenters;
    boolean bool1 = ((CopyOnWriteArrayList)localObject1).isEmpty();
    if (bool1) {
      return;
    }
    localObject1 = new android/util/SparseArray;
    ((SparseArray)localObject1).<init>();
    Iterator localIterator = this.mPresenters.iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      Object localObject2 = (MenuPresenter)localWeakReference.get();
      if (localObject2 == null)
      {
        localObject2 = this.mPresenters;
        ((CopyOnWriteArrayList)localObject2).remove(localWeakReference);
      }
      else
      {
        int i = ((MenuPresenter)localObject2).getId();
        if (i > 0)
        {
          localObject2 = ((MenuPresenter)localObject2).onSaveInstanceState();
          if (localObject2 != null) {
            ((SparseArray)localObject1).put(i, localObject2);
          }
        }
      }
    }
    paramBundle.putSparseParcelableArray("android:menu:presenters", (SparseArray)localObject1);
  }
  
  public final boolean OooO0o0(SubMenuBuilder paramSubMenuBuilder, MenuPresenter paramMenuPresenter)
  {
    Object localObject1 = this.mPresenters;
    boolean bool1 = ((CopyOnWriteArrayList)localObject1).isEmpty();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (paramMenuPresenter != null) {
      bool2 = paramMenuPresenter.onSubMenuSelected(paramSubMenuBuilder);
    }
    paramMenuPresenter = this.mPresenters.iterator();
    for (;;)
    {
      bool1 = paramMenuPresenter.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (WeakReference)paramMenuPresenter.next();
      Object localObject2 = (MenuPresenter)((Reference)localObject1).get();
      if (localObject2 == null)
      {
        localObject2 = this.mPresenters;
        ((CopyOnWriteArrayList)localObject2).remove(localObject1);
      }
      else if (!bool2)
      {
        bool1 = ((MenuPresenter)localObject2).onSubMenuSelected(paramSubMenuBuilder);
        bool2 = bool1;
      }
    }
    return bool2;
  }
  
  public final void OooO0oO(int paramInt, boolean paramBoolean)
  {
    if (paramInt >= 0)
    {
      ArrayList localArrayList = this.mItems;
      int i = localArrayList.size();
      if (paramInt < i)
      {
        localArrayList = this.mItems;
        localArrayList.remove(paramInt);
        if (paramBoolean)
        {
          paramInt = 1;
          onItemsChanged(paramInt);
        }
      }
    }
  }
  
  public final void OooO0oo(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Resources localResources = getResources();
    if (paramView != null)
    {
      this.mHeaderView = paramView;
      this.mHeaderTitle = null;
      this.mHeaderIcon = null;
    }
    else
    {
      Object localObject;
      if (paramInt1 > 0)
      {
        localObject = localResources.getText(paramInt1);
        this.mHeaderTitle = ((CharSequence)localObject);
      }
      else if (paramCharSequence != null)
      {
        this.mHeaderTitle = paramCharSequence;
      }
      if (paramInt2 > 0)
      {
        localObject = ContextCompat.OooO0o0(getContext(), paramInt2);
        this.mHeaderIcon = ((Drawable)localObject);
      }
      else if (paramDrawable != null)
      {
        this.mHeaderIcon = paramDrawable;
      }
      this.mHeaderView = null;
    }
    onItemsChanged(false);
  }
  
  public MenuItem add(int paramInt)
  {
    String str = this.mResources.getString(paramInt);
    return addInternal(0, 0, 0, str);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = this.mResources.getString(paramInt4);
    return addInternal(paramInt1, paramInt2, paramInt3, str);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return addInternal(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    return addInternal(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.mContext.getPackageManager();
    int i = 0;
    paramComponentName = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int j;
    if (paramComponentName != null) {
      j = paramComponentName.size();
    } else {
      j = 0;
    }
    paramInt4 &= 0x1;
    if (paramInt4 == 0) {
      removeGroup(paramInt1);
    }
    while (i < j)
    {
      ResolveInfo localResolveInfo = (ResolveInfo)paramComponentName.get(i);
      Object localObject1 = new android/content/Intent;
      int k = localResolveInfo.specificIndex;
      if (k < 0) {
        localObject2 = paramIntent;
      } else {
        localObject2 = paramArrayOfIntent[k];
      }
      ((Intent)localObject1).<init>((Intent)localObject2);
      Object localObject2 = new android/content/ComponentName;
      Object localObject3 = localResolveInfo.activityInfo;
      String str = ((ActivityInfo)localObject3).applicationInfo.packageName;
      localObject3 = ((ActivityInfo)localObject3).name;
      ((ComponentName)localObject2).<init>(str, (String)localObject3);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = localResolveInfo.loadLabel(localPackageManager);
      localObject2 = add(paramInt1, paramInt2, paramInt3, (CharSequence)localObject2);
      localObject3 = localResolveInfo.loadIcon(localPackageManager);
      localObject2 = ((MenuItem)localObject2).setIcon((Drawable)localObject3);
      localObject1 = ((MenuItem)localObject2).setIntent((Intent)localObject1);
      if (paramArrayOfMenuItem != null)
      {
        paramInt4 = localResolveInfo.specificIndex;
        if (paramInt4 >= 0) {
          paramArrayOfMenuItem[paramInt4] = localObject1;
        }
      }
      i += 1;
    }
    return j;
  }
  
  public MenuItem addInternal(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i = getOrdering(paramInt3);
    int j = this.mDefaultShowAsAction;
    MenuItemImpl localMenuItemImpl = OooO00o(paramInt1, paramInt2, paramInt3, i, paramCharSequence, j);
    Object localObject = this.mCurrentMenuInfo;
    if (localObject != null) {
      localMenuItemImpl.setMenuInfo((ContextMenu.ContextMenuInfo)localObject);
    }
    localObject = this.mItems;
    paramInt3 = OooO0o((ArrayList)localObject, i);
    ((ArrayList)localObject).add(paramInt3, localMenuItemImpl);
    onItemsChanged(true);
    return localMenuItemImpl;
  }
  
  public void addMenuPresenter(MenuPresenter paramMenuPresenter)
  {
    Context localContext = this.mContext;
    addMenuPresenter(paramMenuPresenter, localContext);
  }
  
  public void addMenuPresenter(MenuPresenter paramMenuPresenter, Context paramContext)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = this.mPresenters;
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramMenuPresenter);
    localCopyOnWriteArrayList.add(localWeakReference);
    paramMenuPresenter.initForMenu(paramContext, this);
    this.mIsActionItemsStale = true;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    String str = this.mResources.getString(paramInt);
    return addSubMenu(0, 0, 0, str);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = this.mResources.getString(paramInt4);
    return addSubMenu(paramInt1, paramInt2, paramInt3, str);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    MenuItemImpl localMenuItemImpl = (MenuItemImpl)addInternal(paramInt1, paramInt2, paramInt3, paramCharSequence);
    SubMenuBuilder localSubMenuBuilder = new androidx/appcompat/view/menu/SubMenuBuilder;
    Context localContext = this.mContext;
    localSubMenuBuilder.<init>(localContext, this, localMenuItemImpl);
    localMenuItemImpl.setSubMenu(localSubMenuBuilder);
    return localSubMenuBuilder;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public void changeMenuMode()
  {
    MenuBuilder.Callback localCallback = this.mCallback;
    if (localCallback != null) {
      localCallback.onMenuModeChange(this);
    }
  }
  
  public void clear()
  {
    MenuItemImpl localMenuItemImpl = this.mExpandedItem;
    if (localMenuItemImpl != null) {
      collapseItemActionView(localMenuItemImpl);
    }
    this.mItems.clear();
    onItemsChanged(true);
  }
  
  public void clearAll()
  {
    boolean bool = true;
    this.mPreventDispatchingItemsChanged = bool;
    clear();
    clearHeader();
    this.mPresenters.clear();
    this.mPreventDispatchingItemsChanged = false;
    this.mItemsChangedWhileDispatchPrevented = false;
    this.mStructureChangedWhileDispatchPrevented = false;
    onItemsChanged(bool);
  }
  
  public void clearHeader()
  {
    this.mHeaderIcon = null;
    this.mHeaderTitle = null;
    this.mHeaderView = null;
    onItemsChanged(false);
  }
  
  public void close()
  {
    close(true);
  }
  
  public final void close(boolean paramBoolean)
  {
    boolean bool1 = this.mIsClosing;
    if (bool1) {
      return;
    }
    bool1 = true;
    this.mIsClosing = bool1;
    Iterator localIterator = this.mPresenters.iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      Object localObject = (MenuPresenter)localWeakReference.get();
      if (localObject == null)
      {
        localObject = this.mPresenters;
        ((CopyOnWriteArrayList)localObject).remove(localWeakReference);
      }
      else
      {
        ((MenuPresenter)localObject).onCloseMenu(this, paramBoolean);
      }
    }
    this.mIsClosing = false;
  }
  
  public boolean collapseItemActionView(MenuItemImpl paramMenuItemImpl)
  {
    Object localObject1 = this.mPresenters;
    boolean bool1 = ((CopyOnWriteArrayList)localObject1).isEmpty();
    boolean bool2 = false;
    if (!bool1)
    {
      localObject1 = this.mExpandedItem;
      if (localObject1 == paramMenuItemImpl)
      {
        stopDispatchingItemsChanged();
        localObject1 = this.mPresenters.iterator();
        do
        {
          Object localObject2;
          for (;;)
          {
            boolean bool3 = ((Iterator)localObject1).hasNext();
            if (!bool3) {
              break label114;
            }
            WeakReference localWeakReference = (WeakReference)((Iterator)localObject1).next();
            localObject2 = (MenuPresenter)localWeakReference.get();
            if (localObject2 != null) {
              break;
            }
            localObject2 = this.mPresenters;
            ((CopyOnWriteArrayList)localObject2).remove(localWeakReference);
          }
          bool2 = ((MenuPresenter)localObject2).collapseItemActionView(this, paramMenuItemImpl);
        } while (!bool2);
        label114:
        startDispatchingItemsChanged();
        if (bool2)
        {
          paramMenuItemImpl = null;
          this.mExpandedItem = null;
        }
      }
    }
    return bool2;
  }
  
  public boolean dispatchMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    MenuBuilder.Callback localCallback = this.mCallback;
    if (localCallback != null)
    {
      bool = localCallback.onMenuItemSelected(paramMenuBuilder, paramMenuItem);
      if (bool)
      {
        bool = true;
        break label35;
      }
    }
    boolean bool = false;
    paramMenuBuilder = null;
    label35:
    return bool;
  }
  
  public boolean expandItemActionView(MenuItemImpl paramMenuItemImpl)
  {
    Object localObject1 = this.mPresenters;
    boolean bool1 = ((CopyOnWriteArrayList)localObject1).isEmpty();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    stopDispatchingItemsChanged();
    localObject1 = this.mPresenters.iterator();
    do
    {
      Object localObject2;
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break label103;
        }
        WeakReference localWeakReference = (WeakReference)((Iterator)localObject1).next();
        localObject2 = (MenuPresenter)localWeakReference.get();
        if (localObject2 != null) {
          break;
        }
        localObject2 = this.mPresenters;
        ((CopyOnWriteArrayList)localObject2).remove(localWeakReference);
      }
      bool2 = ((MenuPresenter)localObject2).expandItemActionView(this, paramMenuItemImpl);
    } while (!bool2);
    label103:
    startDispatchingItemsChanged();
    if (bool2) {
      this.mExpandedItem = paramMenuItemImpl;
    }
    return bool2;
  }
  
  public int findGroupIndex(int paramInt)
  {
    return findGroupIndex(paramInt, 0);
  }
  
  public int findGroupIndex(int paramInt1, int paramInt2)
  {
    int i = size();
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    while (paramInt2 < i)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(paramInt2);
      int j = localMenuItemImpl.getGroupId();
      if (j == paramInt1) {
        return paramInt2;
      }
      paramInt2 += 1;
    }
    return -1;
  }
  
  public MenuItem findItem(int paramInt)
  {
    int i = size();
    int j = 0;
    while (j < i)
    {
      Object localObject = (MenuItemImpl)this.mItems.get(j);
      int k = ((MenuItemImpl)localObject).getItemId();
      if (k == paramInt) {
        return localObject;
      }
      boolean bool = ((MenuItemImpl)localObject).hasSubMenu();
      if (bool)
      {
        localObject = ((MenuItemImpl)localObject).getSubMenu().findItem(paramInt);
        if (localObject != null) {
          return localObject;
        }
      }
      j += 1;
    }
    return null;
  }
  
  public int findItemIndex(int paramInt)
  {
    int i = size();
    int j = 0;
    while (j < i)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      int k = localMenuItemImpl.getItemId();
      if (k == paramInt) {
        return j;
      }
      j += 1;
    }
    return -1;
  }
  
  public MenuItemImpl findItemWithShortcutForKey(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.mTempShortcutItemList;
    localArrayList.clear();
    findItemsWithShortcutForKey(localArrayList, paramInt, paramKeyEvent);
    boolean bool1 = localArrayList.isEmpty();
    if (bool1) {
      return null;
    }
    int i = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new android/view/KeyCharacterMap$KeyData;
    localKeyData.<init>();
    paramKeyEvent.getKeyData(localKeyData);
    int j = localArrayList.size();
    int k = 1;
    if (j == k) {
      return (MenuItemImpl)localArrayList.get(0);
    }
    boolean bool2 = isQwertyMode();
    int m = 0;
    while (m < j)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)localArrayList.get(m);
      int n;
      if (bool2) {
        n = localMenuItemImpl.getAlphabeticShortcut();
      } else {
        n = localMenuItemImpl.getNumericShortcut();
      }
      char[] arrayOfChar = localKeyData.meta;
      int i1 = arrayOfChar[0];
      if (n == i1)
      {
        i1 = i & 0x2;
        if (i1 == 0) {}
      }
      else
      {
        i1 = 2;
        int i2 = arrayOfChar[i1];
        if (n == i2)
        {
          i2 = i & 0x2;
          if (i2 != 0) {}
        }
        else
        {
          if (!bool2) {
            break label214;
          }
          i2 = 8;
          if (n != i2) {
            break label214;
          }
          n = 67;
          if (paramInt != n) {
            break label214;
          }
        }
      }
      return localMenuItemImpl;
      label214:
      m += 1;
    }
    return null;
  }
  
  public void findItemsWithShortcutForKey(List paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = isQwertyMode();
    int i = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData localKeyData = new android/view/KeyCharacterMap$KeyData;
    localKeyData.<init>();
    boolean bool2 = paramKeyEvent.getKeyData(localKeyData);
    int k = 67;
    if ((!bool2) && (paramInt != k)) {
      return;
    }
    ArrayList localArrayList = this.mItems;
    int j = localArrayList.size();
    int m = 0;
    while (m < j)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(m);
      boolean bool3 = localMenuItemImpl.hasSubMenu();
      if (bool3)
      {
        MenuBuilder localMenuBuilder = (MenuBuilder)localMenuItemImpl.getSubMenu();
        localMenuBuilder.findItemsWithShortcutForKey(paramList, paramInt, paramKeyEvent);
      }
      int n;
      if (bool1) {
        n = localMenuItemImpl.getAlphabeticShortcut();
      } else {
        n = localMenuItemImpl.getNumericShortcut();
      }
      int i1;
      if (bool1) {
        i1 = localMenuItemImpl.getAlphabeticModifiers();
      } else {
        i1 = localMenuItemImpl.getNumericModifiers();
      }
      int i2 = 69647;
      int i3 = i & i2;
      i1 &= i2;
      char[] arrayOfChar;
      if (i3 == i1)
      {
        i1 = 1;
      }
      else
      {
        i1 = 0;
        arrayOfChar = null;
      }
      if ((i1 != 0) && (n != 0))
      {
        arrayOfChar = localKeyData.meta;
        i2 = arrayOfChar[0];
        if (n != i2)
        {
          i2 = 2;
          i1 = arrayOfChar[i2];
          if (n != i1)
          {
            if (!bool1) {
              break label285;
            }
            i1 = 8;
            if ((n != i1) || (paramInt != k)) {
              break label285;
            }
          }
        }
        boolean bool4 = localMenuItemImpl.isEnabled();
        if (bool4) {
          paramList.add(localMenuItemImpl);
        }
      }
      label285:
      m += 1;
    }
  }
  
  public void flagActionItems()
  {
    ArrayList localArrayList = getVisibleItems();
    boolean bool1 = this.mIsActionItemsStale;
    if (!bool1) {
      return;
    }
    Object localObject1 = this.mPresenters.iterator();
    int j = 0;
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      int k = ((Iterator)localObject1).hasNext();
      if (k == 0) {
        break;
      }
      localObject2 = (WeakReference)((Iterator)localObject1).next();
      localObject3 = (MenuPresenter)((Reference)localObject2).get();
      if (localObject3 == null)
      {
        localObject3 = this.mPresenters;
        ((CopyOnWriteArrayList)localObject3).remove(localObject2);
      }
      else
      {
        k = ((MenuPresenter)localObject3).flagActionItems();
        j |= k;
      }
    }
    if (j != 0)
    {
      this.mActionItems.clear();
      localObject1 = this.mNonActionItems;
      ((ArrayList)localObject1).clear();
      int i = localArrayList.size();
      j = 0;
      while (j < i)
      {
        localObject2 = (MenuItemImpl)localArrayList.get(j);
        boolean bool2 = ((MenuItemImpl)localObject2).isActionButton();
        if (bool2) {
          localObject3 = this.mActionItems;
        } else {
          localObject3 = this.mNonActionItems;
        }
        ((ArrayList)localObject3).add(localObject2);
        j += 1;
      }
    }
    this.mActionItems.clear();
    this.mNonActionItems.clear();
    localArrayList = this.mNonActionItems;
    localObject1 = getVisibleItems();
    localArrayList.addAll((Collection)localObject1);
    this.mIsActionItemsStale = false;
  }
  
  public ArrayList getActionItems()
  {
    flagActionItems();
    return this.mActionItems;
  }
  
  public String getActionViewStatesKey()
  {
    return "android:menu:actionviewstates";
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public MenuItemImpl getExpandedItem()
  {
    return this.mExpandedItem;
  }
  
  public Drawable getHeaderIcon()
  {
    return this.mHeaderIcon;
  }
  
  public CharSequence getHeaderTitle()
  {
    return this.mHeaderTitle;
  }
  
  public View getHeaderView()
  {
    return this.mHeaderView;
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.mItems.get(paramInt);
  }
  
  public ArrayList getNonActionItems()
  {
    flagActionItems();
    return this.mNonActionItems;
  }
  
  public boolean getOptionalIconsVisible()
  {
    return this.mOptionalIconsVisible;
  }
  
  public Resources getResources()
  {
    return this.mResources;
  }
  
  public MenuBuilder getRootMenu()
  {
    return this;
  }
  
  public ArrayList getVisibleItems()
  {
    boolean bool1 = this.mIsVisibleItemsStale;
    if (!bool1) {
      return this.mVisibleItems;
    }
    this.mVisibleItems.clear();
    ArrayList localArrayList1 = this.mItems;
    int i = localArrayList1.size();
    int j = 0;
    while (j < i)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      boolean bool2 = localMenuItemImpl.isVisible();
      if (bool2)
      {
        ArrayList localArrayList2 = this.mVisibleItems;
        localArrayList2.add(localMenuItemImpl);
      }
      j += 1;
    }
    this.mIsVisibleItemsStale = false;
    this.mIsActionItemsStale = true;
    return this.mVisibleItems;
  }
  
  public boolean hasVisibleItems()
  {
    boolean bool1 = this.mOverrideVisibleItems;
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    int i = size();
    int j = 0;
    while (j < i)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      boolean bool3 = localMenuItemImpl.isVisible();
      if (bool3) {
        return bool2;
      }
      j += 1;
    }
    return false;
  }
  
  public boolean isGroupDividerEnabled()
  {
    return this.mGroupDividerEnabled;
  }
  
  public boolean isQwertyMode()
  {
    return this.mQwertyMode;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    MenuItemImpl localMenuItemImpl = findItemWithShortcutForKey(paramInt, paramKeyEvent);
    if (localMenuItemImpl != null)
    {
      paramInt = 1;
    }
    else
    {
      paramInt = 0;
      localMenuItemImpl = null;
    }
    return paramInt;
  }
  
  public boolean isShortcutsVisible()
  {
    return this.mShortcutsVisible;
  }
  
  public void onItemActionRequestChanged(MenuItemImpl paramMenuItemImpl)
  {
    boolean bool = true;
    this.mIsActionItemsStale = bool;
    onItemsChanged(bool);
  }
  
  public void onItemVisibleChanged(MenuItemImpl paramMenuItemImpl)
  {
    boolean bool = true;
    this.mIsVisibleItemsStale = bool;
    onItemsChanged(bool);
  }
  
  public void onItemsChanged(boolean paramBoolean)
  {
    boolean bool1 = this.mPreventDispatchingItemsChanged;
    boolean bool2 = true;
    if (!bool1)
    {
      if (paramBoolean)
      {
        this.mIsVisibleItemsStale = bool2;
        this.mIsActionItemsStale = bool2;
      }
      OooO0O0(paramBoolean);
    }
    else
    {
      this.mItemsChangedWhileDispatchPrevented = bool2;
      if (paramBoolean) {
        this.mStructureChangedWhileDispatchPrevented = bool2;
      }
    }
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    MenuItem localMenuItem = findItem(paramInt1);
    return performItemAction(localMenuItem, paramInt2);
  }
  
  public boolean performItemAction(MenuItem paramMenuItem, int paramInt)
  {
    return performItemAction(paramMenuItem, null, paramInt);
  }
  
  public boolean performItemAction(MenuItem paramMenuItem, MenuPresenter paramMenuPresenter, int paramInt)
  {
    paramMenuItem = (MenuItemImpl)paramMenuItem;
    Context localContext = null;
    if (paramMenuItem != null)
    {
      boolean bool1 = paramMenuItem.isEnabled();
      if (bool1)
      {
        bool1 = paramMenuItem.OooO0oO();
        ActionProvider localActionProvider = paramMenuItem.getSupportActionProvider();
        boolean bool2 = true;
        if (localActionProvider != null)
        {
          bool3 = localActionProvider.OooO00o();
          if (bool3)
          {
            bool3 = bool2;
            break label68;
          }
        }
        boolean bool3 = false;
        label68:
        boolean bool4 = paramMenuItem.OooO0o();
        if (bool4)
        {
          boolean bool5 = paramMenuItem.expandActionView();
          bool1 |= bool5;
          if (!bool1) {}
        }
        else
        {
          do
          {
            for (;;)
            {
              close(bool2);
              break label228;
              bool4 = paramMenuItem.hasSubMenu();
              if ((bool4) || (bool3)) {
                break;
              }
              int i = paramInt & 0x1;
              if (i != 0) {
                break label228;
              }
            }
            paramInt &= 0x4;
            if (paramInt == 0) {
              close(false);
            }
            paramInt = paramMenuItem.hasSubMenu();
            if (paramInt == 0)
            {
              SubMenuBuilder localSubMenuBuilder = new androidx/appcompat/view/menu/SubMenuBuilder;
              localContext = getContext();
              localSubMenuBuilder.<init>(localContext, this, paramMenuItem);
              paramMenuItem.setSubMenu(localSubMenuBuilder);
            }
            paramMenuItem = (SubMenuBuilder)paramMenuItem.getSubMenu();
            if (bool3) {
              localActionProvider.OooO0o0(paramMenuItem);
            }
            boolean bool6 = OooO0o0(paramMenuItem, paramMenuPresenter);
            bool1 |= bool6;
          } while (!bool1);
        }
        label228:
        return bool1;
      }
    }
    return false;
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    MenuItemImpl localMenuItemImpl = findItemWithShortcutForKey(paramInt1, paramKeyEvent);
    if (localMenuItemImpl != null)
    {
      paramInt1 = performItemAction(localMenuItemImpl, paramInt2);
    }
    else
    {
      paramInt1 = 0;
      localMenuItemImpl = null;
    }
    int i = paramInt2 & 0x2;
    if (i != 0)
    {
      i = 1;
      close(i);
    }
    return paramInt1;
  }
  
  public void removeGroup(int paramInt)
  {
    int i = findGroupIndex(paramInt);
    if (i >= 0)
    {
      ArrayList localArrayList = this.mItems;
      int j = localArrayList.size() - i;
      int k = 0;
      MenuItemImpl localMenuItemImpl = null;
      for (;;)
      {
        int m = k + 1;
        if (k >= j) {
          break;
        }
        localMenuItemImpl = (MenuItemImpl)this.mItems.get(i);
        k = localMenuItemImpl.getGroupId();
        if (k != paramInt) {
          break;
        }
        OooO0oO(i, false);
        k = m;
      }
      paramInt = 1;
      onItemsChanged(paramInt);
    }
  }
  
  public void removeItem(int paramInt)
  {
    paramInt = findItemIndex(paramInt);
    OooO0oO(paramInt, true);
  }
  
  public void removeItemAt(int paramInt)
  {
    OooO0oO(paramInt, true);
  }
  
  public void removeMenuPresenter(MenuPresenter paramMenuPresenter)
  {
    Iterator localIterator = this.mPresenters.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      Object localObject = (MenuPresenter)localWeakReference.get();
      if ((localObject == null) || (localObject == paramMenuPresenter))
      {
        localObject = this.mPresenters;
        ((CopyOnWriteArrayList)localObject).remove(localWeakReference);
      }
    }
  }
  
  public void restoreActionViewStates(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    Object localObject1 = getActionViewStatesKey();
    localObject1 = paramBundle.getSparseParcelableArray((String)localObject1);
    int i = size();
    int j = 0;
    while (j < i)
    {
      Object localObject2 = getItem(j);
      View localView = ((MenuItem)localObject2).getActionView();
      if (localView != null)
      {
        int k = localView.getId();
        int m = -1;
        if (k != m) {
          localView.restoreHierarchyState((SparseArray)localObject1);
        }
      }
      boolean bool = ((MenuItem)localObject2).hasSubMenu();
      if (bool)
      {
        localObject2 = (SubMenuBuilder)((MenuItem)localObject2).getSubMenu();
        ((MenuBuilder)localObject2).restoreActionViewStates(paramBundle);
      }
      j += 1;
    }
    localObject1 = "android:menu:expandedactionview";
    int n = paramBundle.getInt((String)localObject1);
    if (n > 0)
    {
      paramBundle = findItem(n);
      if (paramBundle != null) {
        paramBundle.expandActionView();
      }
    }
  }
  
  public void restorePresenterStates(Bundle paramBundle)
  {
    OooO0OO(paramBundle);
  }
  
  public void saveActionViewStates(Bundle paramBundle)
  {
    int i = size();
    SparseArray localSparseArray = null;
    int j = 0;
    while (j < i)
    {
      Object localObject1 = getItem(j);
      Object localObject2 = ((MenuItem)localObject1).getActionView();
      if (localObject2 != null)
      {
        int k = ((View)localObject2).getId();
        int m = -1;
        if (k != m)
        {
          if (localSparseArray == null)
          {
            localSparseArray = new android/util/SparseArray;
            localSparseArray.<init>();
          }
          ((View)localObject2).saveHierarchyState(localSparseArray);
          bool = ((MenuItem)localObject1).isActionViewExpanded();
          if (bool)
          {
            localObject2 = "android:menu:expandedactionview";
            k = ((MenuItem)localObject1).getItemId();
            paramBundle.putInt((String)localObject2, k);
          }
        }
      }
      boolean bool = ((MenuItem)localObject1).hasSubMenu();
      if (bool)
      {
        localObject1 = (SubMenuBuilder)((MenuItem)localObject1).getSubMenu();
        ((MenuBuilder)localObject1).saveActionViewStates(paramBundle);
      }
      j += 1;
    }
    if (localSparseArray != null)
    {
      String str = getActionViewStatesKey();
      paramBundle.putSparseParcelableArray(str, localSparseArray);
    }
  }
  
  public void savePresenterStates(Bundle paramBundle)
  {
    OooO0Oo(paramBundle);
  }
  
  public void setCallback(MenuBuilder.Callback paramCallback)
  {
    this.mCallback = paramCallback;
  }
  
  public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.mCurrentMenuInfo = paramContextMenuInfo;
  }
  
  public MenuBuilder setDefaultShowAsAction(int paramInt)
  {
    this.mDefaultShowAsAction = paramInt;
    return this;
  }
  
  public void setExclusiveItemChecked(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getGroupId();
    ArrayList localArrayList = this.mItems;
    int j = localArrayList.size();
    stopDispatchingItemsChanged();
    int k = 0;
    while (k < j)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(k);
      int m = localMenuItemImpl.getGroupId();
      if (m == i)
      {
        boolean bool = localMenuItemImpl.isExclusiveCheckable();
        if (bool)
        {
          bool = localMenuItemImpl.isCheckable();
          if (bool)
          {
            if (localMenuItemImpl == paramMenuItem) {
              bool = true;
            } else {
              bool = false;
            }
            localMenuItemImpl.setCheckedInt(bool);
          }
        }
      }
      k += 1;
    }
    startDispatchingItemsChanged();
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList = this.mItems;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      int k = localMenuItemImpl.getGroupId();
      if (k == paramInt)
      {
        localMenuItemImpl.setExclusiveCheckable(paramBoolean2);
        localMenuItemImpl.setCheckable(paramBoolean1);
      }
      j += 1;
    }
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    this.mGroupDividerEnabled = paramBoolean;
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = this.mItems;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      int k = localMenuItemImpl.getGroupId();
      if (k == paramInt) {
        localMenuItemImpl.setEnabled(paramBoolean);
      }
      j += 1;
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = this.mItems;
    int i = localArrayList.size();
    int j = 0;
    int k = 0;
    boolean bool1;
    for (;;)
    {
      bool1 = true;
      if (j >= i) {
        break;
      }
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      int m = localMenuItemImpl.getGroupId();
      if (m == paramInt)
      {
        boolean bool2 = localMenuItemImpl.OooOOO0(paramBoolean);
        if (bool2) {
          k = bool1;
        }
      }
      j += 1;
    }
    if (k != 0) {
      onItemsChanged(bool1);
    }
  }
  
  public MenuBuilder setHeaderIconInt(int paramInt)
  {
    OooO0oo(0, null, paramInt, null, null);
    return this;
  }
  
  public MenuBuilder setHeaderIconInt(Drawable paramDrawable)
  {
    OooO0oo(0, null, 0, paramDrawable, null);
    return this;
  }
  
  public MenuBuilder setHeaderTitleInt(int paramInt)
  {
    OooO0oo(paramInt, null, 0, null, null);
    return this;
  }
  
  public MenuBuilder setHeaderTitleInt(CharSequence paramCharSequence)
  {
    OooO0oo(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  public MenuBuilder setHeaderViewInt(View paramView)
  {
    OooO0oo(0, null, 0, null, paramView);
    return this;
  }
  
  public void setOptionalIconsVisible(boolean paramBoolean)
  {
    this.mOptionalIconsVisible = paramBoolean;
  }
  
  public void setOverrideVisibleItems(boolean paramBoolean)
  {
    this.mOverrideVisibleItems = paramBoolean;
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.mQwertyMode = paramBoolean;
    onItemsChanged(false);
  }
  
  public void setShortcutsVisible(boolean paramBoolean)
  {
    boolean bool = this.mShortcutsVisible;
    if (bool == paramBoolean) {
      return;
    }
    setShortcutsVisibleInner(paramBoolean);
    onItemsChanged(false);
  }
  
  public int size()
  {
    return this.mItems.size();
  }
  
  public void startDispatchingItemsChanged()
  {
    boolean bool1 = false;
    this.mPreventDispatchingItemsChanged = false;
    boolean bool2 = this.mItemsChangedWhileDispatchPrevented;
    if (bool2)
    {
      this.mItemsChangedWhileDispatchPrevented = false;
      bool1 = this.mStructureChangedWhileDispatchPrevented;
      onItemsChanged(bool1);
    }
  }
  
  public void stopDispatchingItemsChanged()
  {
    boolean bool = this.mPreventDispatchingItemsChanged;
    if (!bool)
    {
      this.mPreventDispatchingItemsChanged = true;
      bool = false;
      this.mItemsChangedWhileDispatchPrevented = false;
      this.mStructureChangedWhileDispatchPrevented = false;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuBuilder
 * JD-Core Version:    0.7.0.1
 */