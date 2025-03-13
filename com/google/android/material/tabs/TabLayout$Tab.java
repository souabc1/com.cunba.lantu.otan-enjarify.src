package com.google.android.material.tabs;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import m54207b69;

public class TabLayout$Tab
{
  public static final int INVALID_POSITION = 255;
  private CharSequence contentDesc;
  private View customView;
  private Drawable icon;
  private int id;
  private int labelVisibilityMode;
  public TabLayout parent;
  private int position;
  private Object tag;
  private CharSequence text;
  public TabLayout.TabView view;
  
  public TabLayout$Tab()
  {
    int i = -1;
    this.position = i;
    this.labelVisibilityMode = 1;
    this.id = i;
  }
  
  public BadgeDrawable getBadge()
  {
    return TabLayout.TabView.access$1000(this.view);
  }
  
  public CharSequence getContentDescription()
  {
    Object localObject = this.view;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((View)localObject).getContentDescription();
    }
    return localObject;
  }
  
  public View getCustomView()
  {
    return this.customView;
  }
  
  public Drawable getIcon()
  {
    return this.icon;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public BadgeDrawable getOrCreateBadge()
  {
    return TabLayout.TabView.access$800(this.view);
  }
  
  public int getPosition()
  {
    return this.position;
  }
  
  public int getTabLabelVisibility()
  {
    return this.labelVisibilityMode;
  }
  
  public Object getTag()
  {
    return this.tag;
  }
  
  public CharSequence getText()
  {
    return this.text;
  }
  
  public boolean isSelected()
  {
    Object localObject = this.parent;
    if (localObject != null)
    {
      int i = ((TabLayout)localObject).getSelectedTabPosition();
      int j = -1;
      if (i != j)
      {
        int k = this.position;
        if (i == k)
        {
          i = 1;
          break label40;
        }
      }
      i = 0;
      localObject = null;
      label40:
      return i;
    }
    localObject = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("?m390D115007071F54142223171A1216185D2A146020624F23273A262F1E3537");
    ((IllegalArgumentException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public void removeBadge()
  {
    TabLayout.TabView.access$900(this.view);
  }
  
  public void reset()
  {
    this.parent = null;
    this.view = null;
    this.tag = null;
    this.icon = null;
    int i = -1;
    this.id = i;
    this.text = null;
    this.contentDesc = null;
    this.position = i;
    this.customView = null;
  }
  
  public void select()
  {
    Object localObject = this.parent;
    if (localObject != null)
    {
      ((TabLayout)localObject).selectTab(this);
      return;
    }
    localObject = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("?m390D115007071F54142223171A1216185D2A146020624F23273A262F1E3537");
    ((IllegalArgumentException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public Tab setContentDescription(int paramInt)
  {
    Object localObject1 = this.parent;
    if (localObject1 != null)
    {
      localObject2 = ((View)localObject1).getResources().getText(paramInt);
      return setContentDescription((CharSequence)localObject2);
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    localObject1 = m54207b69.F54207b69_11("?m390D115007071F54142223171A1216185D2A146020624F23273A262F1E3537");
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public Tab setContentDescription(CharSequence paramCharSequence)
  {
    this.contentDesc = paramCharSequence;
    updateView();
    return this;
  }
  
  public Tab setCustomView(int paramInt)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.view.getContext());
    TabLayout.TabView localTabView = this.view;
    View localView = localLayoutInflater.inflate(paramInt, localTabView, false);
    return setCustomView(localView);
  }
  
  public Tab setCustomView(View paramView)
  {
    this.customView = paramView;
    updateView();
    return this;
  }
  
  public Tab setIcon(int paramInt)
  {
    Object localObject1 = this.parent;
    if (localObject1 != null)
    {
      localObject2 = AppCompatResources.OooO0O0(((View)localObject1).getContext(), paramInt);
      return setIcon((Drawable)localObject2);
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    localObject1 = m54207b69.F54207b69_11("?m390D115007071F54142223171A1216185D2A146020624F23273A262F1E3537");
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public Tab setIcon(Drawable paramDrawable)
  {
    this.icon = paramDrawable;
    paramDrawable = this.parent;
    int i = paramDrawable.tabGravity;
    int j = 1;
    if (i != j)
    {
      i = paramDrawable.mode;
      int k = 2;
      if (i != k) {}
    }
    else
    {
      paramDrawable.updateTabViews(j);
    }
    updateView();
    boolean bool = BadgeUtils.USE_COMPAT_PARENT;
    if (bool)
    {
      paramDrawable = this.view;
      bool = TabLayout.TabView.access$600(paramDrawable);
      if (bool)
      {
        paramDrawable = TabLayout.TabView.access$700(this.view);
        bool = paramDrawable.isVisible();
        if (bool)
        {
          paramDrawable = this.view;
          paramDrawable.invalidate();
        }
      }
    }
    return this;
  }
  
  public Tab setId(int paramInt)
  {
    this.id = paramInt;
    TabLayout.TabView localTabView = this.view;
    if (localTabView != null) {
      localTabView.setId(paramInt);
    }
    return this;
  }
  
  public void setPosition(int paramInt)
  {
    this.position = paramInt;
  }
  
  public Tab setTabLabelVisibility(int paramInt)
  {
    this.labelVisibilityMode = paramInt;
    Object localObject = this.parent;
    int i = ((TabLayout)localObject).tabGravity;
    int j = 1;
    if (i != j)
    {
      i = ((TabLayout)localObject).mode;
      int k = 2;
      if (i != k) {}
    }
    else
    {
      ((TabLayout)localObject).updateTabViews(j);
    }
    updateView();
    paramInt = BadgeUtils.USE_COMPAT_PARENT;
    if (paramInt != 0)
    {
      localObject = this.view;
      paramInt = TabLayout.TabView.access$600((TabLayout.TabView)localObject);
      if (paramInt != 0)
      {
        localObject = TabLayout.TabView.access$700(this.view);
        paramInt = ((Drawable)localObject).isVisible();
        if (paramInt != 0)
        {
          localObject = this.view;
          ((View)localObject).invalidate();
        }
      }
    }
    return this;
  }
  
  public Tab setTag(Object paramObject)
  {
    this.tag = paramObject;
    return this;
  }
  
  public Tab setText(int paramInt)
  {
    Object localObject1 = this.parent;
    if (localObject1 != null)
    {
      localObject2 = ((View)localObject1).getResources().getText(paramInt);
      return setText((CharSequence)localObject2);
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    localObject1 = m54207b69.F54207b69_11("?m390D115007071F54142223171A1216185D2A146020624F23273A262F1E3537");
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public Tab setText(CharSequence paramCharSequence)
  {
    Object localObject = this.contentDesc;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool)
    {
      bool = TextUtils.isEmpty(paramCharSequence);
      if (!bool)
      {
        localObject = this.view;
        ((View)localObject).setContentDescription(paramCharSequence);
      }
    }
    this.text = paramCharSequence;
    updateView();
    return this;
  }
  
  public void updateView()
  {
    TabLayout.TabView localTabView = this.view;
    if (localTabView != null) {
      localTabView.update();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayout.Tab
 * JD-Core Version:    0.7.0.1
 */