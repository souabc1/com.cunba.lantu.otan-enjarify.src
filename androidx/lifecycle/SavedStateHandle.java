package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

public final class SavedStateHandle
{
  public static final SavedStateHandle.Companion OooO0o;
  public static final Class[] OooO0oO;
  public final Map OooO00o;
  public final Map OooO0O0;
  public final Map OooO0OO;
  public final Map OooO0Oo;
  public final SavedStateRegistry.SavedStateProvider OooO0o0;
  
  static
  {
    Object localObject = new androidx/lifecycle/SavedStateHandle$Companion;
    ((SavedStateHandle.Companion)localObject).<init>(null);
    OooO0o = (SavedStateHandle.Companion)localObject;
    localObject = new Class[29];
    Class localClass = Boolean.TYPE;
    localObject[0] = localClass;
    localObject[1] = [Z.class;
    localClass = Double.TYPE;
    localObject[2] = localClass;
    localObject[3] = [D.class;
    localClass = Integer.TYPE;
    localObject[4] = localClass;
    localObject[5] = [I.class;
    localClass = Long.TYPE;
    localObject[6] = localClass;
    localObject[7] = [J.class;
    localObject[8] = String.class;
    localObject[9] = [Ljava.lang.String.class;
    localObject[10] = Binder.class;
    localObject[11] = Bundle.class;
    localClass = Byte.TYPE;
    localObject[12] = localClass;
    localObject[13] = [B.class;
    localClass = Character.TYPE;
    localObject[14] = localClass;
    localObject[15] = [C.class;
    localObject[16] = CharSequence.class;
    localObject[17] = [Ljava.lang.CharSequence.class;
    localObject[18] = ArrayList.class;
    localClass = Float.TYPE;
    localObject[19] = localClass;
    localObject[20] = [F.class;
    localObject[21] = Parcelable.class;
    localObject[22] = [Landroid.os.Parcelable.class;
    localObject[23] = Serializable.class;
    localClass = Short.TYPE;
    localObject[24] = localClass;
    localObject[25] = [S.class;
    localObject[26] = SparseArray.class;
    localObject[27] = Size.class;
    localObject[28] = SizeF.class;
    OooO0oO = (Class[])localObject;
  }
  
  public SavedStateHandle()
  {
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.OooO00o = ((Map)localObject);
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.OooO0O0 = ((Map)localObject);
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.OooO0OO = ((Map)localObject);
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.OooO0Oo = ((Map)localObject);
    localObject = new androidx/lifecycle/OooOOO0;
    ((OooOOO0)localObject).<init>(this);
    this.OooO0o0 = ((SavedStateRegistry.SavedStateProvider)localObject);
  }
  
  public SavedStateHandle(Map paramMap)
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    this.OooO00o = localLinkedHashMap;
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.OooO0O0 = ((Map)localObject);
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.OooO0OO = ((Map)localObject);
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.OooO0Oo = ((Map)localObject);
    localObject = new androidx/lifecycle/OooOOO0;
    ((OooOOO0)localObject).<init>(this);
    this.OooO0o0 = ((SavedStateRegistry.SavedStateProvider)localObject);
    localLinkedHashMap.putAll(paramMap);
  }
  
  public static final Bundle OooO0o(SavedStateHandle paramSavedStateHandle)
  {
    Intrinsics.OooO0o(paramSavedStateHandle, "this$0");
    Object localObject1 = MapsKt.OooOO0O(paramSavedStateHandle.OooO0O0).entrySet().iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = ((SavedStateRegistry.SavedStateProvider)((Map.Entry)localObject2).getValue()).OooO00o();
      paramSavedStateHandle.OooO0oO((String)localObject3, localObject2);
    }
    localObject1 = paramSavedStateHandle.OooO00o.keySet();
    Object localObject2 = new java/util/ArrayList;
    int i = ((Set)localObject1).size();
    ((ArrayList)localObject2).<init>(i);
    Object localObject3 = new java/util/ArrayList;
    int j = ((ArrayList)localObject2).size();
    ((ArrayList)localObject3).<init>(j);
    localObject1 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      Object localObject4 = (String)((Iterator)localObject1).next();
      ((ArrayList)localObject2).add(localObject4);
      Map localMap = paramSavedStateHandle.OooO00o;
      localObject4 = localMap.get(localObject4);
      ((ArrayList)localObject3).add(localObject4);
    }
    paramSavedStateHandle = TuplesKt.OooO00o("keys", localObject2);
    localObject1 = TuplesKt.OooO00o("values", localObject3);
    return BundleKt.OooO00o(new Pair[] { paramSavedStateHandle, localObject1 });
  }
  
  public final SavedStateRegistry.SavedStateProvider OooO0o0()
  {
    return this.OooO0o0;
  }
  
  public final void OooO0oO(String paramString, Object paramObject)
  {
    Intrinsics.OooO0o(paramString, "key");
    Object localObject = OooO0o;
    boolean bool1 = ((SavedStateHandle.Companion)localObject).OooO0O0(paramObject);
    if (bool1)
    {
      localObject = this.OooO0OO.get(paramString);
      boolean bool2 = localObject instanceof MutableLiveData;
      if (bool2)
      {
        localObject = (MutableLiveData)localObject;
      }
      else
      {
        bool1 = false;
        localObject = null;
      }
      if (localObject != null)
      {
        ((MutableLiveData)localObject).setValue(paramObject);
      }
      else
      {
        localObject = this.OooO00o;
        ((Map)localObject).put(paramString, paramObject);
      }
      localObject = this.OooO0Oo;
      paramString = (MutableStateFlow)((Map)localObject).get(paramString);
      if (paramString != null) {
        paramString.setValue(paramObject);
      }
      return;
    }
    paramString = new java/lang/IllegalArgumentException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("Can't put value with type ");
    Intrinsics.OooO0OO(paramObject);
    paramObject = paramObject.getClass();
    ((StringBuilder)localObject).append(paramObject);
    ((StringBuilder)localObject).append(" into saved state");
    paramObject = ((StringBuilder)localObject).toString();
    paramString.<init>(paramObject);
    throw paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.SavedStateHandle
 * JD-Core Version:    0.7.0.1
 */