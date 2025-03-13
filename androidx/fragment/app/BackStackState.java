package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final List o00OoOoo;
  public final List o00Ooo00;
  
  static
  {
    BackStackState.1 local1 = new androidx/fragment/app/BackStackState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BackStackState(Parcel paramParcel)
  {
    Object localObject = paramParcel.createStringArrayList();
    this.o00OoOoo = ((List)localObject);
    localObject = BackStackRecordState.CREATOR;
    paramParcel = paramParcel.createTypedArrayList((Parcelable.Creator)localObject);
    this.o00Ooo00 = paramParcel;
  }
  
  public BackStackState(List paramList1, List paramList2)
  {
    this.o00OoOoo = paramList1;
    this.o00Ooo00 = paramList2;
  }
  
  public List OooO00o(FragmentManager paramFragmentManager, Map paramMap)
  {
    HashMap localHashMap = new java/util/HashMap;
    int i = this.o00OoOoo.size();
    localHashMap.<init>(i);
    Iterator localIterator = this.o00OoOoo.iterator();
    boolean bool;
    Object localObject1;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = (Fragment)paramMap.get(localObject1);
      if (localObject2 != null)
      {
        localObject1 = ((Fragment)localObject2).mWho;
        localHashMap.put(localObject1, localObject2);
      }
      else
      {
        localObject2 = paramFragmentManager.getFragmentStore();
        Object localObject3 = null;
        localObject1 = ((FragmentStore)localObject2).OooOo0O((String)localObject1, null);
        if (localObject1 != null)
        {
          localObject2 = paramFragmentManager.getHost().getContext().getClassLoader();
          localObject3 = (FragmentState)((Bundle)localObject1).getParcelable("state");
          Object localObject4 = paramFragmentManager.getFragmentFactory();
          localObject3 = ((FragmentState)localObject3).OooO00o((FragmentFactory)localObject4, (ClassLoader)localObject2);
          ((Fragment)localObject3).mSavedFragmentState = ((Bundle)localObject1);
          localObject4 = "savedInstanceState";
          Bundle localBundle1 = ((Bundle)localObject1).getBundle((String)localObject4);
          if (localBundle1 == null)
          {
            localBundle1 = ((Fragment)localObject3).mSavedFragmentState;
            Bundle localBundle2 = new android/os/Bundle;
            localBundle2.<init>();
            localBundle1.putBundle((String)localObject4, localBundle2);
          }
          localObject4 = "arguments";
          localObject1 = ((Bundle)localObject1).getBundle((String)localObject4);
          if (localObject1 != null) {
            ((Bundle)localObject1).setClassLoader((ClassLoader)localObject2);
          }
          ((Fragment)localObject3).setArguments((Bundle)localObject1);
          localObject1 = ((Fragment)localObject3).mWho;
          localHashMap.put(localObject1, localObject3);
        }
      }
    }
    paramMap = new java/util/ArrayList;
    paramMap.<init>();
    localIterator = this.o00Ooo00.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = ((BackStackRecordState)localIterator.next()).OooO0Oo(paramFragmentManager, localHashMap);
      paramMap.add(localObject1);
    }
    return paramMap;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    List localList = this.o00OoOoo;
    paramParcel.writeStringList(localList);
    localList = this.o00Ooo00;
    paramParcel.writeTypedList(localList);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.BackStackState
 * JD-Core Version:    0.7.0.1
 */