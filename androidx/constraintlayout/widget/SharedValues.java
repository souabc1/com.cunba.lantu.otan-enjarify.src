package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SharedValues
{
  public SparseIntArray OooO00o;
  public HashMap OooO0O0;
  
  public SharedValues()
  {
    Object localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    this.OooO00o = ((SparseIntArray)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0O0 = ((HashMap)localObject);
  }
  
  public void OooO00o(int paramInt, SharedValues.SharedValuesListener paramSharedValuesListener)
  {
    Object localObject1 = this.OooO0O0;
    Object localObject2 = Integer.valueOf(paramInt);
    localObject1 = (HashSet)((HashMap)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = new java/util/HashSet;
      ((HashSet)localObject1).<init>();
      localObject2 = this.OooO0O0;
      localObject3 = Integer.valueOf(paramInt);
      ((HashMap)localObject2).put(localObject3, localObject1);
    }
    Object localObject3 = new java/lang/ref/WeakReference;
    ((WeakReference)localObject3).<init>(paramSharedValuesListener);
    ((HashSet)localObject1).add(localObject3);
  }
  
  public void OooO0O0(int paramInt, SharedValues.SharedValuesListener paramSharedValuesListener)
  {
    Object localObject1 = this.OooO0O0;
    Object localObject2 = Integer.valueOf(paramInt);
    localObject2 = (HashSet)((HashMap)localObject1).get(localObject2);
    if (localObject2 == null) {
      return;
    }
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Iterator localIterator = ((HashSet)localObject2).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      SharedValues.SharedValuesListener localSharedValuesListener = (SharedValues.SharedValuesListener)localWeakReference.get();
      if ((localSharedValuesListener == null) || (localSharedValuesListener == paramSharedValuesListener)) {
        ((List)localObject1).add(localWeakReference);
      }
    }
    ((AbstractCollection)localObject2).removeAll((Collection)localObject1);
  }
  
  public int getValue(int paramInt)
  {
    return this.OooO00o.get(paramInt, -1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.SharedValues
 * JD-Core Version:    0.7.0.1
 */