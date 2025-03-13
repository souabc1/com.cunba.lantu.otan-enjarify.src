package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CheckableGroup
{
  private final Map checkables;
  private final Set checkedIds;
  private CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
  private boolean selectionRequired;
  private boolean singleSelection;
  
  public CheckableGroup()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.checkables = ((Map)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.checkedIds = ((Set)localObject);
  }
  
  private boolean checkInternal(MaterialCheckable paramMaterialCheckable)
  {
    int i = paramMaterialCheckable.getId();
    Object localObject = this.checkedIds;
    Integer localInteger1 = Integer.valueOf(i);
    boolean bool2 = ((Set)localObject).contains(localInteger1);
    localInteger1 = null;
    if (bool2) {
      return false;
    }
    localObject = this.checkables;
    int j = getSingleCheckedId();
    Integer localInteger2 = Integer.valueOf(j);
    localObject = (MaterialCheckable)((Map)localObject).get(localInteger2);
    if (localObject != null) {
      uncheckInternal((MaterialCheckable)localObject, false);
    }
    localObject = this.checkedIds;
    Integer localInteger3 = Integer.valueOf(i);
    boolean bool1 = ((Set)localObject).add(localInteger3);
    bool2 = paramMaterialCheckable.isChecked();
    if (!bool2)
    {
      bool2 = true;
      paramMaterialCheckable.setChecked(bool2);
    }
    return bool1;
  }
  
  private void onCheckedStateChanged()
  {
    CheckableGroup.OnCheckedStateChangeListener localOnCheckedStateChangeListener = this.onCheckedStateChangeListener;
    if (localOnCheckedStateChangeListener != null)
    {
      Set localSet = getCheckedIds();
      localOnCheckedStateChangeListener.onCheckedStateChanged(localSet);
    }
  }
  
  private boolean uncheckInternal(MaterialCheckable paramMaterialCheckable, boolean paramBoolean)
  {
    int i = paramMaterialCheckable.getId();
    Set localSet1 = this.checkedIds;
    Integer localInteger1 = Integer.valueOf(i);
    boolean bool2 = localSet1.contains(localInteger1);
    localInteger1 = null;
    if (!bool2) {
      return false;
    }
    if (paramBoolean)
    {
      localSet2 = this.checkedIds;
      paramBoolean = localSet2.size();
      bool2 = true;
      if (paramBoolean == bool2)
      {
        localSet2 = this.checkedIds;
        Integer localInteger2 = Integer.valueOf(i);
        paramBoolean = localSet2.contains(localInteger2);
        if (paramBoolean)
        {
          paramMaterialCheckable.setChecked(bool2);
          return false;
        }
      }
    }
    Set localSet2 = this.checkedIds;
    Integer localInteger3 = Integer.valueOf(i);
    paramBoolean = localSet2.remove(localInteger3);
    boolean bool1 = paramMaterialCheckable.isChecked();
    if (bool1) {
      paramMaterialCheckable.setChecked(false);
    }
    return paramBoolean;
  }
  
  public void addCheckable(MaterialCheckable paramMaterialCheckable)
  {
    Object localObject = this.checkables;
    int i = paramMaterialCheckable.getId();
    Integer localInteger = Integer.valueOf(i);
    ((Map)localObject).put(localInteger, paramMaterialCheckable);
    boolean bool = paramMaterialCheckable.isChecked();
    if (bool) {
      checkInternal(paramMaterialCheckable);
    }
    localObject = new com/google/android/material/internal/CheckableGroup$1;
    ((CheckableGroup.1)localObject).<init>(this);
    paramMaterialCheckable.setInternalOnCheckedChangeListener((MaterialCheckable.OnCheckedChangeListener)localObject);
  }
  
  public void check(int paramInt)
  {
    Map localMap = this.checkables;
    Object localObject = Integer.valueOf(paramInt);
    localObject = (MaterialCheckable)localMap.get(localObject);
    if (localObject == null) {
      return;
    }
    paramInt = checkInternal((MaterialCheckable)localObject);
    if (paramInt != 0) {
      onCheckedStateChanged();
    }
  }
  
  public void clearCheck()
  {
    Set localSet = this.checkedIds;
    boolean bool1 = localSet.isEmpty() ^ true;
    Iterator localIterator = this.checkables.values().iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      MaterialCheckable localMaterialCheckable = (MaterialCheckable)localIterator.next();
      uncheckInternal(localMaterialCheckable, false);
    }
    if (bool1) {
      onCheckedStateChanged();
    }
  }
  
  public Set getCheckedIds()
  {
    HashSet localHashSet = new java/util/HashSet;
    Set localSet = this.checkedIds;
    localHashSet.<init>(localSet);
    return localHashSet;
  }
  
  public List getCheckedIdsSortedByChildOrder(ViewGroup paramViewGroup)
  {
    Set localSet = getCheckedIds();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramViewGroup.getChildCount();
      if (i >= j) {
        break;
      }
      Object localObject = paramViewGroup.getChildAt(i);
      boolean bool = localObject instanceof MaterialCheckable;
      if (bool)
      {
        Integer localInteger = Integer.valueOf(((View)localObject).getId());
        bool = localSet.contains(localInteger);
        if (bool)
        {
          j = ((View)localObject).getId();
          localObject = Integer.valueOf(j);
          localArrayList.add(localObject);
        }
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public int getSingleCheckedId()
  {
    boolean bool = this.singleSelection;
    if (bool)
    {
      Object localObject = this.checkedIds;
      bool = ((Set)localObject).isEmpty();
      if (!bool)
      {
        localObject = (Integer)this.checkedIds.iterator().next();
        return ((Integer)localObject).intValue();
      }
    }
    int i = -1;
    return i;
  }
  
  public boolean isSelectionRequired()
  {
    return this.selectionRequired;
  }
  
  public boolean isSingleSelection()
  {
    return this.singleSelection;
  }
  
  public void removeCheckable(MaterialCheckable paramMaterialCheckable)
  {
    paramMaterialCheckable.setInternalOnCheckedChangeListener(null);
    Object localObject = this.checkables;
    Integer localInteger = Integer.valueOf(paramMaterialCheckable.getId());
    ((Map)localObject).remove(localInteger);
    localObject = this.checkedIds;
    paramMaterialCheckable = Integer.valueOf(paramMaterialCheckable.getId());
    ((Set)localObject).remove(paramMaterialCheckable);
  }
  
  public void setOnCheckedStateChangeListener(CheckableGroup.OnCheckedStateChangeListener paramOnCheckedStateChangeListener)
  {
    this.onCheckedStateChangeListener = paramOnCheckedStateChangeListener;
  }
  
  public void setSelectionRequired(boolean paramBoolean)
  {
    this.selectionRequired = paramBoolean;
  }
  
  public void setSingleSelection(boolean paramBoolean)
  {
    boolean bool = this.singleSelection;
    if (bool != paramBoolean)
    {
      this.singleSelection = paramBoolean;
      clearCheck();
    }
  }
  
  public void uncheck(int paramInt)
  {
    Map localMap = this.checkables;
    Object localObject = Integer.valueOf(paramInt);
    localObject = (MaterialCheckable)localMap.get(localObject);
    if (localObject == null) {
      return;
    }
    boolean bool = this.selectionRequired;
    paramInt = uncheckInternal((MaterialCheckable)localObject, bool);
    if (paramInt != 0) {
      onCheckedStateChanged();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.CheckableGroup
 * JD-Core Version:    0.7.0.1
 */