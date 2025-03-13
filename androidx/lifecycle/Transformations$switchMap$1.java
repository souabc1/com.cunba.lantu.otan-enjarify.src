package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Transformations$switchMap$1
  implements Observer
{
  public LiveData OooO00o;
  
  public void OooO00o(Object paramObject)
  {
    paramObject = (LiveData)this.OooO0O0.invoke(paramObject);
    Object localObject1 = this.OooO00o;
    if (localObject1 == paramObject) {
      return;
    }
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.OooO0OO;
      Intrinsics.OooO0OO(localObject1);
      ((MediatorLiveData)localObject2).OooOOO((LiveData)localObject1);
    }
    this.OooO00o = paramObject;
    if (paramObject != null)
    {
      localObject1 = this.OooO0OO;
      Intrinsics.OooO0OO(paramObject);
      localObject2 = new androidx/lifecycle/Transformations$switchMap$1$onChanged$1;
      Object localObject3 = this.OooO0OO;
      ((Transformations.switchMap.1.onChanged.1)localObject2).<init>((MediatorLiveData)localObject3);
      localObject3 = new androidx/lifecycle/Transformations$sam$androidx_lifecycle_Observer$0;
      ((Transformations.sam.androidx_lifecycle_Observer.0)localObject3).<init>((Function1)localObject2);
      ((MediatorLiveData)localObject1).OooOOO0(paramObject, (Observer)localObject3);
    }
  }
  
  public final LiveData getLiveData()
  {
    return this.OooO00o;
  }
  
  public final void setLiveData(LiveData paramLiveData)
  {
    this.OooO00o = paramLiveData;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.Transformations.switchMap.1
 * JD-Core Version:    0.7.0.1
 */