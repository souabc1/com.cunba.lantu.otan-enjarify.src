package com.google.android.material.expandable;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m54207b69;

public final class ExpandableWidgetHelper
{
  private boolean expanded = false;
  private int expandedComponentIdHint = 0;
  private final View widget;
  
  public ExpandableWidgetHelper(ExpandableWidget paramExpandableWidget)
  {
    paramExpandableWidget = (View)paramExpandableWidget;
    this.widget = paramExpandableWidget;
  }
  
  private void dispatchExpandedStateChanged()
  {
    Object localObject = this.widget.getParent();
    boolean bool = localObject instanceof CoordinatorLayout;
    if (bool)
    {
      localObject = (CoordinatorLayout)localObject;
      View localView = this.widget;
      ((CoordinatorLayout)localObject).dispatchDependentViewsChanged(localView);
    }
  }
  
  public int getExpandedComponentIdHint()
  {
    return this.expandedComponentIdHint;
  }
  
  public boolean isExpanded()
  {
    return this.expanded;
  }
  
  public void onRestoreInstanceState(Bundle paramBundle)
  {
    String str = m54207b69.F54207b69_11("K\\39252E40363D3F3F");
    boolean bool1 = paramBundle.getBoolean(str, false);
    this.expanded = bool1;
    str = m54207b69.F54207b69_11("YV332F283A3C3739391D4245314545414732304431534D38");
    int i = paramBundle.getInt(str, 0);
    this.expandedComponentIdHint = i;
    boolean bool2 = this.expanded;
    if (bool2) {
      dispatchExpandedStateChanged();
    }
  }
  
  public Bundle onSaveInstanceState()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str = m54207b69.F54207b69_11("K\\39252E40363D3F3F");
    boolean bool = this.expanded;
    localBundle.putBoolean(str, bool);
    str = m54207b69.F54207b69_11("YV332F283A3C3739391D4245314545414732304431534D38");
    int i = this.expandedComponentIdHint;
    localBundle.putInt(str, i);
    return localBundle;
  }
  
  public boolean setExpanded(boolean paramBoolean)
  {
    boolean bool = this.expanded;
    if (bool != paramBoolean)
    {
      this.expanded = paramBoolean;
      dispatchExpandedStateChanged();
      return true;
    }
    return false;
  }
  
  public void setExpandedComponentIdHint(int paramInt)
  {
    this.expandedComponentIdHint = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.expandable.ExpandableWidgetHelper
 * JD-Core Version:    0.7.0.1
 */