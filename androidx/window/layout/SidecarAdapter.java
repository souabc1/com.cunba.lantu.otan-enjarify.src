package androidx.window.layout;

import androidx.window.core.Bounds;
import androidx.window.core.SpecificationComputer;
import androidx.window.core.SpecificationComputer.Companion;
import androidx.window.core.SpecificationComputer.VerificationMode;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarAdapter
{
  public static final SidecarAdapter.Companion OooO0O0;
  public static final String OooO0OO = SidecarAdapter.class.getSimpleName();
  public final SpecificationComputer.VerificationMode OooO00o;
  
  static
  {
    SidecarAdapter.Companion localCompanion = new androidx/window/layout/SidecarAdapter$Companion;
    localCompanion.<init>(null);
    OooO0O0 = localCompanion;
  }
  
  public SidecarAdapter()
  {
    this(null, 1, null);
  }
  
  public SidecarAdapter(SpecificationComputer.VerificationMode paramVerificationMode)
  {
    this.OooO00o = paramVerificationMode;
  }
  
  public final boolean OooO00o(SidecarDeviceState paramSidecarDeviceState1, SidecarDeviceState paramSidecarDeviceState2)
  {
    boolean bool1 = Intrinsics.OooO00o(paramSidecarDeviceState1, paramSidecarDeviceState2);
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    bool1 = false;
    if (paramSidecarDeviceState1 == null) {
      return false;
    }
    if (paramSidecarDeviceState2 == null) {
      return false;
    }
    SidecarAdapter.Companion localCompanion = OooO0O0;
    int i = localCompanion.OooO0O0(paramSidecarDeviceState1);
    int j = localCompanion.OooO0O0(paramSidecarDeviceState2);
    if (i != j) {
      bool2 = false;
    }
    return bool2;
  }
  
  public final boolean OooO0O0(SidecarDisplayFeature paramSidecarDisplayFeature1, SidecarDisplayFeature paramSidecarDisplayFeature2)
  {
    boolean bool = Intrinsics.OooO00o(paramSidecarDisplayFeature1, paramSidecarDisplayFeature2);
    if (bool) {
      return true;
    }
    bool = false;
    if (paramSidecarDisplayFeature1 == null) {
      return false;
    }
    if (paramSidecarDisplayFeature2 == null) {
      return false;
    }
    int i = paramSidecarDisplayFeature1.getType();
    int j = paramSidecarDisplayFeature2.getType();
    if (i != j) {
      return false;
    }
    paramSidecarDisplayFeature1 = paramSidecarDisplayFeature1.getRect();
    paramSidecarDisplayFeature2 = paramSidecarDisplayFeature2.getRect();
    return Intrinsics.OooO00o(paramSidecarDisplayFeature1, paramSidecarDisplayFeature2);
  }
  
  public final boolean OooO0OO(List paramList1, List paramList2)
  {
    boolean bool1 = true;
    if (paramList1 == paramList2) {
      return bool1;
    }
    if (paramList1 == null) {
      return false;
    }
    if (paramList2 == null) {
      return false;
    }
    int i = paramList1.size();
    int j = paramList2.size();
    if (i != j) {
      return false;
    }
    i = paramList1.size();
    j = 0;
    SidecarDisplayFeature localSidecarDisplayFeature1 = null;
    while (j < i)
    {
      int k = j + 1;
      SidecarDisplayFeature localSidecarDisplayFeature2 = (SidecarDisplayFeature)paramList1.get(j);
      localSidecarDisplayFeature1 = (SidecarDisplayFeature)paramList2.get(j);
      boolean bool2 = OooO0O0(localSidecarDisplayFeature2, localSidecarDisplayFeature1);
      if (!bool2) {
        return false;
      }
      bool2 = k;
    }
    return bool1;
  }
  
  public final boolean OooO0Oo(SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo1, SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo2)
  {
    boolean bool = Intrinsics.OooO00o(paramSidecarWindowLayoutInfo1, paramSidecarWindowLayoutInfo2);
    if (bool) {
      return true;
    }
    bool = false;
    SidecarAdapter.Companion localCompanion = null;
    if (paramSidecarWindowLayoutInfo1 == null) {
      return false;
    }
    if (paramSidecarWindowLayoutInfo2 == null) {
      return false;
    }
    localCompanion = OooO0O0;
    paramSidecarWindowLayoutInfo1 = localCompanion.OooO0OO(paramSidecarWindowLayoutInfo1);
    paramSidecarWindowLayoutInfo2 = localCompanion.OooO0OO(paramSidecarWindowLayoutInfo2);
    return OooO0OO(paramSidecarWindowLayoutInfo1, paramSidecarWindowLayoutInfo2);
  }
  
  public final List OooO0o(List paramList, SidecarDeviceState paramSidecarDeviceState)
  {
    Intrinsics.OooO0o(paramList, "sidecarDisplayFeatures");
    Intrinsics.OooO0o(paramSidecarDeviceState, "deviceState");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (SidecarDisplayFeature)paramList.next();
      localObject = OooO0oO((SidecarDisplayFeature)localObject, paramSidecarDeviceState);
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public final WindowLayoutInfo OooO0o0(SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo, SidecarDeviceState paramSidecarDeviceState)
  {
    Object localObject = "state";
    Intrinsics.OooO0o(paramSidecarDeviceState, (String)localObject);
    if (paramSidecarWindowLayoutInfo == null)
    {
      paramSidecarWindowLayoutInfo = new androidx/window/layout/WindowLayoutInfo;
      paramSidecarDeviceState = CollectionsKt.OooO0oo();
      paramSidecarWindowLayoutInfo.<init>(paramSidecarDeviceState);
      return paramSidecarWindowLayoutInfo;
    }
    localObject = new androidx/window/sidecar/SidecarDeviceState;
    ((SidecarDeviceState)localObject).<init>();
    SidecarAdapter.Companion localCompanion = OooO0O0;
    int i = localCompanion.OooO0O0(paramSidecarDeviceState);
    localCompanion.OooO0Oo((SidecarDeviceState)localObject, i);
    paramSidecarWindowLayoutInfo = localCompanion.OooO0OO(paramSidecarWindowLayoutInfo);
    paramSidecarWindowLayoutInfo = OooO0o(paramSidecarWindowLayoutInfo, (SidecarDeviceState)localObject);
    paramSidecarDeviceState = new androidx/window/layout/WindowLayoutInfo;
    paramSidecarDeviceState.<init>(paramSidecarWindowLayoutInfo);
    return paramSidecarDeviceState;
  }
  
  public final DisplayFeature OooO0oO(SidecarDisplayFeature paramSidecarDisplayFeature, SidecarDeviceState paramSidecarDeviceState)
  {
    Intrinsics.OooO0o(paramSidecarDisplayFeature, "feature");
    Intrinsics.OooO0o(paramSidecarDeviceState, "deviceState");
    Object localObject1 = SpecificationComputer.OooO00o;
    String str = OooO0OO;
    Intrinsics.OooO0o0(str, "TAG");
    Object localObject2 = this.OooO00o;
    int i = 4;
    Object localObject3 = paramSidecarDisplayFeature;
    Object localObject4 = SpecificationComputer.Companion.OooO0O0((SpecificationComputer.Companion)localObject1, paramSidecarDisplayFeature, str, (SpecificationComputer.VerificationMode)localObject2, null, i, null);
    localObject3 = SidecarAdapter.translate.checkedFeature.1.o00OoOoo;
    localObject4 = ((SpecificationComputer)localObject4).OooO0OO("Type must be either TYPE_FOLD or TYPE_HINGE", (Function1)localObject3);
    localObject3 = SidecarAdapter.translate.checkedFeature.2.o00OoOoo;
    localObject4 = ((SpecificationComputer)localObject4).OooO0OO("Feature bounds must not be 0", (Function1)localObject3);
    localObject3 = SidecarAdapter.translate.checkedFeature.3.o00OoOoo;
    localObject4 = ((SpecificationComputer)localObject4).OooO0OO("TYPE_FOLD must have 0 area", (Function1)localObject3);
    localObject3 = SidecarAdapter.translate.checkedFeature.4.o00OoOoo;
    localObject4 = (SidecarDisplayFeature)((SpecificationComputer)localObject4).OooO0OO("Feature be pinned to either left or top", (Function1)localObject3).OooO00o();
    localObject1 = null;
    if (localObject4 == null) {
      return null;
    }
    int j = ((SidecarDisplayFeature)localObject4).getType();
    int k = 2;
    int m = 1;
    if (j != m)
    {
      if (j != k) {
        return null;
      }
      localObject4 = HardwareFoldingFeature.Type.OooO0O0.getHINGE();
    }
    else
    {
      localObject4 = HardwareFoldingFeature.Type.OooO0O0.getFOLD();
    }
    localObject2 = OooO0O0;
    int n = ((SidecarAdapter.Companion)localObject2).OooO0O0(paramSidecarDeviceState);
    if ((n != 0) && (n != m))
    {
      if (n != k)
      {
        k = 3;
        if (n != k)
        {
          k = 4;
          if (n == k) {
            return localObject1;
          }
        }
        paramSidecarDeviceState = FoldingFeature.State.OooO0OO;
      }
      else
      {
        paramSidecarDeviceState = FoldingFeature.State.OooO0Oo;
      }
      localObject1 = new androidx/window/layout/HardwareFoldingFeature;
      localObject3 = new androidx/window/core/Bounds;
      paramSidecarDisplayFeature = paramSidecarDisplayFeature.getRect();
      str = "feature.rect";
      Intrinsics.OooO0o0(paramSidecarDisplayFeature, str);
      ((Bounds)localObject3).<init>(paramSidecarDisplayFeature);
      ((HardwareFoldingFeature)localObject1).<init>((Bounds)localObject3, (HardwareFoldingFeature.Type)localObject4, paramSidecarDeviceState);
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarAdapter
 * JD-Core Version:    0.7.0.1
 */