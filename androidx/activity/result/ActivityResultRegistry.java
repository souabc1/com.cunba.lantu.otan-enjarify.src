package androidx.activity.result;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry
{
  public Random OooO00o;
  public final Map OooO0O0;
  public final Map OooO0OO;
  public final Map OooO0Oo;
  public final transient Map OooO0o;
  public ArrayList OooO0o0;
  public final Map OooO0oO;
  public final Bundle OooO0oo;
  
  public ActivityResultRegistry()
  {
    Object localObject = new java/util/Random;
    ((Random)localObject).<init>();
    this.OooO00o = ((Random)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0O0 = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0OO = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0Oo = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0o0 = ((ArrayList)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0o = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0oO = ((Map)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.OooO0oo = ((Bundle)localObject);
  }
  
  public final ActivityResultLauncher OooO(String paramString, ActivityResultContract paramActivityResultContract, ActivityResultCallback paramActivityResultCallback)
  {
    OooOO0O(paramString);
    Object localObject1 = this.OooO0o;
    Object localObject2 = new androidx/activity/result/ActivityResultRegistry$CallbackAndContract;
    ((ActivityResultRegistry.CallbackAndContract)localObject2).<init>(paramActivityResultCallback, paramActivityResultContract);
    ((Map)localObject1).put(paramString, localObject2);
    localObject1 = this.OooO0oO;
    boolean bool = ((Map)localObject1).containsKey(paramString);
    if (bool)
    {
      localObject1 = this.OooO0oO.get(paramString);
      localObject2 = this.OooO0oO;
      ((Map)localObject2).remove(paramString);
      paramActivityResultCallback.OooO00o(localObject1);
    }
    localObject1 = (ActivityResult)this.OooO0oo.getParcelable(paramString);
    if (localObject1 != null)
    {
      localObject2 = this.OooO0oo;
      ((Bundle)localObject2).remove(paramString);
      int i = ((ActivityResult)localObject1).getResultCode();
      localObject1 = ((ActivityResult)localObject1).getData();
      localObject1 = paramActivityResultContract.OooO0OO(i, (Intent)localObject1);
      paramActivityResultCallback.OooO00o(localObject1);
    }
    paramActivityResultCallback = new androidx/activity/result/ActivityResultRegistry$3;
    paramActivityResultCallback.<init>(this, paramString, paramActivityResultContract);
    return paramActivityResultCallback;
  }
  
  public final void OooO00o(int paramInt, String paramString)
  {
    Map localMap = this.OooO0O0;
    Integer localInteger1 = Integer.valueOf(paramInt);
    localMap.put(localInteger1, paramString);
    localMap = this.OooO0OO;
    Integer localInteger2 = Integer.valueOf(paramInt);
    localMap.put(paramString, localInteger2);
  }
  
  public final boolean OooO0O0(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = this.OooO0O0;
    Object localObject2 = Integer.valueOf(paramInt1);
    localObject2 = (String)((Map)localObject1).get(localObject2);
    if (localObject2 == null) {
      return false;
    }
    localObject1 = (ActivityResultRegistry.CallbackAndContract)this.OooO0o.get(localObject2);
    OooO0Oo((String)localObject2, paramInt2, paramIntent, (ActivityResultRegistry.CallbackAndContract)localObject1);
    return true;
  }
  
  public final boolean OooO0OO(int paramInt, Object paramObject)
  {
    Object localObject1 = this.OooO0O0;
    Object localObject2 = Integer.valueOf(paramInt);
    localObject2 = (String)((Map)localObject1).get(localObject2);
    if (localObject2 == null) {
      return false;
    }
    localObject1 = (ActivityResultRegistry.CallbackAndContract)this.OooO0o.get(localObject2);
    if (localObject1 != null)
    {
      localObject1 = ((ActivityResultRegistry.CallbackAndContract)localObject1).OooO00o;
      if (localObject1 != null)
      {
        ArrayList localArrayList = this.OooO0o0;
        paramInt = localArrayList.remove(localObject2);
        if (paramInt == 0) {
          break label114;
        }
        ((ActivityResultCallback)localObject1).OooO00o(paramObject);
        break label114;
      }
    }
    this.OooO0oo.remove((String)localObject2);
    localObject1 = this.OooO0oO;
    ((Map)localObject1).put(localObject2, paramObject);
    label114:
    return true;
  }
  
  public final void OooO0Oo(String paramString, int paramInt, Intent paramIntent, ActivityResultRegistry.CallbackAndContract paramCallbackAndContract)
  {
    if (paramCallbackAndContract != null)
    {
      localObject1 = paramCallbackAndContract.OooO00o;
      if (localObject1 != null)
      {
        localObject1 = this.OooO0o0;
        boolean bool = ((ArrayList)localObject1).contains(paramString);
        if (bool)
        {
          localObject1 = paramCallbackAndContract.OooO00o;
          paramCallbackAndContract = paramCallbackAndContract.OooO0O0;
          Object localObject2 = paramCallbackAndContract.OooO0OO(paramInt, paramIntent);
          ((ActivityResultCallback)localObject1).OooO00o(localObject2);
          localObject2 = this.OooO0o0;
          ((ArrayList)localObject2).remove(paramString);
          return;
        }
      }
    }
    this.OooO0oO.remove(paramString);
    paramCallbackAndContract = this.OooO0oo;
    Object localObject1 = new androidx/activity/result/ActivityResult;
    ((ActivityResult)localObject1).<init>(paramInt, paramIntent);
    paramCallbackAndContract.putParcelable(paramString, (Parcelable)localObject1);
  }
  
  public abstract void OooO0o(int paramInt, ActivityResultContract paramActivityResultContract, Object paramObject, ActivityOptionsCompat paramActivityOptionsCompat);
  
  public final int OooO0o0()
  {
    Random localRandom = this.OooO00o;
    int i = 2147418112;
    int j = localRandom.nextInt(i);
    int k = 65536;
    for (;;)
    {
      j += k;
      Map localMap = this.OooO0O0;
      Integer localInteger = Integer.valueOf(j);
      boolean bool = localMap.containsKey(localInteger);
      if (!bool) {
        break;
      }
      localRandom = this.OooO00o;
      j = localRandom.nextInt(i);
    }
    return j;
  }
  
  public final void OooO0oO(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    ArrayList localArrayList1 = paramBundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
    ArrayList localArrayList2 = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
    if ((localArrayList2 != null) && (localArrayList1 != null))
    {
      Object localObject1 = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
      this.OooO0o0 = ((ArrayList)localObject1);
      localObject1 = (Random)paramBundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
      this.OooO00o = ((Random)localObject1);
      localObject1 = this.OooO0oo;
      Object localObject2 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
      paramBundle = paramBundle.getBundle((String)localObject2);
      ((Bundle)localObject1).putAll(paramBundle);
      int i = 0;
      paramBundle = null;
      for (;;)
      {
        int j = localArrayList2.size();
        if (i >= j) {
          break;
        }
        localObject1 = (String)localArrayList2.get(i);
        localObject2 = this.OooO0OO;
        boolean bool2 = ((Map)localObject2).containsKey(localObject1);
        if (bool2)
        {
          localObject2 = (Integer)this.OooO0OO.remove(localObject1);
          Bundle localBundle = this.OooO0oo;
          boolean bool1 = localBundle.containsKey((String)localObject1);
          if (!bool1)
          {
            localObject1 = this.OooO0O0;
            ((Map)localObject1).remove(localObject2);
          }
        }
        localObject1 = (Integer)localArrayList1.get(i);
        int k = ((Integer)localObject1).intValue();
        localObject2 = (String)localArrayList2.get(i);
        OooO00o(k, (String)localObject2);
        i += 1;
      }
    }
  }
  
  public final void OooO0oo(Bundle paramBundle)
  {
    Object localObject1 = new java/util/ArrayList;
    Object localObject2 = this.OooO0OO.values();
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    paramBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", (ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    localObject2 = this.OooO0OO.keySet();
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", (ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    localObject2 = this.OooO0o0;
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", (ArrayList)localObject1);
    localObject1 = (Bundle)this.OooO0oo.clone();
    paramBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)localObject1);
    localObject2 = this.OooO00o;
    paramBundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", (Serializable)localObject2);
  }
  
  public final ActivityResultLauncher OooOO0(String paramString, LifecycleOwner paramLifecycleOwner, ActivityResultContract paramActivityResultContract, ActivityResultCallback paramActivityResultCallback)
  {
    Object localObject = paramLifecycleOwner.getLifecycle();
    Lifecycle.State localState1 = ((Lifecycle)localObject).getCurrentState();
    Lifecycle.State localState2 = Lifecycle.State.o00Ooo0O;
    boolean bool = localState1.OooO0OO(localState2);
    if (!bool)
    {
      OooOO0O(paramString);
      paramLifecycleOwner = (ActivityResultRegistry.LifecycleContainer)this.OooO0Oo.get(paramString);
      if (paramLifecycleOwner == null)
      {
        paramLifecycleOwner = new androidx/activity/result/ActivityResultRegistry$LifecycleContainer;
        paramLifecycleOwner.<init>((Lifecycle)localObject);
      }
      localObject = new androidx/activity/result/ActivityResultRegistry$1;
      ((ActivityResultRegistry.1)localObject).<init>(this, paramString, paramActivityResultCallback, paramActivityResultContract);
      paramLifecycleOwner.OooO00o((LifecycleEventObserver)localObject);
      this.OooO0Oo.put(paramString, paramLifecycleOwner);
      paramLifecycleOwner = new androidx/activity/result/ActivityResultRegistry$2;
      paramLifecycleOwner.<init>(this, paramString, paramActivityResultContract);
      return paramLifecycleOwner;
    }
    paramString = new java/lang/IllegalStateException;
    paramActivityResultContract = new java/lang/StringBuilder;
    paramActivityResultContract.<init>();
    paramActivityResultContract.append("LifecycleOwner ");
    paramActivityResultContract.append(paramLifecycleOwner);
    paramActivityResultContract.append(" is attempting to register while current state is ");
    paramLifecycleOwner = ((Lifecycle)localObject).getCurrentState();
    paramActivityResultContract.append(paramLifecycleOwner);
    paramActivityResultContract.append(". LifecycleOwners must call register before they are STARTED.");
    paramLifecycleOwner = paramActivityResultContract.toString();
    paramString.<init>(paramLifecycleOwner);
    throw paramString;
  }
  
  public final void OooOO0O(String paramString)
  {
    Integer localInteger = (Integer)this.OooO0OO.get(paramString);
    if (localInteger != null) {
      return;
    }
    int i = OooO0o0();
    OooO00o(i, paramString);
  }
  
  public final void OooOO0o(String paramString)
  {
    Object localObject1 = this.OooO0o0;
    boolean bool = ((ArrayList)localObject1).contains(paramString);
    if (!bool)
    {
      localObject1 = (Integer)this.OooO0OO.remove(paramString);
      if (localObject1 != null)
      {
        localObject2 = this.OooO0O0;
        ((Map)localObject2).remove(localObject1);
      }
    }
    this.OooO0o.remove(paramString);
    localObject1 = this.OooO0oO;
    bool = ((Map)localObject1).containsKey(paramString);
    Object localObject2 = ": ";
    String str = "Dropping pending result for request ";
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(str);
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append((String)localObject2);
      Object localObject3 = this.OooO0oO.get(paramString);
      ((StringBuilder)localObject1).append(localObject3);
      localObject1 = this.OooO0oO;
      ((Map)localObject1).remove(paramString);
    }
    localObject1 = this.OooO0oo;
    bool = ((BaseBundle)localObject1).containsKey(paramString);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(str);
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.OooO0oo.getParcelable(paramString);
      ((StringBuilder)localObject1).append(localObject2);
      localObject1 = this.OooO0oo;
      ((Bundle)localObject1).remove(paramString);
    }
    localObject1 = (ActivityResultRegistry.LifecycleContainer)this.OooO0Oo.get(paramString);
    if (localObject1 != null)
    {
      ((ActivityResultRegistry.LifecycleContainer)localObject1).OooO0O0();
      localObject1 = this.OooO0Oo;
      ((Map)localObject1).remove(paramString);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry
 * JD-Core Version:    0.7.0.1
 */